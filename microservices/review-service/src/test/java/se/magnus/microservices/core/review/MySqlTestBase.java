package se.magnus.microservices.core.review;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.mysql.MySQLContainer;

import java.time.Duration;

public abstract class MySqlTestBase {

  @Container
  @ServiceConnection
  static final MySQLContainer database =  // novo pacote TC 2.0
          new MySQLContainer("mysql:9.2.0")
                  .withStartupTimeout(Duration.ofSeconds(300));
}
