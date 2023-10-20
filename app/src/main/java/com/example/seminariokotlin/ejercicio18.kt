package com.example.seminariokotlin

//Crea una función que determine si un número es primo.
fun numeroPrimo(numero: Int): Boolean{
    if(numero <=1){
        return false
    }
    for(i in 2 until numero){
        if(numero % i == 0){
            return false
        }
    }
    return true
}
fun main(){
    var numero: Int = 0
    var resultado = numeroPrimo(numero)
    if(resultado){
        println("El número $numero es primo")
    }else{
        println("El número $numero no es primo")
    }
}