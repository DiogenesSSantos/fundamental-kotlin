package fundamentos.F_estruturaderepeticoes

/**
 * @author
 *
 * As estrutura de repetições as estruturas de repetição permitem
 * executar um bloco de código diversas vezes de forma controlada. Vamos resumir as principais:
 * divida em 3 tipos, for // while / do while
 */

fun main() {
    estruturaFor()
    println("__________")
    estruturaFor(10)

    println()
    println("______________Estrutura While__________________")
    estruturaWhile()



}

fun estruturaFor(numero: Int = 30) {
    for (contador in 0..numero) {
        print("${contador}_")
    }

}


fun estruturaWhile() {
    var valor : Int = 1
    while (true) {
        if (valor == 10) {
            print("É igual a 10")
            break
        }
        print("ACRESCENTANDO +1 em ${valor}\n")
        valor++

    }
}