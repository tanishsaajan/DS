import java.util.*;
class Main
{

   static int EvalPostFix(String exp)
    {
         Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <exp.length() ; i++)
        {
            char c = exp.charAt(i);
 if(c=='+'||c=='-'||c=='/'||c=='*') 
 { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
            else 
            stack.push(c - '0'); 
            
    }
    
        return stack.pop();

}
	public static void main(String[] args) {
		System.out.println("Enter the required string");
Scanner s=new Scanner(System.in);
        String exp=s.next();
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + EvalPostFix(exp));
	}
}
