package view;
import controller.ControllerMultiplaSoma;

public class PrincipalMultiplaSoma {

	public static void main(String[] args) {
		int A = 4;
		int B = 5;
		
		ControllerMultiplaSoma cm = new ControllerMultiplaSoma();
		
		int res = cm.MultiplicaSoma(A, B);
		System.out.println(res);

	}

}
