package com.github.s0xzwasd.intellijgostructzerovaluesinspector.services

import com.intellij.openapi.project.Project
import com.github.s0xzwasd.intellijgostructzerovaluesinspector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
