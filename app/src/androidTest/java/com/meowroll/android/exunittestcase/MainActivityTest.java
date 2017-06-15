package com.meowroll.android.exunittestcase;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Sophie on 2017/6/14.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(
            MainActivity.class);

    private MainActivity mActivity;


    @Before
    public void setUp() throws Exception {

        mActivity =mActivityRule.getActivity();
    }


    @Test
    public void testLaunch(){
        assertNotNull(mActivity.findViewById(R.id.editText2));

        onView(withId(R.id.editText2)).perform(typeText("212"));
        onView(withId(R.id.buttonFtoC)).perform(click());

        onView(withId(R.id.textView)).check(matches(withText("華氏 212.000000 度 等於 攝氏 100.000000 度 ")));




    }


    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }

}