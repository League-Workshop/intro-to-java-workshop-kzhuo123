package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

import sun.applet.Main;

public class RobotSquare {
public static void main(String[] args) {
	Robot m=new Robot("batman");
	m.setSpeed(500);
for(int i=0;i<3600;i++) {
	m.move(20);
	m.setAngle(180);
	m.move(20);
	m.setAngle(i+1);

	
	
}

}
}