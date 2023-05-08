package com.example.poo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Usuario(
    @PrimaryKey(autoGenerate = true) val idUser:Int = 0,
    @ColumnInfo(name = "nombreComp") val nombreComp:String ?,
    @ColumnInfo(name = "email") val email:String ?,
    @ColumnInfo(name = "numRepo") val numRepo:Int ?,




)





