import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	private PApplet app;
	private boolean inicio;
	private ArrayList<Caballo> caballos;

	public Logica(PApplet app) {
		this.app = app;
		caballos = new ArrayList<Caballo>();
		for (int i = 0; i < 10; i++) {
			Caballo temp = new Caballo(50, 50 + (i * 30), (int) app.random(5, 15), app);
			caballos.add(temp);
		}

		iniciar();
	}

	public void pintar() {
		for (int i = 0; i < caballos.size(); i++) {
			caballos.get(i).pintar();
			if (caballos.get(i).getPosX()>= app.width) {
				caballos.get(i).stop();
			}
		}
	}
	
	public void iniciar(){
		if (inicio) {
			for (int i = 0; i < caballos.size(); i++) {
				if (!caballos.get(i).isAlive()) {
				caballos.get(i).start();
			}}
		}
	}

	public void pressed() {

		inicio=true;
		iniciar();
	}

}
