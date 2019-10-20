public class InitialCapitalize{
    public static String stringCapitalize(String s){
        StringBuilder f = new StringBuilder(s);
        
        /*need fix
        f.toUpperCase(s.charAt(0));

        for(int i = 0; i < f.length(); i++){
            if(f.charAt(i).isBlank())
                f.charAt(i+1).toUpperCase(f.charAt(0));
        }
        
        return f.toString();*/ 
    }
}