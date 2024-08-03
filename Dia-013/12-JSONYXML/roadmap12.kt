package `100-Dias-de-Kotlin`.Dia_013.`12_JSON_y_XML`

import java.io.File

data class Value(val name: String, val age: String, val born: String, val languages: List<String>)

fun main() {
    xml()
    json()
}

fun xml(){

    // Creating XML File
    val filePath = "roadmap12.xml"
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
    // Writing to the XML File
    file.printWriter().use { out ->
        out.println("<data>")
        out.println(writeTo("name", "xml"))
        out.println(writeTo("age", "xml"))
        out.println(writeTo("born", "xml"))
        out.println(writeTo("languages", "xml"))
        out.println("</data>")
    }
    // Reading content
    val readFile = file.readText()
    println(readFile)
    // Deleting
    val result = file.delete()

    if (result) {
        println("File deleted successfully.")
    } else {
        println("Error occurred while deleting the file or file does not exist.")
    }

}

fun json(){
    // Create JSON File
    val filePath = "roadmap12.json"
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
    // Write to JSON
    file.printWriter().use { out ->
        out.println("{")
        out.println(writeTo("name", "json"))
        out.println(writeTo("age", "json"))
        out.println(writeTo("born", "json"))
        out.println(writeTo("languages", "json"))
        out.println("}")
    }
    // Reading Content
    val readFile = file.readText()
    println(readFile)
    // Deleting
    val result = file.delete()

    if (result) {
        println("File deleted successfully.")
    } else {
        println("Error occurred while deleting the file or file does not exist.")
    }

}

fun writeTo(x: String, type: String): String {

    val values = Value("Peque", "20", "29-06-2004", listOf("Kotlin"))

    fun languages(x: String) :String {
        if (x == "xml") {
            val langList = values.languages.joinToString(separator="\n        ") { "<language>$it</language>" }
            return "\n        $langList\n    "
        } else {
            val langList = values.languages.joinToString(separator = "\n        ") { "\"language\": \"$it\"" }
            return "{\n        $langList\n    }"
        }
    }

    val classValue = when (x) {
        "name" -> values.name
        "age" -> values.age
        "born" -> values.born
        "languages" -> languages(type)
        else -> null
    }

    return if (type == "xml") {
        "    <$x>$classValue</$x>"
    } else if (x == "languages") {
        """    "$x": $classValue"""
    } else {
        """    "$x": "$classValue","""
    }
}