fun main() {
    print("Введите число: ")
    val chislo = readLine()!!.toDouble()

    if (chislo < 0) {
        println("Корень из отрицательного числа неетуу")
    } else {
        val koren = Math.sqrt(chislo)
        println("Корень из $chislo равен $koren")
    }
}
