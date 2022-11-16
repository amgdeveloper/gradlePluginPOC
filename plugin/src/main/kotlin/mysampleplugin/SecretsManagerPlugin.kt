package mysampleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SecretsManagerPlugin : Plugin<Project> {

  override fun apply(project: Project) {
    project.tasks.register("decryptSecretsTask", DecryptSecretsTask::class.java)
  }
}