package me.jimmyshaw.domain.domainmodel

import me.jimmyshaw.domain.enums.ExerciseTarget
import me.jimmyshaw.domain.enums.ExerciseType

data class ExerciseTemplate(
    val name: String,
    val targets: List<ExerciseTarget>,
    val isCustom: Boolean,
    val type: ExerciseType
)