package com.example.affirmations

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test

    fun useAppContext() {

        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.affirmations", appContext.packageName)
    }


}
