
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        planting();
    }
    public void planting() {
        while(frontIsClear()) {
            move();
            turnLeft();
            if(nextToABeeper()) {
                turnOff();
            } else {
                     if(!frontIsClear()) {
                    putBeeper();
                    turnRight();
                    if(!frontIsClear()) {
                        turnRight();
                    }
                }
            }
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

