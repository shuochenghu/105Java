
//import java.util.Scanner;
public class GradeBookTest
{ 
   // main method begins program execution
   public static void main(String[] args)
   {
      Date startDate = new Date(11, 23, 2016);
	   GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming", "GradeBookData2.txt", startDate);
      System.out.printf("Welcome to the grade book for%n%s%nStarted on: %s%n%n", 
         myGradeBook.getCourseName(), myGradeBook.getStartDate());
      myGradeBook.processGrades();
   } 
}