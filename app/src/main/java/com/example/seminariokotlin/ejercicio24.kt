package com.example.seminariokotlin

//Crea una función que encuentre el número más grande en una matriz bidimensional (una lista de listas).

fun masGrande(matriz: Array<Array<Int>>): Int?{
    var numMasGrande = matriz[0][0]
    for (fila in matriz) {
        for (num in fila) {
            if (num > numMasGrande) {
                numMasGrande = num
            }
        }
    }

    return numMasGrande
}
fun main(){
    var matrizPrincipal = arrayOf(
        arrayOf(1, 25, 2),
        arrayOf(78, 4, 32),
        arrayOf(24, 7, 12)
    )
    var resultado = masGrande(matrizPrincipal)
    println("El número más grande de la matriz introducida anteriormente es: $resultado")
}