package controller;

public class ControllerMultiplaSoma {

	public ControllerMultiplaSoma() {
		super();
	}
 
	public int MultiplicaSoma (int a, int b) {
		if (a == 0) {
			return 0;
		} else {
			return b + MultiplicaSoma((a-1), b);
		}
	}
}

/* f(3,5) = 5 + f(2,5)
 * f(2,5) = 5 + f(1,5)
 * f(1,5) = 5 + f(0,5)
 * f(0,5) = 1
 * */
