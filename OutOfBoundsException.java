/* *****************************************
 *  File : OutOfBoundsException.java
 *  Author : Celia Ho
 *  Last Modified : Thu 4 April 2024
 *  Description : OutOfBoundsException : Exception
- Point intersectionPoint // Intersection point
+ OutOfBoundsException(Point intersectionPoint) // sets error message that point is out of bounds of the lines, and adds the point
+ getPoint(): Point // return intersectionPoint

look @ page 474 listing 12.10 InvalidRadiusException.java 
 * ******************************************/

public class OutOfBoundsException extends Exception {

  // - Point intersectionPoint // Intersection point
  private Point intersectionPoint;

  // + OutOfBoundsException(Point intersectionPoint) // sets error message that point is out of bounds of the lines, and adds the point
  public OutOfBoundsException(Point intersectionPoint) { // sets error message that point is out of bounds of the lines, and adds the point
    super(intersectionPoint + " is out of bounds of the lines");
    // Code to get actual intersection point
    this.intersectionPoint = new Point(intersectionPoint.getX(), intersectionPoint.getY());
  }
  // + getPoint(): Point // return intersectionPoint
  public Point getPoint() { // return intersectionPoint
    return intersectionPoint;
  }

// OutOfBoundsException CLASS ENDS
}