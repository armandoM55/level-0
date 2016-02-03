import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("When is your birthday");
	if (birthday.equals("today")) {
		JOptionPane. showConfirmDialog(null, "Happy Birthday");
	} else {
		JOptionPane.showConfirmDialog(null, "Happy Unbithday");
	}
}
}
