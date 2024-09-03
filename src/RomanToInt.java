import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        HashMap<Character,Integer> table = new HashMap<>();
        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);
        String str = "IVI";
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            result += table.get(str.charAt(i));
            if(str.charAt(i) == 'V' && str.charAt(i-1) == 'I'){
                result = table.get(str.charAt(i)) - table.get(str.charAt(i - 1));
            }else
                result += table.get(str.charAt(i));
        }
        System.out.println(result);
    }
}
