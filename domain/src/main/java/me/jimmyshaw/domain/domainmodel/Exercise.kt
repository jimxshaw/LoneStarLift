package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.constants.ExerciseType

data class Exercise(
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)