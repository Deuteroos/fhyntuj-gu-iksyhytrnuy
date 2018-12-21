package Abonne;

import java.util.Collection;

public class BaseAbonne {
	private Collection<Abonne> Abo;
	
	private static BaseAbonne _instance = new BaseAbonne();
	
	public static synchronized BaseAbonne getInstance() {
		return _instance;
	}
	
	public Abonne getAboByNum(int i) {
		for(Abonne a : Abo) {
			if(a.getNum() == i) {
				return a;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public void ajoutAbo(Abonne a) {
		Abo.add(a);
	}
}
