package `100-Dias-de-Kotlin`.Dia_007.`06_Recursividad`

fun main() {
    println(recursive())
    extra()
}

fun recursive(x: Int = 100) {
    if (x in 0..100) {
        println(x)
        recursive(x - 1)
    }
}

private fun extra(){
    
    fun factorial(x: Int = 4) :Int {
        return if (x != 0 && x > 0) {
            x * factorial(x - 1)
        } else {
            1
        }
    }

    fun fibonacci(num: Int = 5): Int {
        return when (num) {
            1 -> 0
            2 -> 1
            else -> fibonacci(num - 1) + fibonacci(num - 2)
        }
    }

    println(factorial())
    println(fibonacci())
}
