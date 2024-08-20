/* *****************************************
 *  File : Point.java
 *  Author : Celia Ho   
 *  Last Modified : Fri Mar 29 2024
 *  Description : Create a Point class and TestPoint testing class from the UML found here: https://docs.google.com/document/d/1Q6s5IVFrzXZ3IEGieSt_6Uxjjmstm1Da63rHymcDxPA/edit?usp=sharing
 * 
 * Using this UML, create the Point class. 
 * In a separate file create the program to test the Point class.  Call it TestPoint. TestPoint should have:
 * an array or arraylist of Points,
 * translate at least 2 points.

Point
- x : double
- y : double
+ Point()         // Create point at 0,0
+ Point(x: double, y: double)
+ setPoint(x: double, y: double) : void
+ getX(): double
+ getY() : double
+ translate(dx: double, dy: double) void    // Change the Point from current position to position.x + dx, position.y + dy
+ toString(): String      // Returns string in format “(x, y)”

Learning Outcomes:
Simple class creation from UML
Create a test class to test created class
 * ******************************************/

public class Point {

  private double
    x,
    y;

  public Point() {    // Create point at 0,0
    x = 0.00;    // ***IS THIS CORRECT?
    y = 0.00; 
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void translate(double dx, double dy) {   // Change the Point from current position to position.x + dx, position.y + dy
    this.x = getX() + dx;
    this.y = getY() + dy;
  }

  @Override
  public String toString() {
    return "Point (" + x + ", " + y + ")";
  }

// Point CLASS ENDS
}