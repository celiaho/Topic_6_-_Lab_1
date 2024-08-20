/* *****************************************
 *  File : TestPoint.java
 *  Author : Celia Ho   
 *  Last Modified : Fri Mar 29 2024
 *  Description : Create a Point class and TestPoint testing class from the UML found here: https://docs.google.com/document/d/1Q6s5IVFrzXZ3IEGieSt_6Uxjjmstm1Da63rHymcDxPA/edit?usp=sharing
 * 
 * In a separate file create the program to test the Point class. Call it TestPoint. 
 * TestPoint should have:
 *    an array or arraylist of Points,
 *    translate at least 2 points.
 * ******************************************/


public class TestPoint {

  // MAIN SECTION
  public static void main(String[] args) {
    // Create an array of Points.
    Point[] pointsArray = new Point[3];

    pointsArray[0] = new Point(0.00, 0.00);
    pointsArray[1] = new Point(50.00, 50.00);
    pointsArray[2] = new Point(38.00, 126.00);

    System.out.print(pointsArray[0] + " translates to ");
    pointsArray[0].translate(5.00, 5.00);
    System.out.println(pointsArray[0]);
    
    System.out.print(pointsArray[1] + " translates to ");
    pointsArray[1].translate(10.00, 10.00);
    System.out.println(pointsArray[1]);
    // System.out.println(pointsArray[1].toString());  // Adding .toString yields the same result as line above

    System.out.print(pointsArray[2] + " translates to ");
    pointsArray[2].translate(160.00, 160.00);
    System.out.println(pointsArray[2]);
  }

// TestPoint CLASS ENDS
}