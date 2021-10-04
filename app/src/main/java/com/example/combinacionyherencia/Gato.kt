package com.example.combinacionyherencia

class Gato (): Animal(peso = 0.0, esperanzadevida = 0 , genero ="", nombrecientifico = "", alimento = "",origen = Origen(""),edad = Edad (0)) { //clase hija que hereda de "Animal" por lo que recibe los atributos de dicha clase
    //atributos difrenciados de la clase padre
    var raza : String = ""
    var domestico : Boolean = true

        set(value) { //get personalizado que permite activar un metodo en el principio de la ejecucion
            if (value == true){
                gatoodomestico()

            }
            else{
                println("Este gato es salvaje.")
            }


        }

    constructor(peso: Double , esperanzadevida: Int, genero: String, nombrecientifico: String, domestico : Boolean, raza: String, alimento : String,origen: Origen, edad: Edad) : this(){ //Constructor de la clase hija que tiene los atributos de la clase padre ademas de los agregados por la misma clase
        this.peso = peso
        this.genero = genero
        this.esperanzaDeVida = esperanzadevida
        this.nombreCientifico=nombrecientifico
        this.domestico = domestico
        this.raza  = raza
        this.origen = origen
        this.alimento = alimento
        this.edad = edad
    }

    //metodos unicos de la clase.
    fun gatoodomestico (){
        println ("Este gato es domestico")
    }

    fun maullar (){
        println("Miau Miau")
    }

    //Funciones heredadas y sobreescritas de la clase padre "Animal"
    override fun comer() {
        println("El "+this.raza+" esta comiendo "+alimento)

    }
    fun comer (boolean: Boolean){ //sobre escritura de metodo
        if (boolean == true){
            println("El gato quiere comer "+alimento)
        }
        else
            println("el gato no tiene hambre")
    }

    override fun toString(): String {
        return "La raza de gatos es: $raza. Su genero es: $genero. Su nombre cientifico es: $nombreCientifico. Tiene un peso de $peso kg. Su esperanza de vida es de $esperanzaDeVida años"
    }
    override fun paisDeOrigen() {
        println("el pais de origen del "+raza+" es "+origen.paisDeOrigen)
    }

}