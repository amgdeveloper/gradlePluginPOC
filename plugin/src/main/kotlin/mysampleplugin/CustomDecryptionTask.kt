package mysampleplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CustomDecryptionTask : DefaultTask() {

    @TaskAction
    fun checkDependency() {
        println("hellooooo this is the checkDependency task from my plugin")
    }
}