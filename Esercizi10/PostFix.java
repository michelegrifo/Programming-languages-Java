import java.util.*;
import Stack.ArrayListStack;

public class PostFix{

	public static void main(String args[]){
		System.out.println("Enter the postfix expression");
		Scanner input = new Scanner(System.in);
		String expression = input.nextLine();
		ArrayListStack<Double> stack = new ArrayListStack<>();
	
		Scanner l = new Scanner(expression);
		while(l.hasNext()){
			int c = 0;
			
			while(l.hasNextDouble()){
				stack.push(Double.parseDouble(l.next()));
				c++;
				if(c > 2){
					throw new RuntimeException();
				}	
			}
	
			if(l.hasNext()){
				double value = 0;
				try{
					switch(l.next()){
						case("+"):
							value = (double) stack.pop() + stack.pop();
							break;
						case("-"):
							value = (double) stack.pop() - stack.pop();
							break;
						case("*"):
							value = (double) stack.pop() * stack.pop();
							break;	
						case("/"):
							value = (double) stack.pop() / stack.pop();
							break;	
					
					}	
				}
				catch(NoSuchElementException e){
					System.out.println("Incorrect expression");
				}

				stack.push(value);
			}	
			
		}
		
		System.out.println("Result: " + stack.pop());
	}
}