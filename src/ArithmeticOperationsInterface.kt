interface ArithmeticOperationsInterface{
    fun add(first: String, second: String, radix: Int){
        val firstBinary = Integer.parseInt(first, radix)
        val secondBinary = Integer.parseInt(second, radix)
    }
}