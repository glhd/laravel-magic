package com.github.inxilpro.laravelmagic.services

import com.intellij.openapi.project.Project
import com.github.inxilpro.laravelmagic.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
