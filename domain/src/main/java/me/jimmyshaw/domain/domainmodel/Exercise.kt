package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.enums.ExerciseType

data class Exercise(
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)