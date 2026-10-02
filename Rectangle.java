import java.awt.Graphics;
class Rectangle implements Shape {
    final Posn upperLeft;
    final Posn lowerRight;

    Rectangle(Posn ul, Posn lr){
        upperLeft = ul;
        lowerRight = lr;
    }

    public void draw(Graphics g){
        g.drawRect(upperLeft.x, upperLeft.y,
                    lowerRight.x - upperLeft.x,
                    lowerRight.y - upperLeft.y);
    }
}
//Calculates width and height using two corner points.
