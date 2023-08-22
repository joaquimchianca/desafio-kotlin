import kotlin.math.round

fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    val res = saldoAtual + valorDeposito - valorRetirada
    println("Saldo atualizado na conta: " + res.round(1))

}

fun Float.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}