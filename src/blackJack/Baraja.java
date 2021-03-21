/**
 * 
 */
package blackJack;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Juan
 *
 */
public abstract class Baraja {
	
	protected ArrayList<Carta> baraja;


	/**
	 * @param baraja
	 */
	public Baraja(ArrayList<Carta> baraja) {
		super();
		this.baraja = new ArrayList<>();
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Baraja [baraja=");
		for(Carta c : baraja)
			builder.append(c.getNombreCorto()); 
		builder.append("]");
		return builder.toString();
	}
	
	
	//Estaba en baraja
    public Carta repartirCarta() {
		
		Carta c = baraja.get(0);
		baraja.remove(0);
		return c;
		
	}
	
	public Carta azar() {
		
		barajar();
		return repartirCarta();

	}
	
	
	
	public void barajar() {
		Collections.shuffle(baraja);
	}
	
}
