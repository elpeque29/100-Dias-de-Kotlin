package `100-Dias-de-Kotlin`.Dia_010.`09_Herencia`

// https://kotlinlang.org/docs/inheritance.html

fun main() {
    val dog = Dog()
    dog.printAnimalSound()
    val cat = Cat()
    cat.printAnimalSound()
    // Extra
    val manager = Manager()
    val projectManager = ProjectManager("BushiGPT")
    val programmer = Programmer("Kotlin")
    manager.addEmployee(projectManager.name, projectManager.id)
    manager.listEmployee()
    projectManager.addEmployee(programmer.name, programmer.id)
    projectManager.listEmployee()
}

open class Animal {
    open val sound = "Sound"
    fun printAnimalSound() {
        println(sound)
    }
}

class Dog : Animal() {
    override val sound = "Woof"
}

class Cat : Animal() {
    override val sound = "Miau"
}

// Extra

open class Employee(val id: String = "id", val name: String = "name") {
    private val employee: MutableList<String> = mutableListOf()
    open fun addEmployee(newEmployee: String, employeeId: String = "id") {
        employee.add("$newEmployee|$employeeId")
    }
    fun listEmployee() {
        println(employee)
    }
}

class Manager : Employee("A1", "Brais") {
    init {
        println("$name is coordinating company's projects")
    }
}

class ProjectManager(project: String) : Employee("M4", "Bushi") {
    init {
        println("$name is coordinating project: $project")
    }
}

private class Programmer(language: String) : Employee("P1", "Rick") {
    init {
        println("$name is programming in $language")
    }

    override fun addEmployee(newEmployee: String, employeeId: String) {
        println("Programmers don't have employees on charge, so $newEmployee wont be added")
    }
}
