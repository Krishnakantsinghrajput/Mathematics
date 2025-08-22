public class PalindromeNumber {
    public static void main(String[] args) {
        int number=1221;
        boolean Palindrome=IsPalindrome(number);
        System.out.println(Palindrome);
    }

    public static boolean IsPalindrome(int x){
        int rev=0;
        int temp=x;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return (rev==x);
    }
}
