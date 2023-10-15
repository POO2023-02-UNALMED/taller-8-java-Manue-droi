package Futbolista;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion = "portero";
	
	public Portero() {
		this("Maradona", 30,"delantero", 289, 7);
	}
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista" + this.getNombre() + " tiene "+ this.etEdad() + "juega de " + this.getPosicion() + "con el dorsal" + getDorsal() + ". Le han marcado" + getGolesRecibidos();
	}
	public int compareTo(Portero p){
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
	}
	boolean jugarConLasManos() {
		return true;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
}
