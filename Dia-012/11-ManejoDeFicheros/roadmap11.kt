package `100-Dias-de-Kotlin`.Dia_012.`11_Manejo_de_Ficheros`

// https://kotlinandroid.org/kotlin/kotlin-read-file/

import java.io.File

fun main() {
    
    // Creating file
    val filePath = "Peque29.txt"
    val file = File(filePath)
    try {
        val result = file.createNewFile()

        if (result) {
            println("File created successfully: ${file.absolutePath}")
        } else {
            println("File already exists.")
        }
    } catch (e: Exception) {
        println("An error occurred while creating the file: ${e.message}")
    }
    
    // Writting on file
    val lines = listOf("Name: Peque", "Age: 19", "Favorite Language: Kotlin")

    file.printWriter().use { out ->
        lines.forEach { line ->
            out.println(line)
        }
    }

    println("List of strings written to file successfully.")
    
    // Printing file content
    try {
        val fileContent = File(filePath).readText()

        println("File content\n-------------")
        println(fileContent)
    } catch (e: Exception) {
        println("An error occurred while reading the file: ${e.message}")
    }
    
    // Delete file
    val result = file.delete()

    if (result) {
        println("File deleted successfully.")
    } else {
        println("Error occurred while deleting the file or file does not exist.")
    }

    extra()
}

fun extra() {

    // Creating file
    val filePath = "sales.txt"
    val sales = File(filePath)
    try {
        val result = sales.createNewFile()

        if (result) {
            println("File created successfully: ${sales.absolutePath}")
        } else {
            println("File already exists.")
        }
    } catch (e: Exception) {
        println("An error occurred while creating the file: ${e.message}")
    }

    // Creating list of products
    val products = mutableListOf("[nombre_producto], [cantidad_vendida], [precio]")

    // Print to file
    fun printFile() {
        sales.printWriter().use { out ->
            products.forEach { line ->
                out.println(line)
            }
        }
    }

    // Print from file

    fun printFromFile() {
        try {
            val fileContent = File(filePath).readText()
            println("File content\n-------------")
            println(fileContent)
        } catch (e: Exception) {
            println("An error occurred while reading the file: ${e.message}")
        }
    }

    fun product() :String {
        println("Write product name: ")
        val productName = readln()
        println("Write ammount: ")
        val amount = readln()
        println("Write products price: ")
        val price = readln()
        return "[$productName], [$amount], [$price]"
    }

    // Terminal Interaction
    do {
        println("Functions: add, get, update, delete, quit.")
        val action = readln()
        if (action == "quit") {
            println("Quit program")
            printFile()
            break
        } else if (action == "add") {
            products.add(product())
            printFile()
            printFromFile()
        } else if (action == "update") {
            printFromFile()
            println("Rewrite the line: ")
            val reWrite = product()
            try {
                println("Write the number of the product")
                products[readln().toInt()] = reWrite
                printFile()
            } catch (e: IndexOutOfBoundsException) {
                println(e.message)
            }
        } else if (action == "delete") {
            printFromFile()
            try {
                println("Select the line to delete")
                products.removeAt(readln().toInt())
            } catch (e: IndexOutOfBoundsException) {
                println(e.message)
            }
            printFile()
        } else if (action == "get") {
            println("Select the number of product to get")
            val list = sales.readLines()
            try {
                println(list[readln().toInt()])
            } catch (e: IndexOutOfBoundsException) {
                println("You can't get a product that doesn't exist")
            }
        }
    } while (true)
}