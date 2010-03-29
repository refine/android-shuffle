package org.dodgybits.shuffle.android.core.activity.flurry;

import static org.dodgybits.shuffle.android.core.util.Constants.cFlurryApiKey;
import android.app.Activity;

import com.flurry.android.FlurryAgent;

public abstract class FlurryEnabledActivity extends Activity {

    @Override
    public void onStart()
    {
       super.onStart();
       FlurryAgent.onStartSession(this, cFlurryApiKey);
    }
    
    @Override
    public void onStop()
    {
       super.onStop();
       FlurryAgent.onEndSession(this);
    }
    
}
