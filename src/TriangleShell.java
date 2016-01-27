import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class TriangleShell {

	Robot Tri =new Robot();
	
	void go() {
		

		Tri.setSpeed(10);
int size = 50;
		
for (int i = 0; i < 60; i++) {
	

	Tri.setPenColor(PenColors.getRandomColor());
				size=size+10;
			
  drawTriangle(size);
Tri.turn(6);
	}}

	
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			
		
		Tri.penDown();
		Tri.move(length); 
		Tri.turn(120);
		
	}}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}


