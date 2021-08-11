package br.com.alura.bytebank

fun main() {
    testaTipoFuncaoReferencia()
    testaFuncaoTipoClasse()

//    val minhaFuncaoLambda = {
//        println("Executa como lambda")
//    }
//    println(minhaFuncaoLambda())
//    println()
//    val minhaFuncaoAnonima: () -> Unit = fun(){
//        println("Executa como anonima")
//    }
//    println(minhaFuncaoAnonima())
}

fun testaFuncaoTipoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}