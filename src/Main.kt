import java.util.*
val reader = Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Decimal to Binary || Press: 1")
    println("Decimal to Octal || Press: 2")
    println("Decimal to Hex || Press: 3")
    println("(Binary, Octal, Hex) to Binary || Press: 4")
    println("Addition  || Press: 5")
    print("Select option please: ")
    val chooserOptionMenu = reader.nextInt()
    print("Please enter the number which you want to convert: ")
    val number = reader.nextInt()
    when (chooserOptionMenu) {
        1 -> Binary(number).decimalToBinary()
        2 -> Octal(number).decimalToOctal()
        3 -> print(Hex(number).decimalToHex())
        4 -> revertFunction()
    }
}

fun revertFunction() {
    println("Binary to Decimal|| Press: 1")
    println("Octal to Decimal || Press: 2")
    println("Hex to Decimal || Press: 3")
    print("Select option please: ")
    val revertOptionMenu = reader.nextInt()
    print("Please enter the number which you want to convert: ")
    val number = reader.nextInt()
    when (revertOptionMenu){
        1 -> print(Binary(number).binaryToDecimal())
        2 -> print(Octal(number).octalToDecimal())
        3 -> {
            println("Enter pls a Hex Number: ")
            print(Hex(number).hexToDecimal(readLine()!!))
        }
    }
}
