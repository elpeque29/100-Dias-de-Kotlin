package `100-Dias-de-Kotlin`.Dia_004.`03_Estructuras_de_Datos`

/*
Collections https://kotlinlang.org/docs/collections-overview.html

Groups of a variable number of items (possibly zero) that are significant to the problem being solved and are commonly operated on. Objects in a collection are called elements or items.
- List is an ordered collection with access to elements by indices
- Set is a collection of unique elements
- Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps to exactly one value
(the values can be duplicates).

Types of collections:
- Read Only: interface that provides operations for accessing collection elements.
- Mutable: interface that extends the corresponding read-only interface with write operations: adding, removing, and updating its elements.

Arrays https://kotlinlang.org/docs/arrays.html
An array is a data structure that holds a fixed number of values of the same type or its subtypes.
*/

fun main() {
    collections()
    arrays()
}

fun collections() {

    // List

    val fruits :List<String> = listOf("Apple", "Banana", "Cherry", "Banana")
    println(fruits[3])

    // Mutable List

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(3)
    numbers[3] = 0
    numbers.sortedDescending()
    println(numbers)

    val numbersReversed = numbers.asReversed()
    println(numbersReversed)

    // Sets

    val emotions :Set<String> = setOf("happy", "sad", "angry")
    println(emotions.first()) // Sets are unordered so you can't do println(emotions[0])

    // Mutable Sets

    val colors = mutableSetOf<String>("red", "orange", "yellow")
    colors.add("brown")
    colors.remove("orange")
    println(colors.sorted())

    // Map

    val usersAge :Map <String, Int> = mapOf (
        "Peque" to 19,
        "Brais" to 35,

    )
    println(usersAge.keys)
    println(usersAge["Peque"])

    // Mutable Map

    val password = mutableMapOf(
        "User1" to "password",
        "User2" to "12345678",
    )
    println(password.keys)
    password.put("User3", "Ñ_Supremacy")
    password.remove("User2")
    password["User1"] = "password2"
    println(password)
}

fun arrays() {
    var simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())
    simpleArray[0] = 0
    println(simpleArray.joinToString())

    /* In order to add elements to an array it must be stored on a variable 
    and you will need to convert it into a mutableList and then 
    back to an array. Like this:*/

    val simpleList = simpleArray.toMutableList()
    simpleList.add(4)
    simpleList.add(5)
    simpleArray = simpleList.toTypedArray()

    println(simpleArray.contentToString())
}
