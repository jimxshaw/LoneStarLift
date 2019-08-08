import io.mockk.mockk
import me.jimmyshaw.domain.ResultWrapper
import me.jimmyshaw.domain.constants.DateRange
import me.jimmyshaw.domain.domainmodel.Workout
import me.jimmyshaw.domain.repository.IWorkoutRepository
import me.jimmyshaw.domain.usecases.GetWorkoutsByDay
import org.junit.jupiter.api.Test

class GetWorkoutsByDatTest {

    val repo: IWorkoutRepository = mockk()

    val getWorkouts = GetWorkoutsByDay(repo)

    /**
     * When a user opens the application, retrieve all workouts on the current day
     * 1. Request workout list from repository
     */

    @Test
    fun `On Get Workouts by day successful`() {

    }


}
