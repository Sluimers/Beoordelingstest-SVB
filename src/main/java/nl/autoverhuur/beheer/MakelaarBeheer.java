package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.ontwerppatroon.Singleton;
import nl.autoverhuur.data_object.Makelaar;

public class MakelaarBeheer extends Singleton {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int opslaanMakelaar(Makelaar makelaar) {
    String zoekopdracht = """
        insert into makelaar values(
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

  public int bewerkMakelaar() {
    String zoekopdracht = """
        update makelaar set
        naam='"+e.geefNaam()+"',
        straat='"+e.geefStraat()+"'
        huisnummer='"+e.geefHuisnummer()+"'
        postcode='"+e.geefPostcode()+"'
        plaats='"+e.geefPlaats()+"',
        email='"+e.geefEmail()+"',
        telefoonnummer='"+e.geefTelefoonnummer()+"'
        where ID='"+e.geefID()+"'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

  public int verwijderKlant() {
    String zoekopdracht = """
        delete from makelaar where
        id='" + e.geefID() + "'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }
}
