package com.example.seminariokotlin


//Crea una función que obtenga el número máximo de una lista de números

fun maxI(lista: List<Int>): Int{
    var max = lista[0]

    for(i in 1 until lista.size){
        if(lista[i] > max){
            max = lista[i]
        }
    }
    return max
}

fun main(){

}