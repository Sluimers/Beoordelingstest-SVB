package nl.autoverhuur.data_object;

public class AutoSoort {
  int id;
  String merk;
  String model;
  String versie;
  int nDeuren;
  float co2Uitstoot;
  float prijsBruto;
  float prijsNetto;

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

  public float geefCO2Uitstoot() {
    return co2Uitstoot;
  }

  public float geefNDeuren() {
    return nDeuren;
  }

  public float geefPrijsBruto() {
    return prijsBruto;
  }

  public float geefPrijsNetto() {
    return prijsNetto;
  }
}
