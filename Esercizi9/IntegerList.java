import java.util.*;
public class IntegerList{
    public static void findEven(List<Integer> l){
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            if(i.next() % 2 != 0)
                i.remove(); 
        }
    }
    public static void deleteDuplicate(List<Integer> l){
        Collections.sort(l);
        ListIterator<Integer> i = l.listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(i.hasNext()){
                int next = i.next();
                if(n == next)
                    i.remove();
                i.previous();
            }
                
        }   
    }

    
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(); 
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(22);
        list.add(3);
        
        List<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(3);
        list2.add(2);
        list2.add(3);
        list2.add(55);

        
        System.out.println("Initial arraylist:");
        for(Integer i : list)
            System.out.println(i);
        
        findEven(list);

        System.out.println("\nEven numbers:");
         for(Integer i : list)
            System.out.println(i);
    
             
        System.out.println("\nInitial arraylist:");
        for(Integer i : list2)
            System.out.println(i);
        
        deleteDuplicate(list2);

        System.out.println("\nList without duplicate");
         for(Integer i : list2)
            System.out.println(i);
    
    
    
    }

}