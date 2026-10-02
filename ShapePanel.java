import javax.swing.*;
import java.awt.Graphics;
public class ShapePanel extends JPanel {
    private Shape[] shapes; //Array of shapes to draw

    public ShapePanel(Shape[] shapes){
        this.shapes = shapes;

    }

    //overriding painComponent for custom rendering
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g); //clear background
        for (Shape shape : shapes){
            shape.draw(g);//Polymorphic call to draw each shape
        }
    }

}

//oop concepts
//Polymorphism: each shape is drawn using its own logic.
//Encapsulation: drawing details hiden inside each class.
