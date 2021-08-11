package br.com.alura.bytebank

import br.com.alura.bytebank.teste.testaNullable

fun main() {
//    testaTipoFuncaoReferencia()
//    testaFuncaoTipoClasse()

    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
    println()
    val minhaFuncaoAnonima: () -> Unit = fun(){
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaFuncaoTipoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste //:: - referencia
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}