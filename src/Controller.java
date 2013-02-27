import java.util.ArrayList;

public class Controller {
	private ArrayList<Stokje> stokjes = new ArrayList<Stokje>();
	
	public Controller(int aantalStokjes,int aantalSchijfjes){
		for (int i = 1; i <= aantalStokjes; i++) {
			stokjes.add(new Stokje(i));			
		}
		for (int i = 1; i <= aantalSchijfjes; i++) {
			stokjes.get(0).schijfenOpStok.add(new Schijfje(i));
		}	
	}
	
	public ArrayList<Stokje> getStokjes(){
		return stokjes;
	}

}
