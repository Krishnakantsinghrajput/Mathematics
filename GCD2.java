public class GCD2 {
    public static void main(String[] args) {
        int a=5,b=10;
        int gcd=GCDFind(a, b);
        System.out.println(gcd);
    }
//Euclidean algorithm
    public static int GCDFind(int a,int b){
       while (a!=b) {
         if(a>b){
            a=a-b;
        }
    else{
        b=b-a;
    }
        
       }
       return a;
    }
}
