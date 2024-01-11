package business;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Buergeramt;

public class BuergeramtTest {

		private Buergeramt buergeramt;

	    @BeforeEach
	    
	    void ausfuellen() throws Exception {
	        buergeramt = new Buergeramt("Buergerbuero", 9.00f, 17.00f, "Querenburg Hoehe 256", new String[]{"Hauptwohnsitz", "Nebenwohnsitz"});
	    }
	    @Test
	    void TextBuergeramt() {
	    	assertTrue(()->this.buergeramt.getGeoeffnetVon()==9.00f);
	    	assertTrue(this.buergeramt.getGeoeffnetBis()==17.00f);
	    	assertTrue(this.buergeramt.getStrasseHNr().equals("Querenburg Hoehe 256"));
	    
	    }
		


}
