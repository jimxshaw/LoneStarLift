package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.constants.ExerciseTarget

data class WorkoutTemplate(
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val targets: List<ExerciseTarget>,
    val workout: Workout
)