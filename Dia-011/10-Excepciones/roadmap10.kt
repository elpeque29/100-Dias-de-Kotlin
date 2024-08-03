package `100-Dias-de-Kotlin`.Dia_011.`10_Excepciones`

fun main() {
    println("Exceptions")
    exception()
    println("Extra")
    try {
        extra()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("An error has ocurred: " + e.message)
    } catch (e: ArithmeticException) {
        println("An error has ocurred: " + e.message)
    } catch (e: ErrorsEverywhere) {
        println("An error has ocurred: " + e.message)
    } finally {
        println("Excecution finished")
    }
}

fun exception() {
    val a = arrayOf(1)
    try {
        println(a[2])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("An error has ocurred: " + e.message)
    }
}

private fun extra(){
    val processParams = arrayOf(2, 3, 4)
    if (processParams.size < 3) {
        throw ArrayIndexOutOfBoundsException("Can't access element 2 if the array size is smaller than 3")
    } else if (processParams[1] == 0) {
        throw ArithmeticException("Can't divide by 0")
    } else if (processParams.isNotEmpty()) {
        throw ErrorsEverywhere("Errors, errors everywhere because you are dumb (°-°)")
    }
    println(processParams[2])
    println(processParams[0]/processParams[1])
}

// This is a custom exception
class ErrorsEverywhere(message: String) : Exception(message){}
