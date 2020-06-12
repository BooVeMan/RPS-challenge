package com.andeannet.dreamit

open class GameEngine(var rules : Map<String, List<String>> = emptyMap()) {

    val stats : Map<String, Int> = mapOf("PLAYER 1 WINS" to 0, "PLAYER 2 WINS" to 0, "DRAWS" to 0)

    enum class GameOutcome {WIN, LOOSE, DRAW, INVALID}

    fun play(player1: String, player2: String? = null): GameOutcome {
        if (!rules.containsKey(player1)) {
            return GameOutcome.INVALID
        }
        return ""
    }
}