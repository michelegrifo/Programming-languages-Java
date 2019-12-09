import java.util.*;
import Stack.ArrayListStack;

public class InFix{
	static boolean isOperator(String e){
		return (e.equals("+")||e.equals("-")||e.equals("*")||e.equals("/")||e.equals("sqrt"));
	}
	
	public static void main(String[] args){
		ArrayListStack<String> operators = new ArrayListStack<String>();
		ArrayListStack<Double> numbers = new ArrayListStack<Double>(); 
		System.out.println("Enter expression:");
		Scanner input = new Scanner(System.in); 
		String exp = input.nextLine();

		
		Scanner l = new Scanner(exp);
		while(l.hasNext()){
			String element = l.next();
			if(element.equals("(")||element.equals(" "));
			
			else if(isOperator(element))
				operators.push(element); 	
			
			else if(element.equals(")")){
				String op = operators.pop();
				double n = numbers.pop();
				if(op.equals("+"))
					n = numbers.pop() + n;
				else if(op.equals("-"))
					n = numbers.pop() - n;
				else if(op.equals("*"))
					n = numbers.pop() * n;
				else if(op.equals("/"))
					n = numbers.pop() / n;
				else if(op.equals("sqrt"))
					n = Math.sqrt(n);

				numbers.push(n);
			}
			
			else
				numbers.push(Double.parseDouble(element));
		
		}

		System.out.println("Result: " + numbers.pop());

	}
}