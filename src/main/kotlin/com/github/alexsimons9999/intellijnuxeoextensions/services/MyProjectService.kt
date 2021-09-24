package com.github.alexsimons9999.intellijnuxeoextensions.services

import com.intellij.openapi.project.Project
import com.github.alexsimons9999.intellijnuxeoextensions.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
