package com.github.flymantou.ippt.services

import com.github.flymantou.ippt.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
        println(project.basePath)
    }
}
