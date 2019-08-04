package me.jimmyshaw.domain.repository

import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.constants.DateRange
import me.jimmyshaw.domain.domainmodel.Workout

interface IWorkoutRepository {
    fun getWorkoutsByDate(date: String, selection: DateRange): ResultWrapper<Exception, List<Workout>>

    fun updateWorkout(workout: Workout): ResultWrapper<Exception, Unit>

    fun deleteWorkout(creationDateId: String): ResultWrapper<Exception, Unit>
}