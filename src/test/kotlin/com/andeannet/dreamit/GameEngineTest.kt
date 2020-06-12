package com.andeannet.dreamit

import com.andeannet.dreamit.GameEngine.GameOutcome
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class GameEngineTest {

    @Test
    fun `should return either WIN, LOOSE or DRAW for a valid play`() {
        val result: GameOutcome = GameEngine(simpleGame()).play("ROCK")
        Assertions.assertTrue(result == GameOutcome.WIN || result == GameOutcome.LOOSE || result == GameOutcome.DRAW)
    }

    @Test
    fun `should correctly handle invalid moves`() {
        Assertions.assertEquals(GameEngine().play("OTHER"), GameOutcome.INVALID)
    }

    @Test
    fun `should calculate statistics`() {
        val game = GameEngine(simpleGame())
        repeat(5) { game.play("ROCK") }
        Assertions.assertEquals(game.stats.values.sum(), 5)
        Assertions.assertEquals(game.stats["DRAWS"], 5)
    }

    private
    fun simpleGame(): Map<String, List<String>> {
        return mapOf<String, List<String>>("ROCK" to listOf<String>("PAPER"))
    }
}