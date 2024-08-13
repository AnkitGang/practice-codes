package BackTracking;

import java.util.ArrayList;
import java.util.List;

//Leetcode ques
public class generateParenthesis {
	public List<String> generate_Parenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateBrackets(result, n, 0, 0, sb);
        return result;
    }
    
    private void generateBrackets(List<String> result, int n, int opening, int closing, StringBuilder output){
        //Termination Case
        if(output.length() == n*2){
            result.add(output.toString());
            return ;
        }
        
        //Can I Place opening
        if(opening <  n){
            output.append("(");
            generateBrackets(result, n, opening + 1, closing, output);
            //Stack Fall
            output.deleteCharAt(output.length() - 1);  //Undo (Bactrack and delete the last bracket so that it can be used for other outputs)
        }
        
        //Can I place Closing
        if(closing < opening){
            output.append(")");
            generateBrackets(result, n, opening, closing + 1, output);
            //Stack Fall
            output.deleteCharAt(output.length() - 1);  //Undo (Bactrack and delete the last bracket so that it can be used for other outputs)
        }
    }
    
    public static void main(String[] args) {
		generateParenthesis g = new generateParenthesis();
    	System.out.println(g.generate_Parenthesis(4));
	}
}
