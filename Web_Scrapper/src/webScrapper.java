import java.io.FileWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.opencsv.CSVWriter;

public class webScrapper {
	public static void main(String[] args) {
		final String URL = "https://web.archive.org/web/20190104110157/http://shares.telegraph.co.uk/indices/?index=MCX";

		try {
			FileWriter fileWriter = new FileWriter("data.csv");
			CSVWriter csvWriter = new CSVWriter(fileWriter);
			ArrayList<String[]> data = new ArrayList<>();
			data.add(new String[] {"Ticker", "Name", "Price"});

			final Document doc = Jsoup.connect(URL).get();
			// System.out.println(doc.outerHtml()); //To print the website html

			for (Element row : doc.select("table.tablesorter.full tr")) { // traversing each row from table
				if (row.select("td:nth-of-type(1)").text().equals("")) { // if row is empty
					continue;
				} else {
					final String ticker = row.select("td:nth-of-type(1)").text();
					// System.out.println(ticker);

					final String name = row.select("td:nth-of-type(2)").text();
					// System.out.println(name);

//					final double price = Double
//							.parseDouble(row.select("td.right:nth-of-type(3)").text().replace(",", ""));
					final String price = row.select("td.right:nth-of-type(3)").text().replace(",", "");
					// System.out.println(price);

					// final double change =
					// Double.parseDouble(row.select("td.right.change-up:nth-of-type(5)").text());
					// System.out.println(change);

//					System.out.println(ticker + " " + name + " " + price);
					data.add(new String[] {ticker, name, price});
				}
			}
			csvWriter.writeAll(data);
			csvWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
