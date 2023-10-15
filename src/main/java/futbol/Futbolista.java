package futbol;

public class Futbolista implements comparable {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona","delantero", 30);
	}
	public Futbolista( String nombre,int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;		
	}
	public boolena equals (Futbolista f) {
		if(this == f) {
			return true;
		}
		else {
			return false;
		} 
	}
	abstract boolean jugarConLasManos();
		
	public String toString() {
		return "El futbolista" + getNombre() +" tiene "+ getEdad()+ "juega de "+ getPosicion();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
}
