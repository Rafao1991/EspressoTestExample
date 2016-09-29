package com.rafaosousa.example.espressotestexample;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class SecondaryActivityExpressoTest {

    @Rule
    public ActivityTestRule<SecondaryActivity> secondaryActivityRule =
            new ActivityTestRule<>(SecondaryActivity.class, true, false);

    @Test
    public void intentCall() {
        Intent intent = new Intent();
        intent.putExtra("extra", 13546879);
        secondaryActivityRule.launchActivity(intent);
        onView(withId(R.id.textview_secondary))
                .check(matches(withText("13546879")));
    }
}
