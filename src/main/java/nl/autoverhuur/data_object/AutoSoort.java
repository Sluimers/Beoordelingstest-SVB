package nl.autoverhuur.data_object;

public class AutoSoort {
  int id;
  String merk;
  String model;
  String versie;
  int n_deuren;
  float co2_uitstoot;
  float prijs_bruto;
  float prijs_netto;
  
  public int geefID() {
	    return id;
  }
  
  public String geefMerk() {
	    return merk;
  }

  public String geefModel() {
	    return model;
  }
  
  public String geefVersie() {
	    return versie;
  }
  
  public float geefCo2_Uitstoot() {
	    return co2_uitstoot;
  }
  
  public float geefN_Deuren() {
	    return n_deuren;
  }
  
  public float geefPrijsBruto() {
	    return prijs_bruto;
  }
  
  public float geefPrijsNetto() {
	    return prijs_netto;
  }
}
