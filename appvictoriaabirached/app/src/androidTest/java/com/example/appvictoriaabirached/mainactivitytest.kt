import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Before
    fun launchActivity() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testUI() {

        Espresso.onView(withId(R.id.editText1)).perform(typeText("5"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.editText2)).perform(typeText("3"), closeSoftKeyboard())

        Espresso.onView(withId(R.id.compareButton)).perform(click())

        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("Resultado: Número 1 es mayor")))
    }
}
