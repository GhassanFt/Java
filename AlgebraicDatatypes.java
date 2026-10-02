import javax.swing.JFrame;

public class AlgebraicDatatypes {

    // Example of pattern matching using 'instanceof' (Java 16+ syntax)
    public static void draw(Shape s) {
        if (s instanceof Rectangle r) {
            // You can add rectangle-specific logic here
            System.out.println("Drawing a rectangle.");
        } else if (s instanceof Circle c) {
            // Circle-specific logic
            System.out.println("Drawing a circle with radius: " + c.radius);
        }
        // No drawing happens here — this method is just an example of pattern matching
    }

    public static void main(String[] args) {
        // Create different shapes
        Shape s1 = new Rectangle(new Posn(20, 10), new Posn(90, 85));
        Shape s2 = new Circle(15, new Posn(30, 40));
        Shape s3 = new Circle(100, new Posn(50, 40));
        Shape s4 = new Circle(25, new Posn(80, 60));
        //Shape s5 = new RectangleWithCircle(new Posn(150, 150), new Posn(250, 250));

        // Store all shapes in an array (polymorphism in action!)
        Shape[] shapes = new Shape[] { s1, s2, s3, s4 };

        // Setup Swing window (JFrame)
        JFrame frame = new JFrame("Shapes"); // Window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit
        frame.add(new ShapePanel(shapes)); // Add custom panel for drawing shapes
        frame.setSize(400, 400); // Set window size
        frame.setVisible(true); // Make the window visible
    }
}

