package com.example.a04122024.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.a04122024.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}