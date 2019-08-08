package me.jimmyshaw.domain.usecases

import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.constants.DateRange
import me.jimmyshaw.domain.domainmodel.Workout
import me.jimmyshaw.domain.repository.IWorkoutRepository

/**
 * When a user opens the application, retrieve all workouts on the current day
 * 1. Request workout list from repository
 */
class GetWorkoutsByDay(private val repository: IWorkoutRepository): UseCaseWithParams<String, ResultWrapper<Exception, List<Workout>>>(){
    override suspend fun buildUseCase(params: String): ResultWrapper<Exception, List<Workout>> {
        return repository.getWorkoutsByDate(params, DateRange.DAY)
    }
}