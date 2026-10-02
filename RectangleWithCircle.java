import java.awt.Graphics;
//This class represents a rectangle that also contains a circle drwan inside
//it implements the shape interface to allow polymorphic drawing.
public class RectangleWithCircle {
    final Posn upperLeft;
    final Posn lowerRight;
//Constructor: takes two corner points of bounding box
    RectangleWithCircle(Posn ul, Posn lr){
        upperLeft = ul;
        lowerRight = lr;
    }
    //Draws both a rectangle and an oval (circle) inside the same boundring box.
public void draw(Graphics g){
    //Draw rectangle first
    g.drawRect(upperLeft.x, upperLeft.y,
                lowerRight.x - upperLeft.x,
                lowerRight.y - upperLeft.y);
//Then draw an oval(circle) in the same bounds
g.drawOval(upperLeft.x, upperLeft.y,
           lowerRight.x - upperLeft.x,
           lowerRight.y - upperLeft.y);
}
}
//Explaination: implements Shape: this makes sure your class can be used wherever a Shape is expected 
//draw(Graphics g ) this is the overrideen method from the Shape interface.
//drawRect(..) and drawOval(..): these both use the same bounding box.

//composite design: compines behavior multiple shapes in one
