import java.util.*

fun main () {
    // 1. Ask for player name

    val name = "noah"
    println(name)
    println(capitalize(name))

//    println("Enter your name:")
    // How to accept input from the user
//    val playerName: String = readln()

    // How to interpolate strings
    // (put strings inside of strings)
//    println("Welcome to the game, $playerName!")

    // 2. Make random stats

//    val health = Random.()


    // 3. Fight.

    // make functions that print out what happens (e.g. fight dragon) and change health (e.g. deduct)
    // also make ones that heal



    // 4. Print final stats.

    // make a list/array of all the things you want to print and print them via iteration



}


fun capitalize(str: String): String {
    // "str" =>  ["s", "t", "r"]
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    val upperAlphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val new_string = mutableListOf<Char>()
    for (element in str.toCharArray()) {
        new_string.add(upperAlphabet[alphabet.indexOf(element)])
    }

    return new_string.joinToString("")

}








//fun mathing(a: 69, b: 420): Int{
//    var gay = true
//    println("loading gay math")
//
//    if gay = true {
//        var math_is_gay: Int = a + b
//    }
//    if gay = false {
//        var math_isnt_gay: Int = a - b
//    }
//    println(Int)
//}