package com.example.seminariokotlin

//Crea una función que determine si dos números son primos relativos.

fun maximoComunDivisorDos(numero1: Int, numero2: Int): Int{
    var numeroUno = numero1
    var numeroDos = numero2

    while(numeroDos != 0){
        var temp = numeroDos
        numeroDos = numeroUno % numeroDos
        numeroUno = temp
    }
    return numeroUno
}
fun numerosPrimosRelativos(numero1: Int, numero2: Int):Boolean {
    var mcd = maximoComunDivisorDos(numero1, numero2)
    return mcd == 1
}

fun main(){
    var n1: Int = 35
    var n2: Int = 48

    if(numerosPrimosRelativos(n1, n2)){
        println("Son primos relativos los números: $n1 y $n2")
    }else{
        println("No son primos relativos los números: $n1 y $n2")
    }
}
