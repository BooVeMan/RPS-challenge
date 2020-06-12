package com.andeannet.dreamit

import com.andeannet.dreamit.GameEngine.GameOutcome
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RPSLSGameTest {
    @Test
    fun `validate game mechanics`() {
        val game = RPSLSGame()
        Assertions.assertEquals(game.play("ROCK", "SPOCK"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.play("ROCK", "LIZARD"), GameOutcome.WIN)
        Assertions.assertEquals(game.play("ROCK", "ROCK"), GameOutcome.DRAW)
        Assertions.assertEquals(game.play("SPOCK", "LIZARD"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.play("SCISSORS", "LIZARD"), GameOutcome.WIN)
        Assertions.assertEquals(game.play("LIZARD", "SCISSORS"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.stats["PLAYER 1 WINS"], 2)
        Assertions.assertEquals(game.stats["PLAYER 2 WINS"], 3)
        Assertions.assertEquals(game.stats["DRAWS"], 1)
    }
}