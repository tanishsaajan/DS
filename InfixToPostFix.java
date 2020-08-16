import java.util.*;

class Main
{
 static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
 }
   static String infixToPostFix(String exp)
    {
        String result="";
         Stack<Character> stack = new Stack<>();
        for (int i = 0; i <exp.length() ; i++) {
            char c = exp.charAt(i);

            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                    
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                    
                }
            }else if(c=='('){
                stack.push(c);
                
            }else{
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the required string");
		String exp = s.next();
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + infixToPostFix(exp));
	}
}
