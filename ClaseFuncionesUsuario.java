import Dominios.Usuario;

public class FuncionesUsuario {

	public FuncionesUsuario() {
	}
	
	public int calculoImpuesto(Usuario usuario) {
		int edad = usuario.getEdad();
		int impuesto;
		if (((edad >= 18) && (edad < 30)) || (edad >= 65))  {
			impuesto = 2000;
		} else if ((edad >= 30) && (edad < 65)) {
			impuesto = 7000;
		} else 
			impuesto = 0;
		
		int cantHijos = usuario.getCantHijos();
		int porcentaje;
		if ((cantHijos * 3) > 50) {
			porcentaje = 50;
		} else 
			porcentaje = cantHijos * 3;
		
		return impuesto - (impuesto * porcentaje / 100);	
	}
}