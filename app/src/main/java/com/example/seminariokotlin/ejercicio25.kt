package com.example.seminariokotlin

//Crea una función que encuentre el número más pequeño en una matriz bidimensional (una lista de listas).

fun masPequeño(matriz: Array<Array<Int>>): Int?{
    var numMasPequeño = matriz[0][0]
    for (fila in matriz) {
        for (num in fila) {
            if (num < numMasPequeño) {
                numMasPequeño = num
            }
        }
    }

    return numMasPequeño
}

fun main(){
    var matrizPrincipal = arrayOf(
        arrayOf(1, 25, 2),
        arrayOf(78, 4, 32),
        arrayOf(24, 7, 12)
    )
    var resultado = masPequeño(matrizPrincipal)
    println("El número más pequeño de la matriz introducida de puta madre es: $resultado")
}