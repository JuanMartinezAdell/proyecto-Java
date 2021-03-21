/**
 * 
 */
package blackJack;


/**
 * @author Juan
 *
 */
public class Crupier extends Jugador{
	
	private String nombre="Crupier";
	private static final int limite=17;
	/**
	 * 
	 */
	public Crupier() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	
	
	public int getLimite( ) {
		return limite;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Crupier [nombre=");
		builder.append(nombre);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	public String mostrarCrupier() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador Black ");
		builder.append(nombre);
		builder.append(", Mano");
		for(int i=0; i<mano.size();i++) {
			if(i==0)
				builder.append(mano.get(i));
			else
				builder.append("X, ");
		}
		builder.append("]");
		return builder.toString();
	}
	
}

