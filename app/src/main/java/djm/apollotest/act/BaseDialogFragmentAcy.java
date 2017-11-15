package djm.apollotest.act;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import djm.apollotest.R;
import djm.apollotest.dialogfragment.BaseDialogFragment;

/**
 * Created by deng on 2017/11/14.
 */

public class BaseDialogFragmentAcy extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      //  BaseDialogFragment dialogFragment = new BaseDialogFragment();
       // dialogFragment.show(getFragmentManager(),"BaseDialogFragmentAcy");

        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getFragmentManager(),"BaseDialogFramentAcy");

    }
}
