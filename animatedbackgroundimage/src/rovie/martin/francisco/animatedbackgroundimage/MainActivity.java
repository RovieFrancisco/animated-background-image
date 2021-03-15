package rovie.martin.francisco.animatedbackgroundimage;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout root = (LinearLayout) findViewById(R.id.root);

        AnimationDrawable anim = (AnimationDrawable) root.getBackground();

        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);

        anim.start();
    }
}