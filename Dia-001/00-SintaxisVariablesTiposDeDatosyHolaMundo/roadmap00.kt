package `100-Dias-de-Kotlin`.Dia_001.`00_Sintaxis_Variables_Tipos_de_Datos_y_Hola_Mundo`

// FIRST POINT

// https://kotlinlang.org/

// SECOND POINT

// Comment in one line

/*
* Multiple Lines
* Comments
*/

// THIRD POINT

fun main() {

    val myFistVal = 1
    var myFirstVar = 2

// FOURTH POINT

    // Types
    val aByte: Byte = 127
    val aShort: Short = 32767
    val aInt: Int = 2147483647
    val aLong: Long = 9223372036854775807
    val aFloat = 1.1111112f
    val aDouble = 1.1111111111111110
    val myTrue = true
    val myFalse = false
    val boolNull: Boolean? = null
    val aChar = 'a'
    val aString = "(°-°)"
    val anArray = arrayOf("a", "b", "c")

    //  Non Negative
    var nonNegativeByte : UByte = 1U
    var nonNegativeShort : UShort = 2U
    var nonNegativeInt : UInt = 3U
    var nonNegativeLong : ULong = 4UL

// FIFTH POINT
    println("Hello Kotlin")
}