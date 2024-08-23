import java.util.Scanner;

public class Main {

  public static void main (String[] args) {
    System.out.println("Enter number of students> ");
    Scanner scan = new Scanner(System.in);
    int numOfStudents = scan.nextInt();
    String[] student = new String[numOfStudents];
    int[] age = new int[numOfStudents];
    Scanner scanName = new Scanner(System.in);
    Scanner scanAge = new Scanner(System.in);
    
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Enter student name> ");
      student[i] = scanName.nextLine();
      System.out.println("Enter age: ");
      age[i] = scanAge.nextInt();
    }
    
    for (int i = 0; i < numOfStudents; i++) {
      if (age[i] >= 16) {
        System.out.println(student[i] + " is eligible to recieve a vaccine");
        System.out.println("The student is " + age[i]);

    scan.close();
    scanName.close();
    scanAge.close();
      }
    }
  }
}
