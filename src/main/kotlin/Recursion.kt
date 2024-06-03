fun main() {
    //outputEvenNumbers(100)
    //outputOddNumbers(100)
    //factorialResult(7)

    // fibonacci Це не моє вирішення.
    /*val term = 10

    for (i in 0 .. term) {
        val fibonacciNumber = fibonacci(i)
        print("$fibonacciNumber ")
    }*/
}

fun outputEvenNumbers(number: Int): Int {
    val count = if (number == 1) number else outputEvenNumbers(number - 1)
    if (number % 2 == 0) println(number)

    return count
}

fun outputOddNumbers(number: Int): Int {
    val count = if (number == 1) number else outputOddNumbers(number - 1)
    if (number % 2 == 1) println(number)

    return count
}


fun factorialResult(number: Int) {
    val result: Int = factorialNumber(number)
    println("Factorial number $number: $result")
}

private fun factorialNumber(number: Int): Int {
    return if (number == 1) number else number * factorialNumber(number - 1)
}

fun fibonacci(n: Int): Long {
    if (n <= 1) {
        return n.toLong()
    }

    return fibonacci(n - 1) + fibonacci(n - 2)
}

