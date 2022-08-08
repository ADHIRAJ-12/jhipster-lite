package tech.jhipster.lite.generator.packagemanager.npm.infrastructure.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import tech.jhipster.lite.IntegrationTest;
import tech.jhipster.lite.generator.packagemanager.npm.domain.NpmDomainService;

@IntegrationTest
class NpmBeanConfigurationIT {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void shouldGetBean() {
    assertThat(applicationContext.getBean("npmService")).isNotNull().isInstanceOf(NpmDomainService.class);
  }
}
