public class AllDivisor2 {
     
    public static void main(String[] args) {
        int n=15;
        printDivisor(n);
    }

    public static void printDivisor(int n){
        int i;
        for( i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
               
            }
        }
        i--;
           for( ;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i+" ");
               
        }

    }
    }
}


