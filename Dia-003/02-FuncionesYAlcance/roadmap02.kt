package `100-Dias-de-Kotlin`.Dia_003.`02_Funciones_y_Alcance`

fun main() {
    function()
    functionWithParameter()
    functionWithParameterAndReturn()
    println("Fuction iquals $a")
    functionVararg("hi", "hello")
    println(singleExpressionFun())
    println(number(4))
    println(recursive())
    println(nestedFunction())
}

// Function without parameters
fun function() {
    println("Function without parameters")
}

// Fuction with parameters
fun functionWithParameter(a: Int = 1, b: String = "b") {
    println("Function with parameters $a and $b")
}

// Fuction with return
fun functionWithParameterAndReturn(a: Int = 1, b: Int = 1): Int {
    return a + b
}

val a = functionWithParameterAndReturn()

// Function with multiple parameters
fun functionVararg(vararg strings: String) {
    println("Function with multiple parameters")
    println(strings)
}

// Single Expression Function
fun singleExpressionFun(x: Int = 4): Int = x * 4

// Lambda Expression Syntax
val number: (Int) -> Int = { param: Int -> 2 * param }

// Recursive Function
fun recursive(num: Int = 0): Int {
    return if (num == 0) {
        1
    } else {
        num * recursive(num - 1)
    }
}

// Nested Function
fun nestedFunction(x: Int = 5): Int {
    fun fun1():Int{
        return x + 1
    }
    fun fun2():Int{
        return fun1() - 1
    }
    return fun2()
}

