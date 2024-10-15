//LDancer

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class LDancer extends Dancer
{
public LDancer()
{
super(3, 10, Display.EAST, 0);
}
public LDancer(int x, int y, int dir, int beep)
{
super(x, y, dir, beep);
}
public void danceStep()
{
move();
move();
move();
move();
turnLeft();
move();
move();
turnLeft();
move();
move();
turnRight();
move();
move();
move();
move();
move();
move();
turnLeft();
move();
move();
turnLeft();
move();
move();
move();
move();
move();
move();
move();
move();
turnLeft();
}
}
