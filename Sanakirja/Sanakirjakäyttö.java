package kahvikone;
import java.util.Scanner;
public class Sanakirjakäyttö {

	public static void main(String[] args) { {

	
	JuomaAutomaatti käyttöKone = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		int	valintaLuku=0;
		while(valintaLuku != 4){	
		System.out.println("Sanakirja: \n1. Sanakirjan sisältö \n2. Etsi sanoja \n3. Lisää sanoja  \n4. Tallennus" );
	
		valintaLuku=lukija.nextInt();
		
		
	
		
		
{
		if(valintaLuku==1) {
	 käyttöKone.valmistaTee();	
	 
			
		}
		
	 if(valintaLuku==2) {
			käyttöKone.valmistaKahvi();	
			
		}
		
			{
		if(valintaLuku==3) {
				käyttöKone.valmistaKaakao();	
				
				}
		if(valintaLuku==4) {
				System.exit(0);
				}
			
			}
							
				}}
	}}}
