package com.example.poo.datos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.poo.dao.UsuarioDao
import com.example.poo.entidades.Commit
import com.example.poo.entidades.User


@Database(entities = [User::class, Commit::class], version = 1  )

abstract class UsuarioDataBase: RoomDatabase() {
    abstract fun usuarioBD(): UsuarioDao

}


