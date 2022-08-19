package nl.autoverhuur.data_object;

public class Auto {
  int id;
  float jaarkilometerstand;
  int contractduur;
  float rentevoet;
  float nettoprijs;
  AutoSoort soort;
  
  static final int PERCENTAGE=100;  
  static final int MAANDEN=12;  

  public Auto(AutoSoort autosoort_n, float jaarkilometerstand_n, int contractduur_n, float rentevoet_n, float nettoprijs_n) {
    soort = autosoort_n;
    jaarkilometerstand = jaarkilometerstand_n;
    contractduur = contractduur_n;
    rentevoet = rentevoet_n;
    nettoprijs = nettoprijs_n;
  }

  public float verhuurTarief() {
    return (jaarkilometerstand * contractduur / nettoprijs / MAANDEN) + (rentevoet * nettoprijs / PERCENTAGE / MAANDEN);
  }
  
  public int geefID() {
	  return id;
  }
  
  public float geefJaarkilometerstand() {
	  return jaarkilometerstand;
  }
  
  public int geefContractduur() {
	  return contractduur;
  }
  
  public float geefRentevoet() {
	  return rentevoet;
  }
  
  public float geefNettoprijs() {
	  return nettoprijs;
  }
  
  public AutoSoort geefSoort() {
	  return soort;
  }
  
  public int geefAutoSoortID() {
	  return soort.geefID();
  }
}
