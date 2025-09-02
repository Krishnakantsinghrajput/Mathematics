public class AllDivisorOfNumber {
    public static void main(String[] args) {
        int n=15;
        printDivisor(n);
    }

    public static void printDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
