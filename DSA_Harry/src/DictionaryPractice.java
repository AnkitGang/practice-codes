import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
	public static void main(String[] args) {
		Map<String, String> engSpanDict = new HashMap<String, String>();
		engSpanDict.put("Monday", "Lunes");
		engSpanDict.put("Tuesday", "Martes");
		engSpanDict.put("Wednesday", "Miercoles");
		engSpanDict.put("Thursday", "Jueves");
		engSpanDict.put("Friday", "Viernes");
		engSpanDict.put("Saturday", "Sabado");
		engSpanDict.put("Sunday", "Domingo");
		
		System.out.println(engSpanDict.get("Monday"));
		System.out.println(engSpanDict.get("Tuesday"));
		System.out.println(engSpanDict.get("Wednesday"));
		System.out.println(engSpanDict.get("Thursday"));
		System.out.println(engSpanDict.get("Friday"));
		
		
		System.out.println(engSpanDict.keySet());//may not be in same order
		
		System.out.println(engSpanDict.values());//but the values corresponds in same order in which their keys are printed
		
		System.out.println("The size of our dictionary is :" + engSpanDict.size());
		
		System.out.println();
		System.out.println();
		
		//Shopping List
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Eggs"));
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
		shoppingList.remove("Eggs");
		
		shoppingList.replace("Bread", Boolean.FALSE);
		
		shoppingList.clear();
		
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.isEmpty());
	}
} 
