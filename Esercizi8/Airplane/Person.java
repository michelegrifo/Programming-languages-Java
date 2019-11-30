public class Person{
    String name, surname;

    public Person(String name, String surname){
        System.out.print("\nName:");
        this.name = name;
        System.out.print("\nSurname:");
        this.surname = surname;
    }

    public Person(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = in.nextLine();
        System.out.println("Enter surname:");
        this.surname = in.nextLine();
        in.close();
    }

}