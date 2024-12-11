package com.example.a04122024

import android.app.Application
import com.example.a04122024.dependenciesinjection.ContainerApp
import com.example.a04122024.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp //

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // membuat instance
        //instance adalah object yang dibuat dari class
    }
}