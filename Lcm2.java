public class Lcm2 {
    public static void main(String[] args) {
        int a=12,b=8;
        int lcm=FindLCM(a,b);
        System.out.println(lcm);
    }

    public static int Findgcd(int a,int b){
        int min=Math.min(a, b);
        if(b==0){
            return a;
        }
        return Findgcd(b,a%b);

      }
       public static int FindLCM(int a,int b){
        return (a*b)/Findgcd(a,b);
      }
}
