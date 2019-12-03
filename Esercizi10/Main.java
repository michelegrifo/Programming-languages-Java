public class Main{
    public static void main(String[] args){
        Stack<Integer> numbers = new ArrayListStack<>();
        Stack<String> numbers2 = new LinkedListStack<>(); 
        Stack<Integer> numbers3 = new ArrayStack<>();

        for(int i = 0; i < 50; i++)
            numbers.push(i);

        System.out.println("Size:" + numbers.size());
        
        while(!numbers.isEmpty())
            System.out.println(numbers.pop());
        
        for(int i = 0; i < 50; i++)
            numbers2.push("Number: " + i);

        
        System.out.println("Size:" + numbers2.size());
        
        while(!numbers2.isEmpty())
            System.out.println(numbers2.pop());
        
        for(int i = 0; i < 10; i++)
            numbers3.push(i);

        while(!numbers3.isEmpty())
            System.out.println(numbers3.pop());
        
    }
}