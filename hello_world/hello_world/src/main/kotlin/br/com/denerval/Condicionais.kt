package br.com.denerval

fun main(){

    println("IF - ELSE")
    val numero = 10

    if (numero > 0) {
        println("O número é positivo")
    } else if (numero < 0) {
        println("O número é negativo")
    } else {
        println("O número é zero")
    }


    println("WHEN - é o famoso switch")
    val diaSemana = 3
    when (diaSemana) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }

    println("Ternario")
    val temperatura = 25
    val estado = if (temperatura > 30) "Quente" else "Agradável"
    println("O estado do clima é $estado")

    println("IS - checagem tipo is")
    val valor: Any = "Olá"

    if (valor is String) {
        println("O valor é uma String de comprimento ${valor.length}")
    } else {
        println("O valor não é uma String")
    }


}