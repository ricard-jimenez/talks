package de.rieckpil.talks.problem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

class DeliveryIT extends AbstractIntegrationTest {

  @Test
  void shouldDeliverMessageToCustomer(@Autowired Environment environment) {
    System.out.println(environment.getProperty("message"));
  }
}
