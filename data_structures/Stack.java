package data_structures;

//push
//pop
//peek/top

//LIFO - last in first out

public class Stack {
  private int stackTop;
  private int stackSize;
  private int[] stackArr;

  public Stack(int size) {
    this.stackSize = size;
    this.stackArr = new int[stackSize];
    this.stackTop = this.stackArr.length - 1;
  }

  public void push(int number) {
    System.out.println("I am adding number: " + number);
    this.stackArr[++stackTop] = number;
  }
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(33);
    stack.push(346);
    stack.push(123);
    stack.push(657);

    for(int i = 0; i < stack.stackArr.length - 1; i++) {
      System.out.println(stack.stackArr[i]);
    }
  }
}
