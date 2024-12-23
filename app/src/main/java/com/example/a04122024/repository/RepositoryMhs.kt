package com.example.a04122024.repository

import com.example.a04122024.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs() : Flow<List<Mahasiswa>>

    fun getMhs (nim: String) : Flow<Mahasiswa>

    suspend fun  deleteMhs (mahasiswa: Mahasiswa)

    suspend fun updateMhs (mahasiswa: Mahasiswa)
}