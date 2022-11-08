package Logica;
import Entidades.Zombie;

public class moverZombie implements ZombieStrategy {
	public moverZombie(){
	}

	public void realizarAccion(Zombie z){
		if (z.getX() <= 800) {
			z.morir();
		}
		System.out.println(""+z.getX());

		z.setX(z.getX()-10);
		z.getEntidadGrafica().getGrafica().setBounds(z.getEntidadGrafica().getGrafica().getX()-10, z.getEntidadGrafica().getGrafica().getY(), z.getEntidadGrafica().getGrafica().getWidth(), z.getEntidadGrafica().getGrafica().getHeight());
		z.getEntidadGrafica().actualizarGrafica();
	}
}
