/**
 * 
 */
package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan
 *
 */
public class Partida {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crupier crupier = new Crupier();
		
		JugadorBlack jugador = new JugadorBlack("JUGADOR");
		BarajaInglesa baraja = new BarajaInglesa(null);
		
		
		boolean ganador = false;
    	boolean plantado = true;
    	
    	
    	do {
    		//Scanner sc = new Scanner(System.in);
    		int opcion=0;
    		do {
    			Scanner sc = new Scanner(System.in);
    			System.out.println("1. Pedir Carta: ");
    			System.out.println("2. Plantarse: ");
    			opcion = Integer.parseInt(sc.nextLine());
    			switch(opcion){
    				case 1: 
    					jugador.nuevaCarta(baraja.azar());
    					if(crupier.valorMano() <17)
    						crupier.nuevaCarta(baraja.azar());
    			
    					System.out.println(jugador);
    					System.out.println(crupier.mostrarCrupier());
    					
    					//Compruebo si hay ganador
    					if(jugador.valorMano()>21) {
    						System.out.println("Ganaste la partida!!");
    						ganador=true;
    			    	//Se paasa el crupier gans tu
    					}else if(crupier.valorMano() > 21) {
    				  		System.out.println("Gano el crupier!!");
    				  		ganador=true;
    			    	//tinenes blackjack gans tu
    					} else if(jugador.valorMano() == 21) {
    				  	     System.out.println("Ganste la partida!!");
    				  	     ganador=true;
    			    	//Tiene el crupier balckjack gana el
    					} else if(crupier.valorMano() == 21) {
    				  	  	System.out.println("Gano el crupier!!");
    				  	    ganador=true;
    					}
    					
    					jugador.nuevaCarta(baraja.repartirCarta());
    					System.out.println(jugador);
    					break;
    					
    				case 2: 
    					plantado = true;
    					//El crupier pedira cartas hasta valor mayor 17
    					break;
    			}
    		}while((opcion != 2 && ganador==false));
    			
    		//Comprobar ganador
    		  if(plantado) {
    			  if(crupier.valorMano()<=21 && crupier.valorMano()>=jugador.valorMano()) { 
    				  System.out.println("Gano el crupier!!");
    				  ganador=true;
    			  }else {
    				  System.out.println("Gano el jugador!!");
    				  ganador=true;
    			  }
    		  }
    		 
    	}while(!ganador && !plantado);
		
	}

}

