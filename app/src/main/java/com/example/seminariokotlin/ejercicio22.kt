package com.example.seminariokotlin

//Crea una función que, dado un número, devuelva True si es un número perfecto
// (la suma de sus divisores propios positivos es igual al número),
// o False en caso contrario.

fun esPerfecto(numero: Int): Boolean{
    var sumaDeDivisores: Int = 0
    for(i in 1 until numero){
        if(numero % i == 0)
            sumaDeDivisores += i
    }
    return sumaDeDivisores == numero
}

fun main(){
    var numero: Int = 40
    var resultado = esPerfecto(numero)
    if(resultado){
        println("El número $numero es un número perfecto")
    }else{
        println("El número $numero no es un número perfecto")
    }
}
