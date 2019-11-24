public class InitialCapitalize{
    public static String stringCapitalize(String s){
        StringBuilder f = new StringBuilder();
        
        
        f.append(Character.toUpperCase(s.charAt(0)));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == ' ' && s.charAt(i) != ' ')
                f.append(Character.toUpperCase(s.charAt(i)));
            else
                f.append(s.charAt(i));        
        }
        
        return f.toString(); 
    }

    public static void main(String[] args){
        String string = "this is an amazing example";
        System.out.println(stringCapitalize(string));
        
    }

}