
public class Petle {

	public static void main(String[] args) {
	
		int licznik = 0;
		 
	    while(licznik<10){
	    	System.out.println("To jest petla");
	    	licznik++;
	    }
	    System.out.println("Koniec p�tli");
	    
	    do{
	    	System.out.println("To jest petla");
	    	licznik++;
	    }
	    while(licznik<10);
	    System.out.println("Koniec p�tli");
	    
	    for(int i=0; i<10; i++){
	    	System.out.println("To jest p�tla");
	    }
	    System.out.println("Koniec p�tli");
	}

}
