public class Main {
	public static void main(String[] args) {
		Y Ay = new A();
		Y By = new B();
		Y[] ys = {Ay, By};

		for (Y value : ys) {
			value.b();
		}

	}
}