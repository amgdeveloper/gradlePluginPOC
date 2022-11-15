package mysampleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyDecryptionPlugin : Plugin<Project> {

  override fun apply(project: Project) {
    project.tasks.register("myCustomDecryptionTask", CustomDecryptionTask::class.java)
  }
}