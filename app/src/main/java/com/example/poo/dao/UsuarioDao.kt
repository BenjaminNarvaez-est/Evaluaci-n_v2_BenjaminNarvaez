package com.example.poo.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.poo.entidades.Usuario

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM Usuario")
    fun obtenerUsuario():List<Usuario>
    @Insert
    fun insertarUsuario(user:Usuario)
    @Query("DELETE FROM Usuario WHERE idUser = :id")
    fun eliminarUsuario(id:Int)
    @Query("UPDATE Usuario set nombreComp = :nombre, email = :email, numRepo = :numRepo WHERE idUser = :id")
    fun updateUsuario(id:Int, nombre:String, email:String, numRepo:Int)


}