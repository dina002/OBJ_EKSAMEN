
public class Entrypoint {

	public static void main(String[] args) {
		SjakkBrett brett = new SjakkBrett();
		
		String user_1 = "bruker1";
		String user_2 = "bruker2";
		
		SjakkGUI gui1 = new SjakkGUI(user_1, brett);
		SjakkGUI gui2 = new SjakkGUI(user_2, brett);
		

	}

}
