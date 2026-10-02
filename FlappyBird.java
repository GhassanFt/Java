import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener{ //inherit JPanel class, this allow us to define new calss with all functionalities of JPanel
     int boardHeight = 640;
     int boardWidth = 360; 

     //Images variables 
     Image backgroundImage;
     Image birdImage;
     Image toppipImage;
     Image bottompipImage;

     //Bird var
     int birdX = boardWidth/8; //from the left the bird position will be 1/8 away from the edge 
     int birdY = boardHeight/2; // will be in the middle of the page from top
     int birdWidth = 34;
     int birdHeight = 24;

     class Bird{
        //felder of the class
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;
        //konstruktor
        Bird(Image img){
            this.img = img;
        }
     }
     //gmae logic
     Bird bird;

     Timer gameLoop; // to change the staues of the bird every 60ms

     int velocityY = 0 ; //to move the bird

     int gravity = 1;


    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        
        setFocusable(true); // this make sure that our flappy class is the one that takes our Keyevents
        addKeyListener(this); // make sure we check the all key function (pressed released tapped)

        //load Images
        backgroundImage = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        toppipImage = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottompipImage = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
        //bird
        bird = new Bird(birdImage);
        gameLoop = new Timer(1000/60, this); //(this)will refer to flappybird calss, 60 ms
        // to start the gameloop
        gameLoop.start(); 
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        //background
        g.drawImage(backgroundImage, 0, 0, boardWidth, boardHeight, null);
        //bird
        g.drawImage(birdImage, birdX, birdY, bird.width, bird.height, null);
    }
    public void move(){ 
        //bird
        velocityY += gravity;
        birdY += velocityY; //update the bird's y position
        birdY = Math.max(birdY, 0);
        birdY = Math.min(birdY, 640);
    }
    @Override
    public void actionPerformed(ActionEvent e) {//this will be the action performed every 60ms
        move(); // before we want to update the screen we call move function to update the posn of bird
        repaint();       
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
        velocityY += -9;
    }
    }
    @Override
    public void keyTyped(KeyEvent e) { //cahr keys refers the value of the char
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
