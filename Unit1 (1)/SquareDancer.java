//SquareDancer

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class SquareDancer extends Dancer
{
public SquareDancer()
{
super(3, 3, Display.EAST, 0);
}
public SquareDancer(int x, int y, int dir, int beep)
{
super(x, y, dir, beep);
}
public void danceStep()
{
move();
turnLeft();
move();
turnLeft();
}
}
