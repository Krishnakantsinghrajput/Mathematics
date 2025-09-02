public class Lcm_of_two_no {
    public static void main(String[] args) {
        int a=4,b=8;
        int lcm=FindLCM(a,b);
        System.out.println(lcm);
    }
     public static int FindLCM(int a,int b){
        int res=Math.max(a,b);
        while (true) {
            if(res%a==0 && res%b==0){
                return res;
            }

            res++;
            
        }
       
     
    }

   
}
