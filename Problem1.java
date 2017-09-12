
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        checkWall();
        escapeRoom();
    }
    public void checkWall() {
        while(!frontIsClear()) {
            turnLeft();
        }
        while(frontIsClear()) {
            move();
            turnRight();
            if (!frontIsClear()) {
                turnLeft();
            }
            if(frontIsClear()) {
                move();
                move();
            }
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

