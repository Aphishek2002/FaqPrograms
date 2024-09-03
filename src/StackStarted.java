import java.util.*;
public class StackStarted {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(23);
        stack1.push(33);
        stack1.push(45);
        stack1.push(57);
        stack1.push(69);
        System.out.println(stack1);
//        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1.peek());

     }

}
