public class GCD {
    public static void main(String args[]){
        int a=5,b=10;
        int GCD=FindGCD(a, b);
        System.out.println(GCD);

    }

    public static int FindGCD(int a,int b){
        int gcd=Math.min(a, b);
        while(true){
            
            if(a%gcd==0 && b%gcd==0){
                break;
            }
             gcd--;
        }
       return gcd;
    }
  

}
