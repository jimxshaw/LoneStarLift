package me.jimmyshaw.domain.repository

import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.domainmodel.ExerciseTemplate

interface IExerciseTemplateRepository {
    fun getExerciseTemplatesByFilter(filter: String, isCustom: Boolean): ResultWrapper<Exception, List<ExerciseTemplate>>

    fun updateExerciseTemplate(template: ExerciseTemplate): ResultWrapper<Exception, Unit>

}