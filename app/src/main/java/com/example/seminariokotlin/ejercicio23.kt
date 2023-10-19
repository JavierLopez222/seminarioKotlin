package com.example.seminariokotlin

import kotlin.math.pow

//Crea una función que, dado un número entero, devuelva True si es un número Armstrong
// (un número que es igual a la suma de sus propios dígitos elevados a una potencia).
// Por ejemplo, 153 es un número Armstrong porque 1^3 + 5^3 + 3^3 = 153.


fun digitos(numero: Int): List<Int>{
    return numero.toString().map { it.toString().toInt() }
}
fun esNumA(numero: Int): Boolean{
    var digitos = digitos(numero)
    var n = digitos.size
    var sumaPotencias = digitos.map { it.toDouble().pow(n).toInt() }.sum()
    return sumaPotencias == numero
}

fun main(){
    var numero: Int = 153
    var resultado = esNumA(numero)
    if(resultado){
        println("El número $numero es número Armstrong")
    }else{
        println("El número $numero no es número Armstrong")
    }
}