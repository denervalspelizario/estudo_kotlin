package br.com.denerval

// Definindo uma função que soma dois números inteiros
fun somar(a: Int, b: Int): Int { // esse int no final estou indicando que o return da função será inteiro
    return a + b
}

fun subtrair(a:Int, b:Int): Int {
    return a - b
}

fun main() {
    // Chamando a função e imprimindo o resultado
    val resultado = somar(5, 3)

    val resultadoSubtrair = subtrair( 10 ,20)
    println("A soma é: $resultado")
    println("A subtração é $resultadoSubtrair")
}
