package com.andeannet.dreamit

class RPSGame : GameEngine(mapOf("ROCK" to listOf<String>("SCISSORS"),
        "PAPER" to listOf<String>("ROCK"),
        "SCISSORS" to listOf<String>("PAPER")))
