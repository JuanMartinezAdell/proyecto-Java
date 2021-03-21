/**
 * 
 */
package blackJack;


/**
 * @author Juan
 *
 */
public class Carta {
	
	private String figura;
	private int palo;
	/**
	 * @param palo
	 * @param figura
	 */
	public Carta( ) {
		super();
		this.palo=0;
		this.figura= " ";
		
	}

	/**
	 * @param palo
	 * @param figura
	 */
	public Carta(int palo, String figura) {
		super();
		this.palo = palo;
		this.figura = figura;
	}

	/**
	 * @param palo
	 * @param figura
	 */
	public Carta( Carta c) {
		super();
		this.palo = c.palo;
		this.figura = c.figura;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}
	
	public String getNombreCorto() {
		//return Integer.toString(palo).concat(figura);
		
		return ""+palo + (char)figura.charAt(0)+ " ";
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", figura=" + figura + "]";
	}
	

}
