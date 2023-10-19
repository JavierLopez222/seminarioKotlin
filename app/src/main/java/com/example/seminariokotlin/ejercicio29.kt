package com.example.seminariokotlin

//Crea una función que determine si una cadena de texto es un anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras, pero en un orden diferente.

fun funcionAnagrama(textoUno: String, textoDos: String): Boolean{
    var textoUnoCorregido = textoUno.replace("\\s".toRegex(),"").toLowerCase()
    var textoDosCorregido = textoDos.replace("\\s".toRegex(),"").toLowerCase()

    if(textoUnoCorregido.length != textoDosCorregido.length){
        return false
    }
    var listaUno = textoUnoCorregido.toCharArray().sorted()
    var listaDos = textoDosCorregido.toCharArray().sorted()

    return listaUno == listaDos
}
fun main(){
    var textoUnoEjemplo: String = "hola"
    var textoDosEjemplo: String = "aloh"

    var resultado = funcionAnagrama(textoUnoEjemplo, textoDosEjemplo)
    if(resultado){
        println("Los textos introducidos son anagramas")
    }else{
        println("Los textos introducidos no son anagramas")
    }
}