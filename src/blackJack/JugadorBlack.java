/**
 * 
 */
package blackJack;

/**
 * @author Juan
 *
 */
public class JugadorBlack extends Jugador {
	
	private  String nombre;

	/**
	 * @param nombre
	 */
	public JugadorBlack(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBalck [nombre=");
		builder.append(nombre);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
