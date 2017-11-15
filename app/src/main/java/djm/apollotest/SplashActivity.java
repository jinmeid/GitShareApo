package djm.apollotest;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView =findViewById(R.id.iv);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                this, R.drawable.animator_vector);
        imageView.setImageDrawable(animatedVectorDrawableCompat);

        if(animatedVectorDrawableCompat != null){
            animatedVectorDrawableCompat.start();
        }

        ImageView iv2 =findViewById(R.id.iv2);
        AnimatedVectorDrawableCompat drawable = AnimatedVectorDrawableCompat.create(this,R.drawable.vector_animt);
       iv2.setImageDrawable(drawable);
       drawable.start();

    }


}
