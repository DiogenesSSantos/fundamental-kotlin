package fundamentos.C_funcoes

import kotlin.random.Random


fun main() {
    semParametro()
    comParametro("Bom dia a todos")
    comParametroPadraoCasoNaoEspecificado()
    comParametroPadraoCasoNaoEspecificado("Severino Bio")
    println(comParametroComRetornoTipoDiferentes("Tamanho dessa String"))
}

fun semParametro() {
    println("Olá mundo")
}

fun comParametro(mensagem : String) {
    println("A sua mensagem é ${mensagem}")
}

fun comParametroPadraoCasoNaoEspecificado(nome : String = "Dio") {
    if (nome.equals("Dio")) {
        println("NOME PADRÃO UTILIZADO -> ${nome}")
        return
    }
    println("Vc passou um nome personalizado ${nome}")

}


fun semParametroComRetorno() :Int {
    val random = Random
    random.nextInt(1 , 100)
    return random.nextInt(1 , 100)
}

fun comParametroComRetornoTipoDiferentes (nome : String ) : Number {
    return  nome.length;
}
