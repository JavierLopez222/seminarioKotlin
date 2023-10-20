package com.example.seminariokotlin

//Crea una función que calcule el producto de todos los elementos en
//una lista de números

fun hacerProducto(lista: List<Int>): Int{
    var producto: Int = 1
    for(i in lista){
        producto *= i
    }
    return producto
}

fun main(){
    var listaPrueba = listOf<Int>(1,2,3,4,5)
    var resultado = hacerProducto(listaPrueba)
    println("El producto de todos los elementos de la lista es $resultado")
}