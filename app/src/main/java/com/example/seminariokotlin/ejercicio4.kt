package com.example.seminariokotlin

//Crea una función que determine si una cadena de texto es un palíndromo.

fun seraPalindromo(cadena: String): Boolean{
    //lo primmero es eliminar los espacios y convertimos el texto a minúsculas
    var cadenaP = cadena.replace("\\s".toRegex(), "").toLowerCase()
    //Vemos si la cadena es igual al reverso del texto
    return cadenaP == cadenaP.reversed()
}

fun main(){
    var texto = "Anita lava la tina"
    if(seraPalindromo(texto)){
        println("$texto es un palíndromo")
    }else{
        println("$texto no es un palñindromo")
    }
}