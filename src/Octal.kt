class Octal(number: Int) {

    var number = number
    var globalNumber = number
    fun decimalToOctal() {
        val octal = IntArray(10)
        var index = 0
        while (number > 0) {
            octal[index++] = number % 8
            number /= 8
        }
        for (i in index - 1 downTo 0)
            print(octal[i])
    }

    fun octalToDecimal(): String{

        var decimal = 0
        var n = 0
        while (true) {
            if (number == 0) {
                break
            } else {
                val temp = number % 10
                decimal += (temp * Math.pow(8.0, n.toDouble())).toInt()
                number /= 10
                n++
            }
        }
        return "You're entered octal number: $globalNumber and it's decimal result $decimal"

    }

}