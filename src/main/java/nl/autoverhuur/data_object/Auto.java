package nl.autoverhuur.data_object;

public class Auto {
  int id;
  float jaarkilometerstand;
  int contractduur;
  float rentevoet;
  float nettoprijs;
  AutoSoort soort;

  static final int PERCENTAGE = 100;
  static final int MAANDEN = 12;

  public Auto(AutoSoort nieuwAutosoort, float nieuwJaarkilometerstand, int nieuwContractduur, float nieuwRentevoet,
      float nieuwNettoprijs) {
    soort = nieuwAutosoort;
    jaarkilometerstand = nieuwJaarkilometerstand;
    contractduur = nieuwContractduur;
    rentevoet = nieuwRentevoet;
    nettoprijs = nieuwNettoprijs;
  }

  public float geefVerhuurTarief() {
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
