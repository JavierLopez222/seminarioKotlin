package com.example.seminariokotlin

//Crea una función que dada una cadena de texto con formato Emmet devuelva su correspondiente etiqueta HTML,
// teniendo en cuenta sólo los atributos de clase e id.


fun emmetToHtml(emmet: String): String {
    val tokens = emmet.split(" ")
    var html = ""
    for (token in tokens) {
        if (token.startsWith(".") || token.startsWith("#")) {
            html += " $token"
        }
    }
    return html
}


fun main() {

}
