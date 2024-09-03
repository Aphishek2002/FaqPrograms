public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAMe";
        System.out.println(str);
        int len = str.length();
        String og_str = str;
        String rev = "";
        for (int i = len - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reversed string :" +rev);
        if (og_str.equals(rev))
            System.out.println("This string is palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
