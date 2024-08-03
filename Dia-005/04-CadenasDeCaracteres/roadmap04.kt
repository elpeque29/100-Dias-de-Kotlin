package `100-Dias-de-Kotlin`.Dia_006.`04_Cadenas_de_Caracteres`

// https://kotlinlang.org/docs/strings.html

fun main() {
    operators()
    extra()
}

fun operators() {
    val example = "example"
    println(example)
    // Concatenation
    val concatenation = "Hello " + "There"
    println(concatenation)
    // Interpolation
    val interpolation = "$example interpolation"
    println(interpolation)
    // Length
    println(example.length)
    // Substrings
    println(example.substring(2, 5))
    // String Comparison
    val exampleTwo = "example"
    println(example == exampleTwo)
    // compareTo: compares this object with the specified object for order. Returns zero if this object is equal to the specified other object, a negative number if it's less than other, or a positive number if it's greater than other.
    println(example.compareTo(exampleTwo))
    // Checking for Substring
    println(example.contains("exa"))
    // Replacing
    println(example.replace("ple", "ples"))
    // Splitting a string into an array
    val str = "  Hello.World  "
    println(str.split("."))
    // Trimming
    println(str.trim())
    // Conversion
    val number = 12
    println(number.toString())
    // Uppercase and Lowercase
    println(example.lowercase())
    println(example.uppercase())
    // Recorrer cadena
    for (a in example) {
        println(a)
    }
}

private fun extra() {

    fun palindromo(word:String = "dad") :Boolean {
        val clean = word.replace(" ", "")
        val reversed = clean.reversed()
        return clean == reversed
    }

    fun anagrama(wordOne:String = "fired", wordTwo:String = "fried") :Boolean {
        val cleanOne = wordOne.replace(" ", "")
        val cleanTwo = wordTwo.replace(" ", "")
        return cleanOne.toCharArray().sorted() == cleanTwo.toCharArray().sorted()
    }

    fun isograma(word:String = "Dad") :Boolean{
        val clean = word.replace(" ", "")
        return clean.lowercase().toCharArray().distinct().size == clean.length
    }

    println(palindromo())
    println(anagrama())
    println(isograma())
}
