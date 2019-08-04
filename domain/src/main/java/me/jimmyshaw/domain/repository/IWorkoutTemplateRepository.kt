package me.jimmyshaw.domain.repository

import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.domainmodel.WorkoutTemplate

interface IWorkoutTemplateRepository {
    fun getWorkoutTemplates(getCustom: Boolean): ResultWrapper<Exception, List<WorkoutTemplate>>

    fun deleteWorkoutTemplate(id: Int): ResultWrapper<Exception, Unit>

    fun updateWorkoutTemplate(template: WorkoutTemplate): ResultWrapper<Exception, Unit>

}