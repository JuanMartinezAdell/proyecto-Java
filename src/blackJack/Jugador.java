/**
 * 
 */
package blackJack;

import java.util.ArrayList;


/**
 * @author Juan
 *
 */
public class Jugador {
	
	protected ArrayList<Carta> mano;

	/**
	 * @param mano
	 */
	public Jugador( ) {
		super();
		this.mano = new ArrayList<>();
	}

	public void nuevaCarta(Carta unaCarta) {
		mano.add(unaCarta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mano=");
		for(Carta c : mano)
		     builder.append(c.getNombreCorto());
		builder.append("]");
		return builder.toString();
	}
	
	public ArrayList<Carta> getMano(){
		return mano;
	}
	
	public int valorMano() {
		int valor=0;
		
		for(Carta c : mano) {
				//Las figuras su valor suman 10*/
				if(c.getPalo() > 10) {
					valor +=10;
				}else {
					//El resto de cartas suman su valor
					valor += c.getPalo();
			}
		}
			
		//Valor sumando asees como 1 o 11 si no paso
		for(Carta c : mano) {
				if(c.getPalo() == 1) { //Es un As
					if(valor +10 <=21)
						valor += 10; //Le sumo 10 porque ya le sume 1
				}
		}
		
		
		//Valor sumando los As como 1
		return valor;
	}

}

