package djm.apollotest.materialdesign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;

import djm.apollotest.R;

/**
 * Created by deng on 2017/11/14.
 */

public class BottomNativeViewAcy extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_native_view);
        BottomNavigationView bnv= findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(this);

        TextInputEditText editText = findViewById(R.id.et);
        editText.setAlpha(0.6f);
        editText.setError("Sorry.wrong.");
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.test1:
                BottomSheetDialog dialog = new BottomSheetDialog(BottomNativeViewAcy.this);
                dialog.setContentView(R.layout.coordinary_layout);
                dialog.show();
                break;
        }
        return false;
    }
}
