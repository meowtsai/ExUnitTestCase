package com.meowroll.android.exunittestcase;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Sophie on 2017/6/14.
 */
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


    }

    @Test
    public void testClick(){
        onView(withId(R.id.buttonFtoC)).perform(click());



    }
    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }

}