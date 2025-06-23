package fundamentos.I_nullsafety

class cliente(val nome : String) {

    fun printarTamanhoNome():Int? {
        return nome.length
    }

}

/**
 * @author diogenesssantos
 * null safetty do kotlin no auxiliar no erro de NullPointerExcepiton
 */

fun main() {

    var nome : Any = retornaTipoNullable() ?: "Diogenes"
    print(nome)
    println()

    var cliente = cliente("diognes")

    var valor = cliente?.printarTamanhoNome()?: "Está nulo"

    print(valor)
}



fun retornaTipoNullable () :Any? {
    return null;
}