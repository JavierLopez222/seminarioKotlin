package com.example.seminariokotlin

fun contarLetras(letra: Char, texto: String): Int{
    var contador: Int = 0
    for(i in texto){
        if(i == letra){
            contador++
        }
    }
    return contador
}

fun main(){
    var letra = 'o'
    var texto = "Hola me llamo Javier"

    var cantidadApariciones = contarLetras(letra, texto)
    println("La letra $letra aparece en el texto: $texto un total de $cantidadApariciones veces")
}

