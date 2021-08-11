package br.com.alura.bytebank

import br.com.alura.bytebank.teste.testaNullable

fun main() {
    val minhaFuncao = ::teste //:: - referencia
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}