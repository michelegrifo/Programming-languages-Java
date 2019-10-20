public class UnaryNum{
    public static String changer(int n){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < n; i++){
            string.append(0);
        }
        return string.toString();
    }
    
    public static void main(String[] args){
        int number = 5;
        System.out.println(changer(number));
    }
}