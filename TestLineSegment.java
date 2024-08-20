/* *****************************************
 *  File : TestLineSegment.java
 *  Author : Celia Ho 
 *  Last Modified : Thu 4 April 2024
 *  Description : 2) Create a TestLineSegment class - put in file TestLineSegment.java - test all functions. NOTE: You will need to have the Point class from the lab assignment to properly complete this lab. 
 * ******************************************/

public class TestLineSegment {

  // MAIN SECTION
  public static void main(String[] args) {

    // Create attributes for methods
    Point p1 = new Point(0, 0);
    Point p2 = new Point(-2, -6);
    Point p3 = new Point(6, 0);
    Point p4 = new Point (-6, 4);
    LineSegment line1 = new LineSegment(p1, p2);
    LineSegment line2 = new LineSegment(p3, p4); 

    // Exercise all methods
    
    System.out.println("Line 1 distance is: " + line1.distance());

    System.out.println("Line 1 slope is " + line1.slope());

    System.out.println("Line 1 offset is " + line1.offset() + "\n");

    System.out.println("Line 2 distance is: " + line2.distance());

    System.out.println("Line 2 slope is " + line2.slope());

    System.out.println("Line 2 offset is " + line2.offset() + "\n");

    System.out.println("Line 1 is the same as Line 2: " + line1.isEqual(line2));

    System.out.println("Line 1 is parallel to Line 2: " + line1.isParallel(line2));

    System.out.println("Line 1 is perpendicular to Line 2: " + line1.isPerpendicular(line2));
    
    try {
      System.out.println("Line 1 intersects Line 2 at: " + line1.intersectsAt(line2));
    } catch (OutOfBoundsException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }

  // MAIN ENDS
  }

// TestLineSegment CLASS ENDS
}