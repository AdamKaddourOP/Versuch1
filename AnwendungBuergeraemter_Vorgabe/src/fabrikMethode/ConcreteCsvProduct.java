package fabrikMethode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeraemter.Buergeramt;


public class ConcreteCsvProduct extends Product {

	

    BufferedWriter aus ;
  

    
	public ConcreteCsvProduct() throws IOException {
		aus	= new BufferedWriter(new FileWriter("Buergeraemter.csv", true));

	}

	@Override
	public void fuegeInDateiHinzu(Buergeramt buergeramt) throws IOException {
		// TODO Auto-generated method stub
		aus.write(buergeramt.gibBuergeramtZurueck(';'));

	}

	@Override
	public void schliessDatei() throws IOException {
		// TODO Auto-generated method stub
		aus.close();
	}

}
