package br.com.denerval


fun main (){
    println("Hello World!!")

    val teste = 1    // val tem ideia de const
    var teste02 = 2  // var tem ideia de variavel
    teste02 = 3

    // outros tipos de variaveis
    val byte: Byte = 1
    var short: Short = 30000
    var long: Long = 3000000
    val inteiro: Int = 888
    val numero: Int = 42
    val decimal: Double = 3.14
    val decimal02: Float = 3.14f
    val letra: Char = 'A'
    val verdadeiro: Boolean = true
    val texto: String = "Olá, Kotlin!"

    // arrays
    val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val lista: List<String> = listOf("item1", "item2", "item3")
    val mapa: Map<String, Int> = mapOf("um" to 1, "dois" to 2, "três" to 3)
    val valorNulo: String? = null
}