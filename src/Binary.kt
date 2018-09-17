class Binary(number: Int) {

    var number = number
    var globalNumber = number
    fun decimalToBinary() {
        val binary = IntArray(25)
        var index = 0
        while (number > 0) {
            binary[index++] = number % 2
            number /= 2
        }
        for (i in index - 1 downTo 0) {
            print(binary[i])
        }
    }

    fun binaryToDecimal(): String {
        var decimal = 0
        var n = 0
        while (true) {
            if (number == 0) {
                break
            } else {
                val temp = number % 10
                decimal += (temp * Math.pow(2.0, n.toDouble())).toInt()
                number /= 10
                n++
            }
        }
        return "You're entered octal number: $globalNumber and it's decimal result $decimal"
    }
}