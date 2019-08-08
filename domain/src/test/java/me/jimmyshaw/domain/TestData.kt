package me.jimmyshaw.domain

import me.jimmyshaw.domain.constants.ExerciseType
import me.jimmyshaw.domain.domainmodel.Exercise
import me.jimmyshaw.domain.domainmodel.Workout
import me.jimmyshaw.domain.domainmodel.Set

fun getWorkout(
    name: String = "Stronglift Chest Day",
    createdOn: String = "260319",
    exercises: List<Exercise> = listOf(getExercise())
) = Workout(
        name,
        createdOn,
        exercises
)

fun getExercise(
    name: String = "Barbell Benchpress",
    sets: List<Set> = listOf(getSet()),
    type: ExerciseType = ExerciseType.BARBELL
) = Exercise(
    name,
    sets,
    type
)

fun getSet(
    repsOrTime: Int = 7,
    weight: String = "205 lbs"
) = Set(
    repsOrTime,
    weight
)