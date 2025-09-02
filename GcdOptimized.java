public class GcdOptimized {
    public static void main(String[] args) {
        int a=12,b=60;
        int gcd=gcdFind(a, b);
        System.out.println(gcd);
    }

    public static int gcdFind(int a,int b){
        if(b==0){
            return a;
        }
        return gcdFind(b, a%b);
    }
}
