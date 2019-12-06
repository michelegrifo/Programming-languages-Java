import java.util.*;
public class IntegerList{
    public static void findEven(List<Integer> l){
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            if(i.next() % 2 != 0)
                i.remove(); 
        }
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(); 
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(22);
        list.add(3);

        
        System.out.println("Initial arraylist:");
        for(Integer i : list)
            System.out.println(i);
        
        findEven(list);

        System.out.println("\nEven numbers:");
         for(Integer i : list)
            System.out.println(i);
    }

}