package tech.jhipster.lite.generator.server.springboot.common.domain;

import java.util.Optional;
import tech.jhipster.lite.generator.project.domain.Project;

public interface SpringBootCommonService {
  void addProperties(Project project, String key, Object value);
  void addPropertiesTest(Project project, String key, Object value);
  void addPropertiesNewLine(Project project);
  void addPropertiesTestNewLine(Project project);
  void addPropertiesComment(Project project, String text);
  void addPropertiesTestComment(Project project, String text);

  void addLogger(Project project, String packageName, Level level);
  void addLoggerTest(Project project, String packageName, Level level);

  Optional<String> getProperty(Project project, String key);
  boolean isSetWithMySQLOrMariaDBDatabase(Project project);
  boolean isDatabaseUseSequences(Project project);

  void updateIntegrationTestAnnotation(Project project, String className);
}
