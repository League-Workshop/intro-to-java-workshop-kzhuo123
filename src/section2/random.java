package section2;

import org.jointheleague.graphical.robot.Robot;

public class random {
public static void main(String[] args) {
	Robot m=new Robot("batman");
;
m.setSpeed(500);
for(int i=0;i<3600;i++) {
	m.sparkle();
	m.move(20);
	m.setAngle(180);
	m.move(20);
	m.setAngle(i+359);

	
	
}
}}