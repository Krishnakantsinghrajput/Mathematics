public class Factorial_recursion {
    public static void main(String args[]){
        int n=5;
        int Factorial=Factorial_Find(n);
        System.out.println(Factorial);
    }

    public static int Factorial_Find(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial_Find(n-1);
    }
}
