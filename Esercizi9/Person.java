public class Person implements Comparable<Person>{
    
    String name;
    String surname;
    
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }

    @Override
    public int compareTo(Person other){
        int cmp = surname.compareTo(other.surname);
        if(cmp == 0)
            cmp = name.compareTo(other.name);

        return cmp;    
    }


}