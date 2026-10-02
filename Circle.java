import java.awt.Graphics;
class Circle implements Shape {
    final int radius;
    final Posn center;
  
    // Constructor
    Circle(int r, Posn c) { 
      radius = r; 
      center = c; 
    }
  
    // Drawing logic using Java's graphics API
    public void draw(Graphics g) {
      g.drawOval(center.x - radius,
                 center.y - radius,
                 2 * radius, 2 * radius);
    }
  }

//Explanation: drawOval() draws an ellips fitting inside a bounding box.
//(x-r, y-r) palces the circle entered on thr Posn.
