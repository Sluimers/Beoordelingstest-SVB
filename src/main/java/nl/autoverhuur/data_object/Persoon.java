package nl.autoverhuur.data_object;

public class Persoon {
  private String naam;
  private String straat;
  private int huisnummer;
  private String postcode;
  private String plaats;
  private String email;
  private String telefoonnummer;

  public String geefNaam() {
    return naam;
  }

  public String geefStraat() {
    return straat;
  }

  public int geefHuisnummer() {
    return huisnummer;
  }

  public String geefPostcode() {
    return postcode;
  }

  public String geefPlaats() {
    return plaats;
  }

  public String geefEmail() {
    return email;
  }

  public String geefTelefoonnummer() {
    return telefoonnummer;
  }
}
