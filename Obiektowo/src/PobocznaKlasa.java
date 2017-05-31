
public class PobocznaKlasa {
	
	void metodaJeden(int x){
		boolean warunek = true;
		if (warunek = false){
			x = 1;
		}
		else {
			x = 0;	
		}
	}
	
	int metodaDwa(int x){
		switch(x){
		  case 1:
		    x = 1;
		    break;
		  case 2:
		    x = 2;
		    break;
		  default:
		    x = 0;
		}
		return(x);
	}
	
	PobocznaKlasa metodaTrzy(){
		return new PobocznaKlasa();
	}
	
	void metodaCztery(int parm){
		
	}
}
