package com.example.combinacionyherencia
import java.sql.DriverManager
import java.sql.DriverManager.println
import kotlin.io.println

fun main (){
    //creacion de las clases de que componen a la clase principal
    val origen1 = Origen ("Croacia")
    val origen2 = Origen ("Tailandia")
    val origen3 = Origen("Argentina")
    val edad1 = Edad(6)
    val edad2 = Edad(12)
    val edad3 = Edad(1)
    val edad4 = Edad(2)

    //creacion de las clases hijas con sus respectivos argumentos


    val perro1 = Perro(peso = 15.7, esperanzadevida = 13 , raza = "Dalmata", domestico = false, genero = "Macho", nombrecientifico = "Canis lupus familiaris",alimento = "carne" ,origen = origen1,edad = edad1 )
    //implementacion de las funciones del objeto tanto como las hereadas como las propias
    println(perro1) //Utilizacion de metodo toString
    perro1.paisDeOrigen()
    perro1.comer(false)
    perro1.ladrar()


    val gato1 = Gato(peso = 3.7, esperanzadevida = 20 , raza = "Siames", domestico = true, genero = "Hembra", nombrecientifico = "Felis catus0",alimento = "pescado", origen = origen2,edad = edad2 )
    //implementacion de las funciones del objeto tanto como las hereadas como las propias
    println(gato1) //Utilizacion de metodo toString
    gato1.paisDeOrigen()
    gato1.comer(true)
    gato1.comer()
    gato1.maullar()



    val ave1 = Ave(peso = 54.1, esperanzadevida = 4 , tipodeave = "Hornero", genero = "Hembra", nombrecientifico = "Furnarius rufus",alimento = "semillas", origen = origen3, edad = edad3, ubicacion = true)
    //implementacion de las funciones del objeto tanto como las hereadas como las propias
    println(ave1) //Utilizacion de metodo toString
    ave1.paisDeOrigen()
    ave1.comer(true)
    ave1.comer()
    ave1.volar()



    val ave2 = Ave(peso = 50.1, esperanzadevida = 4 , tipodeave = "Hornero", genero = "Macho", nombrecientifico = "Furnarius rufus",alimento = "semillas", origen = origen3, edad = edad4, ubicacion = false)
    //implementacion de las funciones del objeto tanto como las hereadas como las propias
    println(ave2) //Utilizacion de metodo toString
    ave2.paisDeOrigen()
    ave2.comer(false)
    ave2.volar()

}

