package com.rafaosousa.example.espressotestexample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainTextShouldBeHelloWorldOnInit() {
        onView(withId(R.id.textview_main))
                .check(matches(withText(getStringWithId(getStringId("hello_world")))));
    }

    @Test
    public void mainTextShouldChangeAfterMainButtonClick() {
        onView(withId(R.id.button_main)).perform(click());
        onView(withId(R.id.textview_main))
                .check(matches(withText(getStringWithId(getStringId("hello_world_with_espresso")))));
    }

    @Test
    public void mainButtonTextShouldBeTryItOnInit() {
        onView(withId(R.id.button_main))
                .check(matches(withText(getStringWithId(getStringId("button_main")))));
    }

    @Test
    public void secondaryButtonTextShouldBeTryItOnInit() {
        onView(withId(R.id.button_secondary))
                .check(matches(withText(getStringWithId(getStringId("button_secondary")))));
    }

    @Test
    public void secondaryTextOnSecondaryActivityShoudBeOnInit() {
        onView(withId(R.id.button_secondary)).perform(click());
        onView(withId(R.id.textview_secondary))
                .check(matches(withText("13546879")));
    }

    private static int getStringId(String s) {
        Context targetContext = InstrumentationRegistry.getTargetContext();
        String packageName = targetContext.getPackageName();
        return targetContext.getResources().getIdentifier(s, "string", packageName);
    }

    private static String getStringWithId(int id) {
        return InstrumentationRegistry.getTargetContext().getResources().getString(id);
    }
}
