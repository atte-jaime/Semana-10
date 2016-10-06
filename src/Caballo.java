import processing.core.PApplet;

public class Caballo extends Thread {
	private int posX, posY, vel;
	private PApplet app;
	private boolean choque;

	public Caballo(int x, int y, int v, PApplet app) {
		posX = x;
		posY = y;
		vel = v;
		this.app = app;
	}

	public void run() {
		while (true) {
			
				mover();
			
			try {
				Thread.sleep(33);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void pintar() {
		if (choque) {
			app.noStroke();
			app.fill(200, 0, 0, 200);
			app.ellipse(posX, posY, 20, 20);
		} else {
			app.noStroke();
			app.fill(0, 255, 255);
			app.ellipse(posX, posY, 20, 20);
		}
	}

	private void mover() {
		posX += vel;

	}

	public int getPosX() {
		return posX;
	}

	public int getVel() {
		return vel;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setVel(int vel) {
		this.vel -= vel;
	}


}
