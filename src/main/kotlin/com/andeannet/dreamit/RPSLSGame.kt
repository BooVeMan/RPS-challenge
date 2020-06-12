package com.andeannet.dreamit

class RPSLSGame : GameEngine(mapOf("ROCK" to listOf<String>("SCISSORS", "LIZARD"),
        "PAPER" to listOf<String>("ROCK", "SPOCK"),
        "SCISSORS" to listOf<String>("PAPER", "LIZARD"),
        "LIZARD" to listOf<String>("PAPER", "SPOCK"),
        "SPOCK" to listOf<String>("ROCK", "SCISSORS")))
