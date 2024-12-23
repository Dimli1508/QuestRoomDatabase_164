package com.example.a04122024.repository

import com.example.a04122024.data.dao.MahasiswaDao
import com.example.a04122024.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }
    override fun getMhs(nim: String): Flow<Mahasiswa> {  //mengambil data mahasiswa berdasarkan nim
        return mahasiswaDao.getMahasiswa(nim)
    }
    override suspend fun deleteMhs(mahasiswa: Mahasiswa) { //menghapus data mahasiswa
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }
    override suspend fun updateMhs(mahasiswa: Mahasiswa) { //memperbarui data mahasiswa dalam database
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }
}