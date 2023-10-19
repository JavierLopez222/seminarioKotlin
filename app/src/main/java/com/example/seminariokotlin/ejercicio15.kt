package com.example.seminariokotlin

//Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos que determine si los elementos,
// uno a uno, de ambos arrays son iguales

fun sonIguales(array1: IntArray, array2: IntArray):BooleanArray{
    var resultado = BooleanArray(array1.size)
    for(i in array1.indices){
        resultado[i] = array1[i] == array2[i]

    }
    return resultado
}

fun main(){
    var array1= intArrayOf(9,8,7,6,5,4,3,2,1)
    var array2= intArrayOf(1,2,3,4,5,6,7,8,9)
    try {
        var resultado = sonIguales(array1, array2)
        for(i in resultado.indices){
            println("Elemento \${i + 1}: ${if (resultado[i]) "Igual" else "Diferente"}")
        }
    }catch (e: Exception){
        println("Se ha cometido un error en la comparación de array1: $array1 y array2: $array2")
    }
}