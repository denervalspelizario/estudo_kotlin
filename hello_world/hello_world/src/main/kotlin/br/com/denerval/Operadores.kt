package br.com.denerval

fun main(){

    println("## OPERADORES NUMÉRICOS")
    println("33 + 47 = ${33 + 47}") // 33 + 47 = 80
    println("33 - 47 = ${33 - 47}") // 33 - 47 = -14
    println("7 * 8 = ${7 * 8}")   // 7 * 8 = 56
    println("10 / 3 = ${10 / 3}")  // 10 / 3 = 3
    println("10.0 / 3.0 = ${10.0 / 3.0}")  // 10.0 / 3.0 = 3.3333333333333335
    println("10 % 3 = ${10 % 3}") // o resto de 10 / 3 é 1


    println("## OPERADORES DE COMPARAÇÃO")

    val a = 10
    val b = 5

    if (a == b) {
        println("a é igual a b")
    } else {
        println("a não é igual a b")
    }

    if (a != b) {
        println("a não é igual a b")
    } else {
        println("a é igual a b")
    }

    println("#########################")
    val x = 15
    val y = 20

    if (x < y) {
        println("x é menor que y")
    }

    if (y > x) {
        println("y é maior que x")
    }

    if (x <= y) {
        println("x é menor ou igual a y")
    }

    if (y >= x) {
        println("y é maior ou igual a x")
    }

    println("##Operador Elvis")
    val nome: String? = null
    val nomeNaoNulo = nome ?: "Valor Padrão"

    println(nomeNaoNulo)

    println("#########################")
    val str1 = "abc"
    val str2 = "def"

    val resultado = str1.compareTo(str2)

    if (resultado < 0) {
        println("str1 é menor que str2")
    } else if (resultado > 0) {
        println("str1 é maior que str2")
    } else {
        println("str1 é igual a str2")
    }


}