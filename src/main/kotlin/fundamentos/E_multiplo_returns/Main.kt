package fundamentos.E_multiplo_returns

class Main {
}

/*
    return em um If dado a seu chamado o restante do bloco de código não é executado então ele tem um efeito colateral.

 */
fun main() {
    val entrada = readLine()?: ""
    var numero: Int? = entrada.toIntOrNull()

    if (!(numero == null)) {
        print("NÃO ESTÁ  FAZIO")
        return
    }
    println("ELE ESTÁ NULO")
}