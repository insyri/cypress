class dump {



    fun main() {
        var experiencePoints: Int = 5
        println(experiencePoints)

        experiencePoints += 5

        val playerName: String = "Estragon"
        println(playerName)

        // VAL vs. VAR
        // var implies that it WILL change in the future.
        // val implies that it WON'T change in the future.

        // error:
//    playerName = "Anabel"

        // TYPES
        val str: String = "string"
        val int: Int = 5
        val dec: Double = 3.14
        val bol: Boolean = true

        val health = 100
        if (health == 100) {
            println(playerName + " is in excellent condition!")
        } else {
            println(playerName + " is in awful condition!")
        }

        val isBlessed = true
        val isImmortal = false

        if (isBlessed && health > 50 || isImmortal) {
            println("GOOD")
        } else {
            println("BAD")
            if (health != 1) {
                println("at least he's not 1hp")
            }
        }

        // if (health <= 100 && health >= 75)
        if (health in 100..75) {
            println("good health")
        } else if (health in 75..1) {
            println("poor health")
        }


        var healthStatus = "BAD" // possible kinds: GOOD, BAD, AWfUL, DEAD
        when (healthStatus) {
            "GOOD" -> "The player is in good shape."
            "BAD"  -> "The player could use healing"
            "AWFUL" -> "The player needs healing soon"
            "DEAD" -> "The player is basically "
        }

        // OPERATORS
        // <  less than
        // <= less than or equal to
        // >  greater than
        // >= greater than or equal to
        // == left has same value as right
        // != left does not have same value as right

        // INSTANCE OPERATORS
        // === both instances are the same reference
        // !== neither instances are the same reference


    }
}