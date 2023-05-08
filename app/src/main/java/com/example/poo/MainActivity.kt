package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.poo.datos.UsuarioDataBase
import com.example.poo.entidades.Commit
import com.example.poo.entidades.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var roomDatabase = Room.databaseBuilder(this,UsuarioDataBase::class.java,
            "UsuarioDataBase").build()

        lifecycleScope.launch(Dispatchers.IO){
            roomDatabase.usuarioBD().insertarUsuario(user= User(nombreComp = "Mae",
                email = "Maesitomaeman@gmai.com", numRepo = 1))

            var listaUsuario = roomDatabase.usuarioBD().obtenerUsuario()

            for (iterador in listaUsuario ){
                println("${iterador.idUser},${iterador.nombreComp}, ${iterador.email}, ${iterador.numRepo}")
            }

        }

        lifecycleScope.launch(Dispatchers.IO){
            roomDatabase.usuarioBD().insertarCommit(commit= Commit(nombreCommit = "Evaluación Persistencia",
                descrip = "Evaluacion sumativa de la clase de desarrollo de aplicaciones moviles II",
                date = "08/05/2023", autor = "Benjamin Narvaez")
            )

            var listarCommit = roomDatabase.usuarioBD().obtenerCommit()

            for (iterador in listarCommit ){
                println("${iterador.idCommit},${iterador.nombreCommit}, ${iterador.descrip}, ${iterador.date}, ${iterador.autor}")
            }

        }

    }
}