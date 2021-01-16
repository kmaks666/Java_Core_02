import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Robot mainRobot = new Robot();
        Robot coffeRobot = new CoffeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();
        //mainRobot.work();
       // coffeRobot.work();
        //robotDancer.work();
        //robotCooker.work();
 
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(mainRobot);
        robots.add(coffeRobot);
        robots.add(robotDancer);
        robots.add(robotCooker);
 
        for (Robot robot : robots) {
            robot.work();
        }
	}

}
