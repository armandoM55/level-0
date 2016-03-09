
public class Badgers {
	public static void main(String[] args) {
for (int b = 0; b < 2; b++) {
	

		for (int i = 0; i < 13; i++) {
	

		System.out.println("Badgers");
		speak("Badgers");
		
}
for (int y = 0; y < 2; y++) {
	
System.out.println("Mushrooms");
		speak("Mushrooms");
	}}}
//speak("snake oh, Snake");
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
