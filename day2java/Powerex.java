public class Powerex {
    public static int power(int base,int exponent){
        int result=1;
        
        for(int i=0;i<=exponent;i++){
            result = result*base;
        }
        return result;
    }
    public static void main(String[] args){
        int res = power(2,3);
        System.out.println(res);
    }
}
