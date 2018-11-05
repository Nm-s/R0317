package kahvikone;

public class JuomaAutomaatti {
	// atribuutit
	 
  
    private int teetä;
  
    private int kahvia;

    private int kaakaota;
    

 
    // getterit & setterit
    
    
    // tee
    
    public int getTee() {
   return teetä; 	
    }
    
    public void setTee(int uusiTee) {
	this.teetä = uusiTee;
	
	// kahvi
	
	
	}
    public int getKahvia() {
    	return kahvia;
    }
    public void setKahvi(int uusiKahvi) {
    this.kahvia = uusiKahvi;	
    }
    
    // kaakao
    
    public int getKaakaota() {
    	return kaakaota;
    }
    public void setKaakao (int uusiKaakao) {
    this.kaakaota = uusiKaakao;	
    }
    
   
    
    // konstruktori
    public JuomaAutomaatti() {
        teetä = 50;
        kahvia = 50;
        kaakaota = 50;
    }
    // metodit
    
    // 1 tee
    public void valmistaTee() {
	
    	if (this.teetä - 10 < 0) {
    		this.teetä = 0;
    		System.out.println("Tee on loppunut, täytä säiliö");
    		return;
    	}

    	else 
        this.teetä -= 10;
    	System.out.println("Teesi valmistuu\n" + toString());
        }
        {
        	
        }



        
      // 2 kahvi
    public void valmistaKahvi() {      
 
    
    	if (this.kahvia - 10 < 0) {
		this.kahvia = 0;
		System.out.println("Kahvi on loppunut, täytä säiliö");
		return;
	}

	else 
    	this.kahvia -= 10;
    	System.out.println("Kahvisi valmistuu\n" + toString());
    }
    {
    	
    }
    
    // 3 kaakao
    public void valmistaKaakao(){
    	
    	if (this.kaakaota - 10 < 0) {
    		this.kaakaota = 0;
    		System.out.println("Kaakao on loppunut, täytä säiliö");
    		return;
    	}

    	else 
        	this.kaakaota -= 10;
        	System.out.println("Kaakaosi valmistuu\n" + toString());
        }
        {
        	
        }
    
// 4 tulostus
@Override
public  String toString() {
	    String mj = null;
	    mj = "Teetä jäljellä: " + this.teetä + " ml\n";
	    mj += "Kahvia jäljellä: " + this.kahvia + " ml\n";
	    mj += "Kaakaota jäljellä: " + this.kaakaota + " ml\n";

	    return mj;
	}


}

