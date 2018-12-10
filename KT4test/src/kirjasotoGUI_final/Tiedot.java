
 package kirjasotoGUI_final;

import java.awt.Image;

@SuppressWarnings("unused")
public class Tiedot {
    
    private String teoksennimi;
    private int julkaisuvuosi;
    private String tekijänimi; 
    private byte[] kuva;
    
    public Tiedot(int pjulkaisuvuosi, String pkirjanimi, String ptekijänimi, byte[] pkuva)
    {
       
        this.teoksennimi = pkirjanimi;
        this.julkaisuvuosi = pjulkaisuvuosi;
        this.tekijänimi = ptekijänimi;
        this.kuva = pkuva;
    }
    
    
    public Tiedot(int int1, String string, float parseFloat, String string2, byte[] bytes) {
		// TODO Auto-generated constructor stub
	}


	public String getTeoksennimi()
    {
        return teoksennimi;
    }
    
    public String getTekijänimi()
    {
        return tekijänimi;
    }
    
    
    public int getJulkaisuvuosi()
    {
        return julkaisuvuosi;
    }
    
    
    public byte[] getImage()
    {
        return kuva;
    }
    
}