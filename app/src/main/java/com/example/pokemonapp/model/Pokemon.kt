package com.example.pokemonapp.model

data class PokemonListResponse(
    val results: List<PokemonResponse>
)

data class PokemonResponse(
    val name: String
)

data class PokemonDetailResponse(
    val name: String,
    val sprites: Sprites,
    val moves: List<MoveWrapper>
)

data class Sprites(
    val front_default: String
)

data class MoveWrapper(
    val move: Move
)

data class Move(
    val name: String
)