package `100-Dias-de-Kotlin`.Dia_005.`05_Valor_y_Referencia`

/*
Binding Strategies: https://en.wikipedia.org/wiki/Evaluation_strategy#Strict_binding_strategies
Kotlin doesn't have true pass-by-reference for primitive data types (Int, String,Boolean, etc.)
Passing non-primitives (custom classes, arrays) by reference allows functions to modify the original object.
*/

fun main () {
    // "Pass By Value"
    println("-- Pass by value --")
    passByValue()
    println("-- Pass by value with a function --")
    val passByValueFun = passByValueFun(10, 20)
    val firstValue = passByValueFun.first
    val secondValue = passByValueFun.second
    println(firstValue)
    println(secondValue)
    // Pass By Reference
    println("-- Pass by reference --")
    passByReference()
    println("-- Pass by reference with a function --")
    val referenceOne = mutableListOf("Pepe")
    val passByReferenceFun = passByReferenceFun(referenceOne)
    println(referenceOne)
    println(passByReferenceFun)
}

fun passByValue() {
    var a = 1
    println(a)
    var b = 20
    a = b
    b = 14
    println(a)
    println(b)
}

fun passByValueFun(firstVal :Int, secondVal :Int) :Pair<Int, Int> {
    val firstValCopy = firstVal
    val secondValCopy = secondVal
    return Pair(firstValCopy, secondValCopy)
}

fun passByReference() {
    val a = mutableListOf("Homero")
    val b = a
    b.add("35")
    b[0] = "Cosme Fulanito"
    println(a)
    println(b)
}

fun passByReferenceFun(a: MutableList<String>): MutableList<String> {
    val b = a
    b[0] = "JuanPerez"
    return b
}
