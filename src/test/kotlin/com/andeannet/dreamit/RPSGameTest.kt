package com.andeannet.dreamit

import com.andeannet.dreamit.GameEngine.GameOutcome
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RPSGameTest {
    @Test
    fun `validate game mechanics`() {
        val game = RPSGame()
        Assertions.assertEquals(game.play("ROCK", "PAPER"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.play("ROCK", "SCISSORS"), GameOutcome.WIN)
        Assertions.assertEquals(game.play("ROCK", "ROCK"), GameOutcome.DRAW)
        Assertions.assertEquals(game.play("PAPER", "SCISSORS"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.play("SCISSORS", "PAPER"), GameOutcome.WIN)
        Assertions.assertEquals(game.play("SCISSORS", "ROCK"), GameOutcome.LOOSE)
        Assertions.assertEquals(game.stats["PLAYER 1 WINS"], 2)
        Assertions.assertEquals(game.stats["PLAYER 2 WINS"], 3)
        Assertions.assertEquals(game.stats["DRAWS"], 1)
    }
}