
public class Punkt {
	int wspX = 0;
	int wspY = 0;
	public Punkt(int x, int y){
		wspX = x;
		wspY = y;
	}
	public Punkt(Punkt pkt){
		wspX = pkt.wspX;
		wspY = pkt.wspY;
	}

void zwiekszX(){
	wspX++;
}
void zwiekszY(){
	wspY++;
}
int zmienX(int x){
	wspX = x;
	return x;
}
int zmienY(int y){
	wspY = y;
	return y;
}
int getX(){
	return wspX;
}
int getY(){
	return wspY;
}
void wyswietlWsp(){
	System.out.println("Wspó³rzêdne punktu to: " + wspX + ", " + wspY);
}
}
