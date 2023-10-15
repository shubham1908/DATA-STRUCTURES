public class Stack {

    private int capacity;
    private int[] arr;

    private int pointer;

    Stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.pointer = -1;
    }

    public void push(int number) throws Exception {
        if(this.pointer+1 == this.capacity){
            throw new Exception("Stack overflow!");
        }
        this.pointer++;
        this.arr[this.pointer] = number;
    }

    public int pop() throws Exception {
        if (this.pointer == -1){
            throw new Exception("Stack underflow!");
        }
        int x = this.arr[this.pointer];
        this.pointer--;
        return x;
    }

    public int top() throws Exception {
        if (this.pointer == -1){
            throw new Exception("Stack underflow!");
        }
        return this.arr[this.pointer];
    }

    public void showStack() {
        if (this.pointer == -1){
            System.out.println("Nothing to show, stack is empty!");
            return;
        }
        for(int i=0;i<=this.pointer;i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
