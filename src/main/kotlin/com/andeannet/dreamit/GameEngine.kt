package com.andeannet.dreamit

import mu.KotlinLogging

open class GameEngine(val rules: Map<String, List<String>> = emptyMap()) {

    private val logger = KotlinLogging.logger {}

    val stats: MutableMap<String, Int> = mutableMapOf("PLAYER 1 WINS" to 0, "PLAYER 2 WINS" to 0, "DRAWS" to 0)

    enum class GameOutcome { WIN, LOOSE, DRAW, INVALID }

    fun play(player1: String, player2: String? = null): GameOutcome {
        if (!rules.containsKey(player1)) {
            return GameOutcome.INVALID
        }
        val play2 = player2 ?: getComputerPlay()
        return calculateResult(player1, play2)
    }

    private fun getComputerPlay() = rules.keys.random()

    private fun calculateResult(player1: String, player2: String): GameOutcome {
        val result = when {
            player1 == player2 -> {
                GameOutcome.DRAW
            }
            rules[player1]?.contains(player2) == true -> {
                GameOutcome.WIN
            }
            else -> {
                GameOutcome.LOOSE
            }
        }
        logger.debug { "player 1: $player1 - plaver 2: $player2: result: $result" }
        updateStats(result)
        return result
    }

    private fun updateStats(result: GameOutcome) {
        when (result) {
            GameOutcome.WIN -> stats.merge("PLAYER 1 WINS", 1, Int::plus)
            GameOutcome.LOOSE -> stats.merge("PLAYER 2 WINS", 1, Int::plus)
            GameOutcome.DRAW -> stats.merge("DRAWS", 1, Int::plus)
            else -> {
            }
        }
    }
}
