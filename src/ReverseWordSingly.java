public class ReverseWordSingly {
    public static void main(String[] args) {
        reverseWord("Hello World");
    }

    static  void  reverseWord(String word){
        char[] ch = word.toCharArray();
        System.out.println("Displaying as char Array");
        for (int i = ch.length-1; i >= 0;i--){
            if (ch[i] == ch[i+1]){

            }
            System.out.print(ch[i]);
        }
    }
}
