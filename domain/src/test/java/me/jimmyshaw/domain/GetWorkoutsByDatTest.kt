import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runBlockingTest
import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.constants.DateRange
import me.jimmyshaw.domain.domainmodel.Workout
import me.jimmyshaw.domain.getWorkout
import me.jimmyshaw.domain.repository.IWorkoutRepository
import me.jimmyshaw.domain.usecases.GetWorkoutsByDay
import org.junit.jupiter.api.Test

class GetWorkoutsByDatTest {

    val repo: IWorkoutRepository = mockk()

    val useCase = GetWorkoutsByDay(repo)

    /**
     * When a user opens the application, retrieve all workouts on the current day
     * 1. Request workout list from repository
     */

    @Test
    fun `On Get Workouts by day successful`() = runBlockingTest {
        val TEST_WORKOUTS = listOf(getWorkout(), getWorkout())
        val TEST_DATE = getWorkout().createdOn
        val DATERANGE_DAY = DateRange.DAY

        coEvery { repo.getWorkoutsByDate(TEST_DATE, DATERANGE_DAY) } returns ResultWrapper.build { TEST_WORKOUTS }

        useCase.execute(TEST_DATE)

        coVerify(exactly = 1) { repo.getWorkoutsByDate(TEST_DATE, DATERANGE_DAY) }


    }


}
