package com.becarios.pokedex.data.response.damages.weaknesses

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HalfDamageResult(
    val name: String
)