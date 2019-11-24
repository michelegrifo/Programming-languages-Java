public class SumInt{
    public static int sumDigit(int n){
        
        String temp = String.valueOf(n);
        int f = 0;
        
        for(int i = 0; i < temp.length(); i++){
            f += Integer.parseInt("" + temp.charAt(i));
        }

        return f;
    }

    public static void main(String[] args){
        int number = 6710;
        System.out.println(sumDigit(number));
    }

}