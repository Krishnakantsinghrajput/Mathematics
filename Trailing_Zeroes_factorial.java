public class Trailing_Zeroes_factorial {
    public static void main(String[] args) {
        int n=11;
        int CountOfZeroes=CountZeros(n);
        System.out.println(CountOfZeroes);
    }

    public static int CountZeros(int n){
      int fact=1;
      for(int i=2;i<=n;i++){
        fact=fact*i;
      }

      int res=0;
      while(fact%10==0){
        
        res++;
        fact/=10;
      }
      return res;
    }
    
}
