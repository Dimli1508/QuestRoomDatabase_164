package com.example.a04122024.dependenciesinjection

import android.content.Context
import com.example.a04122024.data.database.KrsDatabase
import com.example.a04122024.repository.LocalRepositoryMhs
import com.example.a04122024.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }

}