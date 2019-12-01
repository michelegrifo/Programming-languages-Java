import java.util.*;

public class IntegerSet{
    
    static boolean consecutives(Set<Integer> s){
        for(int i = -10; i <= 10; i++){
            if(s.contains(i) && s.contains(i+1))
                return true; 
        }
    
        return false;
    }

    static boolean consecutives2(Set<Integer> s){
        /*for(Integer i: s){
            if(s.contains(i+1))
                return true;
        }
        return false;*/
        Iterator<Integer> i = s.iterator();

        while(i.hasNext()){
            if(s.contains(i.next() + 1))
                return true;
        }
        return false;
    }

    static void deleteEven(Set<Integer> s){
        Iterator<Integer> i = s.iterator();

        while(i.hasNext()){
            if((i.next() % 2) == 0)
                i.remove();
        }
    }

    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(4);
        numbers.add(13);
        
        System.out.println(consecutives(numbers));
        System.out.println(consecutives2(numbers));
        
        deleteEven(numbers);
        for(Integer i : numbers)
            System.out.println(i);
    }
}