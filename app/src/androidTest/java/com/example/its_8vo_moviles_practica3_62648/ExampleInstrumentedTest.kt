package com.example.its_8vo_moviles_practica3_62648

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testNumberButtons() {
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("1")))
    }

    @Test
    fun testAddition() {
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnAdd)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches((withText("5.0"))))
    }

    @Test
    fun testSubtraction() {
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnSubtract)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("3.0")))
    }

    @Test
    fun testMultiplication() {
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("12.0")))
    }

    @Test
    fun testDivision() {
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btnDivide)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("4.0")))
    }

    // test para la practica
    @Test
    fun testPowerSuccess(){
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnPow)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView((withId(R.id.txtResult))).check(matches(withText("125.0")))
    }

    @Test
    fun testPowerFailure(){
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnPow)).perform(click())
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView((withId(R.id.txtResult))).check(matches(withText("3124.0")))
    }

    @Test
    fun testSqrtSuccess(){
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.btnSquareRot)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("9.0")))
    }

    @Test
    fun testSqrtFailure(){
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnSquareRot)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("5.0")))
    }

    @Test
    fun testPercentSuccess(){
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btn0)).perform(click())
        onView(withId(R.id.btn0)).perform(click())
        onView(withId(R.id.btnPercent)).perform(click())
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btn0)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("250.0")))
    }

    @Test
    fun testPercentFailure(){
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btn0)).perform(click())
        onView(withId(R.id.btnPercent)).perform(click())
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btn0)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("151.0")))
    }

    @Test
    fun testMcSuccess(){
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btn7)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.btnMc)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("0.0")))
    }

    @Test
    fun testMcFailure(){
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btn7)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.btnMc)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("21.0")))
    }

    @Test
    fun testMrSuccess(){
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())

        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())

        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("30.0")))
    }

    @Test
    fun testMrFailure(){
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())

        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())

        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("46.0")))
    }

    @Test
    fun testMPlusSuccess(){
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("100.0")))
    }

    @Test
    fun testMPlusFailure(){
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnMPlus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("67.0")))
    }

    @Test
    fun testMMinusSuccess(){
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btn6)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("-100.0")))
    }

    @Test
    fun testMMinusFailure(){
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnMMinus)).perform(click())
        onView(withId(R.id.btnClear)).perform(click())
        onView(withId(R.id.btnMr)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("-67.0")))
    }
}