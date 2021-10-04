package com.example.combinacionyherencia



open class Animal{//clase padre que va a heredar a las clases hijas. Por eso se declara como "open"
    //atributos de las clases que se van a heredar
    var peso : Double = 0.0
    var esperanzaDeVida : Int = 0
    var genero : String = ""
    var nombreCientifico : String = ""
    var alimento : String = ""
    // 2 atributos del tipo de las clases de la cual se va a generar la composicion.
    var origen : Origen
    var edad : Edad

    //Constructor de la clase padre la cual va a contener los atributos a demas de los atributos del tipo de las clases de la cual va a estar compuesta.
    constructor(peso : Double, esperanzadevida: Int, genero : String, nombrecientifico: String, alimento : String ,origen: Origen, edad: Edad)  { //se piden los argumentos que se van a utilizar
        //se setea con los argumentos recibidos a los atributos de la clase.
        this.peso = peso
        this.esperanzaDeVida = esperanzadevida
        this.genero = genero
        this.nombreCientifico = nombrecientifico
        this.origen = origen
        this.alimento = alimento
        this.edad = edad
    }
//metodos open los cuales se van a poder utilizar en las clases hijas.
    open fun comer (){
        print("El animal esta comiendo")
    }
    open fun paisDeOrigen(){
        println("")
    }




}