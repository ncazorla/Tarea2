public class Usuario {
	
	private String nombre;
	private int CI;
	private String contrasenia;
	private int edad;
	private int cantHijos;
	private float saldo = 0;

    public Usuario() {
	}
	
	public Usuario(String nombre, int CI, String contrasenia, int edad, int cantHijos) {
		this.nombre = nombre;
		this.CI = CI;
		this.contrasenia = contrasenia;
		this.edad = edad;
		this.cantHijos = cantHijos;
		this.saldo = 0;
	}
 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}