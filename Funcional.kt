fun main() {
    leerEntrada()
}

fun leerEntrada() {
    val entrada = readln().toInt()
    entrada.takeIf { it != 0 }
        ?.let {
            println(numeroBase1(it))
            leerEntrada()
        }
}

fun numeroBase1(numeroBase10: Int): String {
    return "1".repeat(numeroBase10)
}