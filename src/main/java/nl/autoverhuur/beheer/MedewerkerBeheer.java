package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.data_object.Medewerker;
import nl.autoverhuur.ontwerppatroon.Singleton;

public class MedewerkerBeheer extends Singleton {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int opslaanMedewerker(Medewerker medewerker) {
    String zoekopdracht = """
        insert into medewerker values(
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
    return jdbcTemplate.update(zoekopdracht);
  }

  public int bewerkMedewerker() {
    String zoekopdracht = """
        update klant set
        naam='"+e.geefNaam()+"',
        straat='"+e.geefStraat()+"'
        huisnummer='"+e.geefHuisnummer()+"'
        postcode='"+e.geefPostcode()+"'
        plaats='"+e.geefPlaats()+"',
        email='"+e.geefEmail()+"',
        telefoonnummer='"+e.geefTelefoonnummer()+"'
        where medewerkerID='"+e.geefMedewerkerID()+"'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

  public int verwijderMedewerker() {
    String zoekopdracht = """
        delete from medewerker where
        id='" + e.geefID() + "'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

}
