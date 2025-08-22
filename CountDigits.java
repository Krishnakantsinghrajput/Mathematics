class CountDigits{
    public static void main(String args[]){
        int x=-123789;
        int digit=DigitCount(x);
        System.out.println(digit);
    }

    public static int DigitCount(int x){
        int res=0;
        while(x!=0){
            x/=10;
            res++;
        }
return res;
    }
}