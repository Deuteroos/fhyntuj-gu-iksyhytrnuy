package Abonne;

import Document.Document;
import java.util.ArrayList;
import java.util.Collection;

public class BaseAbonne {
	private Collection<Abonne> Abo;
	
	private static BaseAbonne _instance = new BaseAbonne();
	
	private BaseAbonne() {
		Abo=new ArrayList<Abonne>();
	}
	
	public static BaseAbonne getInstance() {
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
        
        public Abonne getPossesseur(Document d) throws PasEmprunteExceptuin{
            for(Abonne a:Abo)
                if (a.possede(d))
                    return a;
            throw new PasEmprunteExceptuin();
        }
}
