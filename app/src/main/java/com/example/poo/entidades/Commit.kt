package com.example.poo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Commit(
    @PrimaryKey(autoGenerate = true) val idCommit:Int = 0,
    @ColumnInfo(name = "nombreCommit") val nombreCommit:String ?,
    @ColumnInfo(name = "descrip") val descrip:String ?,
    @ColumnInfo(name = "date") val date:String ?,
    @ColumnInfo(name = "autor") val autor:String ?,
)
