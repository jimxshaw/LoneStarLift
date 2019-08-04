package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.constants.ExerciseTarget
import me.jimmyshaw.domain.constants.ExerciseType

data class ExerciseTemplate(
    val name: String,
    val targets: List<ExerciseTarget>,
    val isCustom: Boolean,
    val type: ExerciseType
)