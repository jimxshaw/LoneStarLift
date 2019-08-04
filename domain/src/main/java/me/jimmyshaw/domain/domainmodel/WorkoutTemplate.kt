package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.enums.ExerciseTarget

data class WorkoutTemplate(
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val targets: List<ExerciseTarget>
)