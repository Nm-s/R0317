package kahvikone;
import java.util.Scanner;
public class Käyttö {

	public static void main(String[] args) { {

	
	JuomaAutomaatti käyttöKone = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		int	valintaLuku=0;
		while(valintaLuku != 4){	
		System.out.println("Juoma-automaatti, mitä saisi olla?: \n1. Tee \n2. Kahvi \n3. Kaakao \n4. Poistu" );
	
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
