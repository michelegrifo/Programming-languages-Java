import java.util.*;

public class SortPerson{
    static SortedSet<Person> toTreeSet(Set<Person> s, Comparator<Person> c){
        SortedSet<Person> tree = new TreeSet<>(c);
        tree.addAll(s);
        return tree;
    }

    public static void main(String[] args){
        Set <Person> Persons = new HashSet<>();
        Persons.add(new Person("Franco", "Giannini"));
        Persons.add(new Person("Mario", "Merola"));
        Persons.add(new Person("Pino", "Insegno"));
        Persons.add(new Person("Tony", "Merola"));

        System.out.println("Set's persons:");
        for(Person p : Persons)
            System.out.println(p);

        SortedSet<Person> result = toTreeSet(Persons, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.compareTo(p2);
            }
        });

        System.out.println("\nSorted persons:");
        for(Person p: result)
            System.out.println(p);

        
    }

}