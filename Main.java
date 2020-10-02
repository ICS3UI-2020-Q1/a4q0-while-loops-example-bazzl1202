import java.util.Scanner;
/**
 * While loop example
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // declare the variable
    int upTo;
    do{
      System.out.println("What number to count to (positive number)?");
      upTo = input.nextInt();
    }while(upTo <= 0);



















    // create a variable to keep track of the number 
    int count = 1;

   // using a loop to count up to five
    while( count <= upTo ){
      // print the number we are at
      System.out.println(count);
      // increase the value of count by 1
      count = count + 1;
    }
    System.out.println("All done");

    
    //do while loop
    int countTwo = 1;
    //do while loop to count
    do{
      // print the number
      System.out.println(countTwo);
      // increment the counter
      countTwo = countTwo + 1;
    }while(countTwo <= upTo);
    System.out.println("All done again");



  }
}
