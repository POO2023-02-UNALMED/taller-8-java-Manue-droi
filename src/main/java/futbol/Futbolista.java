package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public Futbolista( String nombre,int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;		
	}
	public boolean equals (Futbolista f) {
		if(this == f);
	}
	public int compareTo(Object o){
	       return 0;		
	}
	public abstract boolean jugarConLasManos();
		
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
}
