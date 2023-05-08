package com.example.poo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.poo.entidades.Commit
import com.example.poo.entidades.User

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM User")
    fun obtenerUsuario():List<User>
    @Insert
    fun insertarUsuario(user:User)
    @Query("DELETE FROM User WHERE idUser = :id")
    fun eliminarUsuario(id:Int)
    @Query("UPDATE User set nombreComp = :nombre, email = :email, " +
            "numRepo = :numRepo WHERE idUser = :id")
    fun updateUsuario(id:Int, nombre:String, email:String, numRepo:Int)

    @Query("SELECT * FROM Commit")
    fun obtenerCommit():List<Commit>
    @Insert
    fun insertarCommit(commit:Commit)
    @Query("DELETE FROM Commit WHERE idCommit = :id")
    fun eliminarCommit(id:Int)
    @Query("UPDATE Commit set nombreCommit = :nombreCom, descrip = :desc, " +
            "date = :date, autor = :autor WHERE idCommit = :id")
    fun updateCommit(id:Int, nombre:String, email:String, numRepo:Int)

}
