import javax.swing.JOptionPane;

public class roller_coster {
public static void main(String[] args) {
	String Question=JOptionPane.showInputDialog("How tall are you?");
	int hight= Integer.parseInt(Question);
	if(hight<4){
		JOptionPane.showMessageDialog(null, "You can not ride the roller coster");
	} else{
		JOptionPane.showMessageDialog(null, "enjoy the ride");
	}
}
}
