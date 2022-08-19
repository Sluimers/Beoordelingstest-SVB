package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.ontwerppatroon.Singleton;
import nl.autoverhuur.data_object.Klant;

public class KlantBeheer extends Singleton {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int opslaanKlant(Klant klant) {
    String query = """
        insert into klant values(
        '"+e.geefID()+"',
        '"+e.geefPersoonID()+"',
        '"+e.geefNaam()+"',
        '"+e.geefStraat()+"',
        '"+e.geefHuisnummer()+"',
        '"+e.geefPostcode()+"',
        '"+e.geefPlaats()+"',
        '"+e.geefEmail()+"',
        '"+e.geefTelefoonnummer()+"'
        )""";
    return jdbcTemplate.update(query);
  }

  public int bewerkKlant() {
    String query = """
        update klant set
        naam='"+e.geefNaam()+"',
        straat='"+e.geefStraat()+"'
        huisnummer='"+e.geefHuisnummer()+"'
        postcode='"+e.geefPostcode()+"'
        plaats='"+e.geefPlaats()+"',
        email='"+e.geefEmail()+"',
        telefoonnummer='"+e.geefTelefoonnummer()+"'
        where klantID='"+e.geefKantID()+"'
        """;
    return jdbcTemplate.update(query);
  }

  public int verwijderKlant() {
    String query = """
        delete from klant where
        id='" + e.geefKlantID() + "'
        """;
    return jdbcTemplate.update(query);
  }
}
