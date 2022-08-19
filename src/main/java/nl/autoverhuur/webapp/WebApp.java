package nl.autoverhuur.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {

  @GetMapping("/")
  public String index() {
    return ("test");
  }

  @GetMapping("/error")
  public String error() {
    return ("error");
  }
}
