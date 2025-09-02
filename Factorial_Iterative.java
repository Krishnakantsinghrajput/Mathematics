public class Factorial_Iterative {
    public static void main(String[] args) {
        int n=11;
        int Factorial=FindFactorial(n);
        System.out.println(Factorial);
    }

    public static int FindFactorial(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
