import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		Main.main("Main");
	}

	Logica app;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		app = new Logica(this);
	}

	public void draw() {
		background(0);
		app.pintar();
	}

	public void mousePressed() {
		app.pressed();
	}

}
