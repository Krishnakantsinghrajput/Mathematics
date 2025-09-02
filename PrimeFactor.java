public class PrimeFactor {
    public static void main(String[] args) {
        int n=12;
        prime_factor_print_fun(n);
    }

    public static void prime_factor_print_fun(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }

            }
        }
    }
     public static boolean isPrime(int n){
        if(n==1)
        return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
