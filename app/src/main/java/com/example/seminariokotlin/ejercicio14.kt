package com.example.seminariokotlin

//Crea una función que dado un número n imprima el siguiente ‘mosaico’
//(para n = 6):
//1
//22
//333
//4444
//55555
//666666

fun mosaico(numero: Int){
    for(i in 1..numero){
        repeat(i){
            println(i)
        }
        println()
    }
}

fun main(){
    var numero = 6
    println(mosaico(numero))
}

