import org.jointheleague.graphical.robot.Robot;

public class gs {
	
	public static void main(String[] args) {
		Robot Envolope =new Robot();
		Envolope.penDown();
		Envolope.setSpeed(10);
		Envolope.move(100); 
		Envolope.turn(45);
		Envolope.move(100);
		Envolope.turn(90);
		Envolope.move(100);
		Envolope.turn(45);
		Envolope.move(100);
		Envolope.turn(90);
		Envolope.move(100);
		Envolope.turn(125);
	}

}
