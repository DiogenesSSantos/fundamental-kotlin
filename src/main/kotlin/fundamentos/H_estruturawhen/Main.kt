package fundamentos.H_estruturawhen


fun main() {

    println(estruturaWhen(78))
    println(estruturaWhen("String"))

    println("_____________________")
    var numero: Int?

    numero  = readLine()?.toIntOrNull()

    var resposta = when {
        numero== 12 ->  "Diogenes"
        numero is Number -> true
        numero == null -> "Passaram o valor null"
        else -> null
    }

    if ( resposta == null){
        println("passaram á resposta nula")
        return
    }
    println(resposta)
    println(numero)



}



/*
    Estrutura when se assemelha o switch case do java, mas sem a necessecidade do break;
    como recebemos Any(qualquer tipo) e retornamos Any(Qualquer tipo)  podemos obter resposta diferente, diferencial
    do kotlin essa estrutura!
 */

fun estruturaWhen(valor : Any) : Any {
    when(valor) {
        is String -> return "Diogenes"
        else -> return  false
    }
}