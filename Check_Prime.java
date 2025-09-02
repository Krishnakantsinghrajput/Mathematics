public class Check_Prime {
    public static void main(String[] args) {
        int n=12;
        boolean prime=isprime(n);
        System.out.println(prime);

    }

   public static boolean isprime(int n){
        if(n==1)
        return false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
