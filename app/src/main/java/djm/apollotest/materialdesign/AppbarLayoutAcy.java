package djm.apollotest.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import djm.apollotest.R;

/**
 * Created by deng on 2017/11/13.
 */

public class AppbarLayoutAcy extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_toolbar_ayout);
        TabLayout mTabLayout = findViewById(R.id.tab_layout);
        mTabLayout.addTab(mTabLayout.newTab().setText("个性推荐"));
        mTabLayout.addTab(mTabLayout.newTab().setText("歌单"));
        mTabLayout.addTab(mTabLayout.newTab().setText("主播电台"));
        mTabLayout.addTab(mTabLayout.newTab().setText("排行榜"));




    }
}
