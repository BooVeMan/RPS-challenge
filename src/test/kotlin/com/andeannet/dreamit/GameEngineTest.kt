package com.andeannet.dreamit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class GameEngineTest {

    @Test
    fun `should return either WIN, LOOSE or DRAW for a valid play`() {
        val result : String = GameEngine().play("ROCK")
        Assertions.assertTrue(result == "WIN" || result == "LOOSE" || result == "DRAW")
    }

    @Test
    fun `should correctly handle invalid moves`() {
        Assertions.assertThrows(RuntimeException::class.java) {
            GameEngine().play("OTHER")
        }
    }
}