/**
 * Queue Data Structure
 */

public class Queue {
    //array to store queue elements
    private int[] list = new int[10];
    //list pointer
    private int top = 0;

    public void enqueue(int a)  {
        if (this.top == this.list.length) {
            //storing all elements in a temporary array
            int[] shorterList = this.list;

            //creating larger array - "2x"
            this.list = new int[this.list.length * 2];

            //sending elements to larger array
            for (int i = 0; i < this.top; i++) {
                this.list[i] = shorterList[i];
            }
        }
        this.list[this.top] = a;
        this.top++;
    }


    public int dequeue() {
        int removedElement = this.peek();
        //if not empty
        if (!isEmpty()) {
            //shift all elements by one to left
            for(int i = 1; i < this.list.length; i++) {
                this.list[i - 1] = this.list[i];
            }
            this.top--;
        }
        return removedElement;

    }


    public int peek() {
        //if the array is empty
        if (isEmpty()) {
            System.out.println("No elements in the array");
            return -1;
        }

        return this.list[0];
    }


    public int size() {
        return this.top;
    }


    public boolean isEmpty() {
        return (this.top == 0);
    }

    //for testing
    public void printArray() {
        for(int i = 0; i < this.list.length; i++){
            System.out.println( (i+1)  + ") " + this.list[i]);
        }
    }
}