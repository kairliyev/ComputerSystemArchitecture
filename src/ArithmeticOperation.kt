class ArithmeticOperation : ArithmeticOperationsInterface {

    var sum = 0
    override fun addBinary(a: String, b: String) {
        initialBin(a, b, '+')
    }

    override fun minusBinary(a: String, b: String) {
        initialBin(a, b, '-')
    }

    override fun multBinary(a: String, b: String) {
        initialBin(a, b, '*')
    }

    override fun divisionBinary(a: String, b: String) {
        initialBin(a, b, '/')
    }

    fun initialBin(a: String, b: String, c: Char) {
        val fNumber = a.toInt(Const.binary)
        val sNumber = b.toInt(Const.binary)

        when (c) {
            '*' -> {
                sum = fNumber * sNumber
                val b = Binary(sum).decimalToBinary()
            }
            '/' -> {
                sum = fNumber / sNumber
                Binary(sum).decimalToBinary()
            }
            '+' -> {
                sum = fNumber + sNumber
                Binary(sum).decimalToBinary()
            }
            '-' -> {
                sum = fNumber - sNumber
                Binary(sum).decimalToBinary()
            }
            else -> println("pls type a correct symbol")
        }
    }
}