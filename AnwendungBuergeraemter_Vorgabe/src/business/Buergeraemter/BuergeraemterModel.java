package business.Buergeraemter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import fabrikMethode.ConcreteCreator;
import fabrikMethode.ConcreteCreatorTxt;
import fabrikMethode.Creator;
import fabrikMethode.Product;
import ownUtil.Observable;
import ownUtil.Observer;

public class BuergeraemterModel implements Observable {
	
//	private Buergeramt buergeramt;
	
	LinkedList<Observer> liste = new LinkedList<Observer>();

	private ArrayList<Buergeramt> buergeraemterList = new ArrayList<Buergeramt>();
	
	

	private static BuergeraemterModel instanz=null;
	
	public static BuergeraemterModel getInstanz() {
		if(instanz == null) {
			instanz = new BuergeraemterModel();
		}
		return instanz;
	}

	private BuergeraemterModel() {
		
	}



	
	//jetzt
	public ArrayList<Buergeramt> getBuergeraemterList() {
		return buergeraemterList;
		
	}
	
	//jetzt
	public void setBuergeraemterList(ArrayList<Buergeramt> buergeraemterList) {
		this.buergeraemterList = buergeraemterList;
	}
	
	
	
	/*public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
		notifyObservers();
	}*/
	
	public void addBuergeramt(Buergeramt buergeramt) {
        buergeraemterList.add(buergeramt);
        notifyObservers();
    }
 		
	public void schreibeBuergeraemterInCsvDatei()
	    throws IOException{
		
		Creator creator =new ConcreteCreator();
		Product writer = creator.factoryMethod();
		for (Buergeramt buergeramt : buergeraemterList) {
	        writer.fuegeInDateiHinzu(buergeramt);
	    }
		writer.schliessDatei();

 	}
	public void schreibeBuergeraemterInTxtDatei()    throws IOException{
		
		
		Creator creator =new ConcreteCreatorTxt();
		Product writer = creator.factoryMethod();
		for (Buergeramt buergeramt : buergeraemterList) {
	        writer.fuegeInDateiHinzu(buergeramt);
	    }
		writer.schliessDatei();
	}

	@Override
	public void addObserver(Observer obs) {
		liste.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		
		liste.remove(obs);
	}

	@Override
	public void notifyObservers() {
		
		for(Observer o:liste) {
			o.update();
		}

	}
	

}
