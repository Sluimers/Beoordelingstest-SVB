package nl.autoverhuur.beheer;

import org.springframework.jdbc.core.JdbcTemplate;
import nl.autoverhuur.data_object.Auto;
import nl.autoverhuur.ontwerppatroon.Singleton;

public class AutoBeheer extends Singleton {

  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int opslaanAuto(Auto auto) {
    String zoekopdracht = """
        insert into auto values(
        '"+e.geefID()+"',
        '"+e.geefAutoSoortID()+"',
        '"+e.geefJaarkilometerstand()+"',
        '"+e.geefContractduur()+"',
        '"+e.geefRentevoet()+"',
        '"+e.geefNettoprijs()+"'
        )""";
    return jdbcTemplate.update(zoekopdracht);
  }

  public int bewerkAuto() {
    String zoekopdracht = """
        update auto set
        jaarkilometerstand='"+e.geefJaarkilometerstand()+"',
        contractduur='"+e.geefContractduur()+"',
        rentevoet='"+e.geefRentevoet()+"',
        nettoprijs='"+e.geefNettoprijs()+"',
        where id='"+e.geefID()+"'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }

  public int verwijderAuto() {
    String zoekopdracht = """
        delete from auto where
        id='" + e.geefID() + "'
        """;
    return jdbcTemplate.update(zoekopdracht);
  }
}
