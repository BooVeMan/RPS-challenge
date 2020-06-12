package com.andeannet.dreamit

const val DEFAULT_REPETITION_COUNT = 100
val RPSLS_GAMES = setOf("RPSLS", "SPOCK")

fun main(args: Array<String>) {
    val game = if (args.any { RPSLS_GAMES.contains(it.toUpperCase()) }) {
        RPSLSGame()
    } else {
        RPSGame()
    }
    val repetitions = args.firstOrNull { it.toIntOrNull() != null }?.toInt() ?: DEFAULT_REPETITION_COUNT
    repeat(repetitions) {
        game.play("ROCK")
    }
    printStats(game)
}

private fun printStats(game: GameEngine) {
    game.stats.forEach { (label, value) ->
        println("$label: $value")
    }
}
