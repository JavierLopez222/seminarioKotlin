package com.example.seminariokotlin

//Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11

fun sumaDigitosNumero(numero: Int): Int{
    var suma: Int = 0
    var num = numero

    while(num != 0){
        suma += num % 10
        num /= 10
    }
    return suma
}

fun main(){
    var numero: Int = 245
    var resultado = sumaDigitosNumero(numero)

    println("La suma de los dígitos que componen el número $numero es $resultado")
}

