package br.com.denerval

fun main(){
    // Exemplo de loop for para imprimir números de 1 a 5
    for (i in 1..5) {
        println(i)
    }

    // Outro exemplo usando downTo para contar de 5 a 1
    println("Contagem regressiva:")
    for (j in 5 downTo 1) {
        println(j)
    }

    // Loop para iterar sobre elementos de uma lista
    val frutas = listOf("Maçã", "Banana", "Morango")
    println("Lista de frutas:")
    for (fruta in frutas) {
        println(fruta)
    }

    // Loop usando o índice em uma lista
    println("Índices da lista de frutas:")
    for (indice in frutas.indices) {
        println("Índice $indice: ${frutas[indice]}")
    }

    // Loop usando o forEach para iterar sobre elementos de uma lista
    println("Usando forEach para listar as frutas:")
    frutas.forEach { fruta ->
        println(fruta)
    }
}