package com.example.a04122024.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.a04122024.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow  // Correct import for Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>  // Use Flow from kotlinx.coroutines.flow

    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String): Flow<Mahasiswa>  // Use Flow from kotlinx.coroutines.flow

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}
