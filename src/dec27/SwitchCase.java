package dec27;

public class SwitchCase {

	public static void main(String[] args) {
		String Course="qtp";
		switch (Course.toUpperCase()) {
		
		case "QTP":
			System.out.println("Course is available");
			break;
		case "manual":
			System.out.println("Course is available");
			break;
			case "selenium":
				System.out.println("Course is available");
				break;
			default:
				System.out.println("Course is notavailable");
			break;
		}
		
		
		

	}

}
