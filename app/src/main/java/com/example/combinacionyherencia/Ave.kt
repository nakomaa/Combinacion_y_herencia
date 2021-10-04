package com.example.combinacionyherencia

class Ave (): Animal(peso = 0.0, esperanzadevida = 0 , genero ="", nombrecientifico = "", alimento = "",origen = Origen(""),edad = Edad (0)) { //clase hija que hereda de "Animal" por lo que recibe los atributos de dicha clase
    //atributos difrenciados de la clase padre
    var tipoDeAve : String = ""
    var ubicacion : Boolean = true
        set(value) { //get personalizado que permite activar un metodo en el principio de la ejecucion
            if (value == true){
                ubicacionReal()


            }
            else
                println("El ave se encuentra migrando")
        }


    constructor(peso: Double , esperanzadevida: Int, genero: String, nombrecientifico: String, tipodeave:String, alimento : String,origen: Origen, edad: Edad,ubicacion : Boolean) : this(){ //Constructor de la clase hija que tiene los atributos de la clase padre ademas de los agregados por la misma clase
        this.peso = peso
        this.genero = genero
        this.esperanzaDeVida = esperanzadevida
        this.nombreCientifico=nombrecientifico
        this.tipoDeAve = tipodeave
        this.origen =origen
        this.alimento = alimento
        this.edad = edad
        this.ubicacion = ubicacion
    }

    //metodos unicos de la clase.
    fun volar (){
        println("El "+tipoDeAve+ " salio volando.")
    }
    fun ubicacionReal (){
        println("El ave no se encuentra en proceso de migracion.")
    }

    //Funciones heredadas y sobreescritas de la clase padre "Animal"
    override fun comer() {
        println("El "+tipoDeAve+" Esta comiendo "+alimento)
    }
    fun comer (boolean: Boolean){ //sobre escritura de metodo
        if (boolean){
            println("El "+tipoDeAve+" quiere comer "+alimento)
        }
        else{
            println("El "+tipoDeAve+" no quiere comer")
        }
    }

    override fun toString(): String {
        return "El ave es un $tipoDeAve. Su genero es: $genero. Su nombre cientifico es: $nombreCientifico. Tiene un peso de $peso g. Su esperanza de vida es de $esperanzaDeVida años"
    }

    override fun paisDeOrigen() {
        println("el pais de origen es del "+tipoDeAve+" es "+origen.paisDeOrigen)
    }

}