package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.ontwerppatroon.Singleton;
import nl.autoverhuur.data_object.AutoSoort;

public class AutoSoortBeheer extends Singleton {

  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int opslaanAutoSoort(AutoSoort autosoort) {
    String zoekopdracht = """
        insert into autosoort values(
        '"+e.geefID()+"',
        '"+e.geefMerk()+"',
        '"+e.geefModel()+"',
        '"+e.geefVersie()+"',
        '"+e.geefNDeuren()+"',
        '"+e.geefCO2Uitstoot()+"',
        '"+e.geefPrijsBruto()+"',
        '"+e.geefPrijsNetto()+"'
        )""";
    return jdbcTemplate.update(zoekopdracht);
  }

  public int bewerkAutoSoort() {
    String zoekopdracht = """
        update autosoort set
        merk='"+e.geefMerk()+"',
        model='"+e.geefModel()+"',
        versie='"+e.geefVersie()+"',
        nDeuren='"+e.geefNDeuren()+"',
        co2Uitstoot='"+e.geefCO2Uitstoot()+"',
        prijsBruto='"+e.geefPrijsBruto()+"',
        prijsNetto='"+e.geefPrijsNetto()+"'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

  public int verwijderAutoSoort() {
    String zoekopdracht = """
        delete from autosoort where
        id='" + e.geefID() + "'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }
}
