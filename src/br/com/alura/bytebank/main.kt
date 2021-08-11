package br.com.alura.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaFuncaoTipoClasse()

    val minhaFuncaoLambda: (Int, Int) -> Int =  {
        a, _ -> a + 1
    }
    println(minhaFuncaoLambda(15, 10))

    println()
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a: Int, b: Int) : Int {
        return a + b
    }
    println(minhaFuncaoAnonima(10,10))

    println()
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if(salario > 1000.00) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculaBonificacao(1100.00))

    println()
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
}
    println(calculaBonificacaoAnonima(1100.0))
}

fun testaTipoFuncaoClasse() {
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