import java.util.ArrayList;
public class Stokje {
	protected ArrayList<Schijfje> schijfenOpStok = new ArrayList<Schijfje>();
	private int nummer;
	
	public Stokje(int nummer){
		this.nummer= nummer;
	}
	
	/**
	 * @return het laatste schijfje op het stokje
	 */
	public Schijfje getLaatsteSchijfOpStokje() {
		if (schijfenOpStok.size()>0)
			return schijfenOpStok.get(0);
		return null;
	}
	
	/**
	 * verwijdert het laatste schijfje
	 */
	public void delSchijfje(){
		if (schijfenOpStok.size()>0)
			schijfenOpStok.remove(0);
	}

	/**
	 * @param setSchijfOpStokje
	 */
	public boolean setSchijfOpStokje(Schijfje schijf) {
		if (schijfenOpStok.size()>0){
			if (schijfenOpStok.get(0).getGrootte() > schijf.getGrootte()){
				schijfenOpStok.add(0, schijf);}
		else{
			return false;}}
		else{
			schijfenOpStok.add(0, schijf);
			return true;
		}
		return true;
		
	}
	
	public String toString(){
		String a = "" ;
		for (int i = 0; i < schijfenOpStok.size(); i++) {
			for (int j = 0; j < schijfenOpStok.get(i).getGrootte() ; j++) {
				a+= schijfenOpStok.get(i).getGrootte();
			}
			a+= "\n";
		}
		return a;
	}

	/**
	 * @return the nummer
	 */
	public int getNummer() {
		return nummer;
	}
}
