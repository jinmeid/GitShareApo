package djm.apollotest.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import djm.apollotest.R;

/**
 * Created by deng on 2017/11/13.
 */

public class CoordinaryLayoutActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {
    private FloatingActionButton btn;
    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private List<String> mDatas;
    private Toolbar  mToolbar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinary_layout);
        initData();
        btn = findViewById(R.id.fab);
        mRecyclerView = findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new HomeAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mToolbar = findViewById(R.id.tool);
        mToolbar.inflateMenu(R.menu.toolbar_menu);
        mToolbar.setOnMenuItemClickListener(this);
    }

    protected void initData()
    {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++)
        {
            for(int kk = 0; kk < 13 ;kk++){
                mDatas.add("" + (char) i + kk);
            }

        }
    }

    public void btnOnClick(View v){
        switch (v.getId()){
            case R.id.fab:
                Snackbar.make(findViewById(R.id.content),"Snackbar", Snackbar.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.collect:
                Toast.makeText(this,"collect",Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }

    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
    {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    CoordinaryLayoutActivity.this).inflate(R.layout.recycle_view, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position)
        {
            holder.tv.setText(mDatas.get(position)+"3333333333333333333333333333333");
        }

        @Override
        public int getItemCount()
        {
            return mDatas.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder
        {

            TextView tv;

            public MyViewHolder(View view)
            {
                super(view);
                tv = view.findViewById(R.id.tv);
            }
        }
    }
}
