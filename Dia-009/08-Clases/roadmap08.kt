package `100-Dias-de-Kotlin`.Dia_009.`08_Clases`

// https://kotlinlang.org/docs/classes.html

fun main() {
    Programmer("Peque", 19)
    val stack = Stack()
    stack.push(10)
    stack.push(20)
    stack.pop()
    stack.count()
    val queue = Queue()
    queue.enQueue(10)
    queue.enQueue(20)
    queue.deQueue()
    queue.count()
}

private class Programmer(name: String, age: Int) {
    init {
        val name = name
        val age = age
        println("Name: $name | Age: $age")
    }
}

class Stack {
    init {
        println("Stack")
    }

    private val stack = ArrayDeque<Int>()

    fun push(x:Int){
        stack.addFirst(x)
        println(stack)
        return
    }

    fun pop(){
        if (stack.size != 0){
            stack.removeFirst()
        }
        println(stack)
        return
    }

    fun count(){
        val size = stack.size
        println(size)
    }
}

class Queue {
    init {
        println("Queue")
    }

    private val queue = ArrayDeque<Int>()

    fun enQueue(x: Int){
        queue.addLast(x)
        println(queue)
        return
    }

    fun deQueue(){
        if (queue.size != 0){
            queue.removeFirst()
        }
        println(queue)
        return
    }

    fun count(){
        val size = queue.size
        println(size)
    }
}
