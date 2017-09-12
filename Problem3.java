 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        patch();
    }
        public void patch() {
            while(frontIsClear()) {
            move();
            turnLeft();
            if(!nextToABeeper()) {
                if(frontIsClear()) {
                    putBeeper();
                } 
                turnRight();
                if(!frontIsClear()) {
                    turnRight();
                }
            } else {
                turnOff();
            }
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
        }
    }