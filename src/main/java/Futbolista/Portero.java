package Futbolista;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion = "portero";
	
	public Portero() {
		this("Maradona","delantero", 30, 289, 7);
	}
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista" + super.getNombre() +" tiene "+ super.getEdad() + "", y\r\n" 
				+ "juega de "+ super.getPosicion()+ "con el dorsal" + getDorsal()+ ". Le han marcado"+ getGolesRecibidos();
	}
	boolean jugarConLasManos();
	
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
