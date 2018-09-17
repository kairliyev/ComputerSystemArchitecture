class Hex(number: Int) {
    var number = number
    var globalNumber = number


    fun decimalToHex(): String {
        val c = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
        var temp: Int = 0
        var hex = ""
        while (number != 0) {
            temp = number % 16
            hex = c[temp] + hex
            number /= 16
        }
        return "You're entered decimal number: $globalNumber and it's Hex result is $hex"
    }

    fun hexToDecimal(hex: String): String {
        var hex = hex
        var globalHex = hex
        val digits = "0123456789ABCDEF"
        hex = hex.toUpperCase()
        var dec = 0
        for (i in 0 until hex.length) {
            val c = hex[i]
            val d = digits.indexOf(c)
            dec = 16 * dec + d
        }
        return "You're entered Hex number: $globalHex and it's decimal result is $dec"
    }
}