/**
 * 
 */
package blackJack;

import java.util.ArrayList;


/**
 * @author Juan
 *
 */
public class BarajaInglesa  extends Baraja{
	 
	private static final int[] palo= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private static final String[] figura= {"Dianmanes","Picas", "Trevoles", "Corazones"};
	
	
	
	/**
	 * @param baraja
	 */
	public BarajaInglesa(ArrayList<Carta> baraja) {
		super(baraja);
		// TODO Auto-generated constructor stub
		for(int i=0; i<palo.length; i++) {
			for(int j=0; j<figura.length; j++) {
				this.baraja.add(new Carta(palo[i],figura[j]));
			}
		}
			
	}
	
	
	
	
}

