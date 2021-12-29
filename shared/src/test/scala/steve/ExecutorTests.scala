package steve

import munit.CatsEffectSuite
import cats.Id

class ExecutorTests extends CatsEffectSuite {
    val exec = Executor.instance[Either[Throwable, *]]

    test("Build and run empty image") {
        val hash = exec.build(Build.empty)

        assertEquals(
            exec.build(Build.empty).flatMap(exec.run).map(_.getAll),
            Right(Map.empty)
        )
    }

}