fun main() {
    val salario = readlnOrNull()?.toFloat()
    val adicional = readlnOrNull()?.toFloat()

    if (salario == null || adicional == null || salario < 0 || adicional < 0) {
        println("salario ou adicional invalidos")
        return
    }

    val aliquota = if (salario > 0 && salario <= 1100) {
        0.05F
    } else if (salario > 1100 && salario <= 2500) {
        0.1F
    } else {
        0.15F
    }

    val imposto = salario * aliquota
    println((salario - imposto) + adicional)
}