/* *****************************************
 *  File : LineSegment.java
 *  Author : Celia Ho	 
 *  Last Modified : Thu 4 April 2024
 *  Description : Create the LineSegment and associated OutofBoundsException from the UML found here: https://docs.google.com/document/d/1VAldvkfyRGvadxnmebvpf1WvGHETt3uX0EbWm5m88rY/edit?usp=sharing
 * 
 * Part 1
 * 1) Create the LineSegment class from the UML - put in file LineSegment.java
 * 2) Create a TestLineSegment class - put in file TestLineSegment.java - test all functions. NOTE: You will need to have the Point class from the lab assignment to properly complete this lab. 
 * 3) A line is the same as another line if the slope and offset are the same
 * 4) A line is parallel to another line if the slope is the same and the offset is different; parallel lines never intersect.
 * 5) A line is perpendicular to another line if the slope of the first line is the negative 1/slope of the second line 
 * 
 * Learning Outcomes: Create class from UML, Create class to test the created class, Include class instances as member variables in a class, Create class  that throws exception
 * 
 * LineSegment
- Point start;
- Point end;
- isSame(p1:Point, p2:Point): boolean
+ LineSegment(start: Point, end: Point)
+ distance(): double    // Calculate the length of the line segment
+ isEqual(line2: LineSegment) : boolean   // is this line segment the same as line2 segment (compare end points)
+ getStart() : Point
+ getEnd() : Point
+ slope() : double  // Calculates slope of line
+ offset() : double   // Calculates offset (+ b) of line y = mx + b
+ isParallel(line2: LineSegment) : boolean  // Is this line parallel to  line2
+ isPerpendicular(line2: LineSegment): boolean  // Is line2 perpendicular to line1?
+ intersectsAt(line2: LineSegment): Point   // Where 2 lines intersect (not 2 segments). 
Throw an OutOfBoundsException error if the point where the two lines intersect is not on either of the line segments given. UML for OutOfBoundsException is defined below.
 * 
 * OutOfBoundsException : Exception
- Point intersectionPoint // Intersection point
+ OutOfBoundsException(Point intersectionPoint) // sets error message that point is out of bounds of the lines, and adds the point
+ getPoint(): Point // return intersectionPoint
 *
 * look @ page 474 listing 12.10 InvalidRadiusException.java
 * ******************************************/

public class LineSegment {

  private Point 
    start,
    end;

  public LineSegment(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  private Boolean isSame(Point p1, Point p2) {
    if (p1.getX() == p2.getX() && p1.getY() == p2.getY())
      return true;
    return false;
  }

  public Point getStart() {
    return start;
  }

  public Point getEnd() {
    return end;
  }

  public double distance() { // Calc length of the line segment: distance = √[(x2 - x1)² + (y2 - y1)²]
    double xDiff = end.getX() - start.getX();
    double yDiff = end.getY() - start.getY();
    return Math.sqrt((Math.pow(xDiff, 2) + Math.pow(yDiff, 2)));
  }

  public double slope() { // Calc slope of line
    return (end.getY() - start.getY()) / (end.getX() - start.getX());
  }

  public double offset() { // Calc offset (+ b) of line y = mx + b: b = y - mx
    return start.getY() - (slope() * start.getX()); 
  }

  public Boolean isEqual(LineSegment line2) { // is this line segment the same as line2 segment (compare end points) 
  // 3. A line is the same as another line if the slope and offset are the same 
  //***ASK ALI: This does not prove the lines are the same
    if ((slope() == line2.slope()) && (offset() == line2.offset()))
      return true;
    else
      return false;
  }

  public boolean isParallel(LineSegment line2) { // Is this line parallel to  line2
  // 4. A line is parallel to another line if the slope is the same and the offset is different; parallel lines never intersect.
    if ((line2.slope() == slope()) && (line2.offset() != offset()))
      return true;
    else
      return false;

  }

  public boolean isPerpendicular(LineSegment line2) { // Is line2 perpendicular to line1?
  // 5. A line is perpendicular to another line if the slope of the first line is the negative 1/slope of the second line
    if (slope() == -(1 / line2.slope()))
      return true;
    else
      return false;
  }

  public Point intersectsAt(LineSegment line2) throws OutOfBoundsException { // Where 2 lines intersect (not 2 segments)
  // Throw an OutOfBoundsException error if the point where the two lines intersect is not on either of the line segments given. UML for OutOfBoundsException is defined below.

    // Find x-coordinate of intersection
    double x_intersection = (line2.offset() - offset()) / (slope() - line2.slope());

    // Find y-coordinate of intersection
    double y_intersection = slope() * x_intersection + offset();

    if ((x_intersection >= start.getX() && x_intersection <= end.getX()) || (x_intersection >= end.getX() && x_intersection <= start.getX()))
      return new Point (x_intersection, y_intersection);
  
    if ((x_intersection >= line2.start.getX() && x_intersection <= line2.end.getX()) || (x_intersection >= line2.end.getX() && x_intersection <= line2.start.getX()))
      return new Point (x_intersection, y_intersection); 

    throw new OutOfBoundsException(new Point (x_intersection, y_intersection));
  }
  
// LineSegment CLASS ENDS
}
