package fundamentos.D_condicionais

fun main () {
//    val entrada = readLine() ?: "0"
    print("DIGITE SUA NOTA : ")
    var nota  = readLine()?.toIntOrNull() ?: 0


    if (nota >= 6 ) {
        print("VC FOI APROVADO COM A NOTA ${nota}")
    }else {
        print("VC ESTÁ EM RECUPERAÇÃO")
    }

}