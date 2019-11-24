public class Anagram{
    public static Boolean isAnagram(String s, String c){
        Boolean check = false;
        
        for(int i = 0; i < s.length() && i < c.length() && s.length() == c.length(); i++){
            check = false;
            
            if(s.indexOf(c.charAt(i)) != -1)
                check = true;
        }
    
        return check;
    }

    public static void main(String[] args){
        String string = "anna";
        String anagram = "nana";
        
        if(isAnagram(string, anagram))
            System.out.println(anagram + " is the anagram of " + string);
        else
            System.out.println(anagram + " is not the anagram of " + string);
    }
}