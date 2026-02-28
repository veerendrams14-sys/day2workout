public class Primenum {
    public static void isPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count = count + 1;
            }
        }
            if(count == 2){
                System.out.println("true");
;            }else {
                System.out.println("false");
            }
        }
        public static void main(String[] args){
            isPrime(7);
        }
    }

