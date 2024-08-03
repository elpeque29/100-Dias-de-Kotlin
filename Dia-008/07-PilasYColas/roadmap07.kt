package `100-Dias-de-Kotlin`.Dia_008.`07_Pilas_y_Colas`

// Stacks and Queues
// https://medium.com/wearejaya/data-structures-in-kotlin-stack-queue-partv-31771dafa89

fun main() {
    stack()
    queue()
    extra()
}

fun stack() {
    println("Stack")
    // Create an empty ArrayDeque
    val stack = ArrayDeque<Int>()

    // Push elements onto the stack
    stack.addFirst(1)
    stack.addFirst(2)
    stack.addFirst(3)

    // Accessing the top element
    val topElement = stack.first()
    println(topElement)

    // Popping elements from the stack
    val poppedElement = stack.removeFirst()
    println(poppedElement)

    // Check if the stack is empty
    val isEmpty = stack.isEmpty()
    println(isEmpty)

   // Print the remaining elements in the stack
   println(stack)
}

fun queue() {
    println("Queue")
    // Create an empty ArrayDeque
    val queue = ArrayDeque<Int>()

    // Enqueue elements into the queue
    queue.addLast(1)
    queue.addLast(2)
    queue.addLast(3)

    // Accessing the front element
    val frontElement = queue.first()
    println(frontElement)

   // Dequeue elements from the queue
    val dequeuedElement = queue.removeFirst()
    println(dequeuedElement)

    // Check if the queue is empty
    val isEmpty = queue.isEmpty()
    println(isEmpty)

    // Print the remaining elements in the queue
    println(queue)
}

private fun extra() {
    
    fun webNavigation() {
        val stack = ArrayDeque<String>()

        do {
            println("Add a word or interact with quit/back/forward:")
            val action = readln()
            if (action == "quit"){
                println("Quiting browser")
                break
            } else if (action == "back" && stack.isNotEmpty()) {
                stack.removeFirst()
            } else if (action == "forward") {
                stack.addFirst(action)
            } else {
                stack.addFirst(action)
                println("Searching $action")
            }
            println(stack)
        } while (true)
    }

    fun printer() {
        val queue = ArrayDeque<String>()
        do {
            println("Add a doc, and use print/quit: ")
            val action = readln()
            if (action == "quit") {
                println("Quitting the printer")
                break
            } else if (action == "print" && queue.isNotEmpty()) {
                val first = queue.first()
                println("Printing $first")
                queue.removeFirst()
            } else if (action == "print" && queue.isEmpty()){
                println("The queue is empty")
            } else {
                queue.addLast(action)
                println("Added $queue to the queue")
            }
        } while(true)
    }

    println(webNavigation())
    println(printer())
}
