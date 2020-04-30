import java.util.Arrays;

/* 
*An exmaple of how to implement the Bubble sorting algorithm in Java
* @author Noah670
* 
*/
public class Bubbles {
  public static void main(String[] args) {
    System.out.println("A simple and fast Bubble Sort!");

    int[] SomeArrayTest = { 5, 2, 1, 4, 7, 3 };

    System.out.println("Here is some original unsorted array of numbers:");
    System.out.println(Arrays.toString(SomeArrayTest));

    Bubbles sortingTest = new Bubbles();
    sortingTest.bubbleSorting(SomeArrayTest);

    System.out.println("This array has now been sorted using Bubble Sort:");
    System.out.println(Arrays.toString(SomeArrayTest));

    System.out.println("Now check it out using a large unsorted list of 50 numbers");

    int[] largeTest = { 18, 46, 8, 20, 43, 38, 31, 22, 4, 3, 15, 45, 11, 24, 41, 25, 10, 23, 14, 44, 33, 2, 49, 6, 35,
        16, 19, 9, 48, 37, 30, 5, 36, 12, 40, 7, 28, 34, 17, 27, 13, 42, 32, 50, 1, 21, 26, 29, 39, 47 };

    System.out.println(Arrays.toString(largeTest));

    sortingTest.bubbleSorting(largeTest);
    System.out.println("Now this large list has been sorted!");
    System.out.println(Arrays.toString(largeTest));

  }

  public void bubbleSorting(int[] array) {

    boolean done = false;
    int temp; // store one of the array values to compare with the index

    while (!done) {
      done = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          done = false;
        }
      }
    }
  }

}