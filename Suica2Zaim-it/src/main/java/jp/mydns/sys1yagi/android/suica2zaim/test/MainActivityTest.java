package jp.mydns.sys1yagi.android.suica2zaim.test;

import android.test.ActivityInstrumentationTestCase2;
import jp.mydns.sys1yagi.android.suica2zaim.*;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class); 
    }

    public void testActivity() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }
}

