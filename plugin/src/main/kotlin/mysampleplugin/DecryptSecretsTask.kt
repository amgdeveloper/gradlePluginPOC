package mysampleplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class DecryptSecretsTask : DefaultTask() {

    @TaskAction
    fun checkDependency() {
        println("POC: decrypting secrets")
    }
}