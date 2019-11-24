public class DeleteVocals{
    public static String deleteV(String s){
        return s.replaceAll("[aeiou]+", "");
    }

    public static void main(String args[]){
        String string = "Il casale si trova di fronte l'aiuola";
        System.out.println(deleteV(string));
    }
}   