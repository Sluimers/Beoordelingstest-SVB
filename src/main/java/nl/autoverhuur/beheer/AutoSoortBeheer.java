package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.ontwerppatroon.Singleton;
import nl.autoverhuur.data_object.AutoSoort;

public class AutoSoortBeheer extends Singleton {

  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  String merk;
  String model;
  String versie;
  int n_deuren;
  float co2_uitstoot;
  float prijs_bruto;
  float prijs_netto;
  
  public int OpslaanAutoSoort(AutoSoort autosoort) {
    String zoekopdracht ="""
        insert into autosoort values(
        '"+e.geefID()+"',
        '"+e.geefMerk()+"',
        '"+e.geefModel()+"',
        '"+e.geefVersie()+"',
        '"+e.geefN_Deuren()+"',
        '"+e.geefCO2_Uitstoot()+"',
        '"+e.geefPrijs_Bruto()+"',
        '"+e.geefPrijs_Netto()+"'
        )""";
    return jdbcTemplate.update(zoekopdracht);
  }

  public int BewerkAutoSoort() {
    String zoekopdracht ="""
        update autosoort set
        merk='"+e.geefMerk()+"',
        model='"+e.geefModel()+"',
        versie='"+e.geefVersie()+"',
        n_deuren='"+e.geefN_Deuren()+"',
        co2_uitstoot='"+e.geefCO2_Uitstoot()+"',
        prijs_bruto='"+e.geefPrijs_Bruto()+"',
        prijs_netto='"+e.geefPrijs_Netto()+"'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

  public int VerwijderAutoSoort() {
    String zoekopdracht ="""
        delete from autosoort where
        id='" + e.geefID() + "'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }
}
