import java.util.Locale

fun main() {
    print("Hello! What is your name? ")
    val userName = readLine()
    println("Nice to meet you ${userName!!.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}, My name is Aid.")
    println("Please select one of the options below: ")
    println("1. Quiz" + "\n" + "2. Quit")
    val choice = readLine()

    when (choice!!.toInt()) {
        1 -> questions()
        2 -> println("Good bye")
    }

}

fun questions() {
    var correctAnswers = 0
    var incorrectAnswers = 0
    println("First question: ")
    println(
        "What is Kotlin? \n" +
                "1. It is an actively developing language, but not yet ready for industrial use. \n" +
                "2. It is a training programming language designed to teach students. \n" +
                "3. It is a pragmatic language designed to solve real-world problems. \n" +
                "4. It is an academic language designed to explore innovative ideas in computer science. \n"
    )
    val result1 = readLine()
    if (result1!!.toInt() == 3) {
        correctAnswers++
        println("Great job, keep at it! \n")
    } else {
        incorrectAnswers++
        println("Not correct, but keep on trying")
    }

    println("Second question: ")
    println(
        "Select the correct statement about Kotlin's interoperability with Java. \n" +
                "1. Kotlin isn't compatible with Java. \n" +
                "2. Kotlin and Java have limited compatibility. \n" +
                "3. Kotlin works great with all existing Java code and libraries."
    )
    val result2 = readLine()
    if (result2!!.toInt() == 3) {
        correctAnswers++
        println("Great job, keep at it! \n")
    } else {
        incorrectAnswers++
        println("Not correct, but keep on trying")
    }

    println("Third question: ")
    println(
        "From among the following, where can Kotlin code be used? \n" +
                "1. Android device. \n" +
                "2. Java Virtual Machine. \n" +
                "3. Browser. \n" +
                "4. Desktop. \n" +
                "5. all options above."
    )
    val result3 = readLine()
    if (result3!!.toInt() == 5) {
        correctAnswers++
        println("Great job, keep at it! \n")
    } else {
        incorrectAnswers++
        println("Not correct, but keep on trying")
    }

    println("Congratulations you reached the end of the quiz.")
    println(
        "Correct answers: $correctAnswers \n" +
                "Incorrect answers: $incorrectAnswers"
    )
}
