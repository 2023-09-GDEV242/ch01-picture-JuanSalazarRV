/**
 * This image represents a usual game of Volleyball in the beach. You have two 
 * player going against each other in an intense match!
 * 
 * @author  Juan J Salazar
 * @version 09.01.2023
 */
public class Picture
{
    private Square netPoles;
    private Square sandField;
    private Square sandField2;
    private Square ocean;
    private Square upperNet;
    private Square sandField3;
    private Square netFiber;
    private Square sandField4;
    private Triangle netFiber2;
    private Triangle netFiber3;
    private Triangle netFiber4;
    private Triangle netFiber5;
    private Triangle netFiber6;
    private Triangle netFiber7;
    private Triangle netFiber8;
    private Triangle netFiber9;
    private Triangle netFiber10;
    private Triangle netFiber11;
    private Person player1;
    private Person player2;
    private Circle sun;
    private Circle ball;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        netPoles = new Square();
        sandField2 = new Square();
        sandField = new Square();
        ocean = new Square();
        upperNet = new Square();
        sandField3 = new Square();
        netFiber = new Square();
        sandField4 = new Square();
        netFiber2 = new Triangle();
        netFiber3 = new Triangle();
        netFiber4 = new Triangle();
        netFiber5 = new Triangle();
        netFiber6 = new Triangle();
        netFiber7 = new Triangle();
        netFiber8 = new Triangle();
        netFiber9 = new Triangle();
        netFiber10 = new Triangle();  
        netFiber11 = new Triangle();
        sun = new Circle();
        ball = new Circle();
        player1 = new Person();
        player2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sandField.changeColor("beach");
            sandField.moveHorizontal(-520);
            sandField.moveVertical(-30);
            sandField.changeSize(950);
            sandField.makeVisible();
            
            ocean.changeColor("ocean");
            ocean.moveHorizontal(-520);
            ocean.moveVertical(-960);
            ocean.changeSize(950);
            ocean.makeVisible();
            
            
            netPoles.changeColor("gray");
            netPoles.moveHorizontal(-285);
            netPoles.moveVertical(15);
            netPoles.changeSize(450);
            netPoles.makeVisible();
            
            sandField2.changeColor("beach");
            sandField2.moveHorizontal(-266);
            sandField2.moveVertical(1);
            sandField2.changeSize(410);
            sandField2.makeVisible();
            
            
            netFiber.changeColor("gray");
            netFiber.moveHorizontal(-275);
            netFiber.moveVertical(70);
            netFiber.changeSize(430);
            netFiber.makeVisible();
            
            
            sandField3.changeColor("beach");
            sandField3.moveHorizontal(-468);
            sandField3.moveVertical(120);
            sandField3.changeSize(810);
            sandField3.makeVisible();
            
            sandField4.changeColor("beach");
            sandField4.moveHorizontal(-265);
            sandField4.moveVertical(72);
            sandField4.changeSize(410);
            sandField4.makeVisible();
            
            player1.moveHorizontal(37);
            player1.moveVertical(-50);
            player1.changeSize(55,25);
            player1.changeColor("white");
            player1.makeVisible();
    
            netFiber2.changeSize(2, 850);
            netFiber2.moveHorizontal(40);
            netFiber2.moveVertical(35);
            netFiber2.makeVisible();
            netFiber2.changeColor("gray");
            
            netFiber3.changeSize(2, 850);
            netFiber3.moveHorizontal(40);
            netFiber3.moveVertical(18);
            netFiber3.makeVisible();
            netFiber3.changeColor("gray");
            
            netFiber4.changeSize(2, 850);
            netFiber4.moveHorizontal(45);
            netFiber4.moveVertical(-5);
            netFiber4.makeVisible();
            netFiber4.changeColor("gray");
            

            netFiber5.changeSize(58, 2);
            netFiber5.moveHorizontal(40);
            netFiber5.moveVertical(-6);
            netFiber5.makeVisible();
            netFiber5.changeColor("gray");
            
            netFiber6.changeSize(58, 2);
            netFiber6.moveHorizontal(-20);
            netFiber6.moveVertical(-6);
            netFiber6.makeVisible();
            netFiber6.changeColor("gray");
            
            netFiber7.changeSize(58, 2);
            netFiber7.moveHorizontal(-80);
            netFiber7.moveVertical(-6);
            netFiber7.makeVisible();
            netFiber7.changeColor("gray");
            
            netFiber8.changeSize(58, 2);
            netFiber8.moveHorizontal(-140);
            netFiber8.moveVertical(-6);
            netFiber8.makeVisible();
            netFiber8.changeColor("gray");
            
            netFiber9.changeSize(58, 2);
            netFiber9.moveHorizontal(100);
            netFiber9.moveVertical(-6);
            netFiber9.makeVisible();
            netFiber9.changeColor("gray");
            
            netFiber10.changeSize(58, 2);
            netFiber10.moveHorizontal(160);
            netFiber10.moveVertical(-6);
            netFiber10.makeVisible();
            netFiber10.changeColor("gray");
            
            netFiber11.changeSize(58, 2);
            netFiber11.moveHorizontal(220);
            netFiber11.moveVertical(-6);
            netFiber11.makeVisible();
            netFiber11.changeColor("gray");
            
            player2.moveHorizontal(-40);
            player2.moveVertical(10);
            player2.changeColor("white");
            player2.makeVisible();
            
            ball.changeColor("light gray");
            ball.moveHorizontal(20);
            ball.moveVertical(20);
            ball.changeSize(22);
            ball.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(210);
            sun.moveVertical(-110);
            sun.changeSize(80);
            sun.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sandField.changeColor("white");
        ocean.changeColor("black");
        netPoles.changeColor("black");
        sandField2.changeColor("white");
        netFiber.changeColor("black");
        sandField3.changeColor("white");
        sandField4.changeColor("white");
        player1.changeColor("black");
        netFiber2.changeColor("black");
        netFiber3.changeColor("black");
        netFiber4.changeColor("black");
        netFiber5.changeColor("black");
        netFiber6.changeColor("black");
        netFiber7.changeColor("black");
        netFiber8.changeColor("black");
        netFiber9.changeColor("black");
        netFiber10.changeColor("black");
        netFiber11.changeColor("black"); 
        player2.changeColor("black");
        ball.changeColor("black");
        sun.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sandField.changeColor("beach");
        ocean.changeColor("ocean");
        netPoles.changeColor("gray");
        sandField2.changeColor("beach");
        netFiber.changeColor("gray");
        sandField3.changeColor("beach");
        sandField4.changeColor("beach");
        player1.changeColor("white");
        netFiber2.changeColor("gray");
        netFiber3.changeColor("gray");
        netFiber4.changeColor("gray");
        netFiber5.changeColor("gray");
        netFiber6.changeColor("gray");
        netFiber7.changeColor("gray");
        netFiber8.changeColor("gray");
        netFiber9.changeColor("gray");
        netFiber10.changeColor("gray");
        netFiber11.changeColor("gray"); 
        player2.changeColor("white");
        ball.changeColor("light gray");
        sun.changeColor("yellow");
    }
    /**
     * Makes the players and sun leave.
     */
    public void sunset()
    {
        sun.slowMoveHorizontal(70);
        ball.makeInvisible();
        player1.slowMoveHorizontal(210);
        player2.slowMoveHorizontal(-270);
    }
    /**
     * Makes the players and sun appear.
     */
    public void sunrise()
    {
        sun.slowMoveHorizontal(-70);
        player1.slowMoveHorizontal(-210);
        player2.slowMoveHorizontal(270);
        ball.makeVisible();
    }
}
