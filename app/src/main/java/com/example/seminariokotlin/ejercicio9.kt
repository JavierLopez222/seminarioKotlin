package com.example.seminariokotlin
//Crea una función que calcule el máximo común divisor de dos números naturales

fun maximoComunDivisor(numero1: Int, numero2: Int): Int{
    var numeroUno = numero1
    var numeroDos = numero2

    while(numeroDos != 0){
        var temp = numeroDos
        numeroDos = numeroUno % numeroDos
        numeroUno = temp
    }
    return numeroUno
}

fun main(){
    var n1: Int = 48
    var n2: Int = 18
    var mcd = maximoComunDivisor(n1, n2)
    println("Máximo común divisor de los números $n1, $n2 es $mcd")
}
