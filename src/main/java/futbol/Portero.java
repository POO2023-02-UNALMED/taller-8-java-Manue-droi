package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero() {
		super();
		this.golesRecibidos = 150;
		this.dorsal = 1;
	}
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return 
				super.toString()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesRecibidos;
	}
	public int compareTo(Portero f){
		 Portero otroPortero = (Portero) f;
	        return Math.abs(this.getGolesRecibidos() - otroPortero.getGolesRecibidos());
	}
	public boolean jugarConLasManos() {
		return true;
	}
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal() {
		this.dorsal = dorsal;
	}
}
