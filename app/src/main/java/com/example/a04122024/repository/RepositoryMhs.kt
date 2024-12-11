package com.example.a04122024.repository

import com.example.a04122024.entity.Mahasiswa

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)
}