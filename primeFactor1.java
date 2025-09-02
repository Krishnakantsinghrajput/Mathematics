public class primeFactor1 {
    public static void main(String[] args) {
        int n=50;
        prime_factor_print_fun(n);
    }
 public static void prime_factor_print_fun(int n){
        for(int i=2;i*i<=n;i++){
          
               while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
               }
        }

        if(n>1){
            System.out.println(n);
        }
    }}
 

