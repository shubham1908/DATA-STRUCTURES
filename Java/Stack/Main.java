public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        try{
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.showStack();
            System.out.println(stack.pop());
            stack.showStack();
            stack.push(4);
            stack.showStack();
            System.out.println(stack.pop());
            stack.showStack();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
