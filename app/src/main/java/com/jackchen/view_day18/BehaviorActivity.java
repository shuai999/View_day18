package com.jackchen.view_day18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Create JackChen 2018/3/3 09:09
 */
public class BehaviorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);


        //这两句代码必须要有，并且需要把 values -> style 中的theme主题修改为NoActionBar ,
        Toolbar tool_bar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(tool_bar);


        RecyclerView recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                // 下边这两种写法都是可以的
                View itemView = LayoutInflater.from(BehaviorActivity.this).inflate(R.layout.item_behavior, parent, false) ;
//                View itemView = View.inflate(BehaviorActivity.this , R.layout.item_behavior , null) ;

                ViewHolder holder = new ViewHolder(itemView) ;

                return holder;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 100;
            }
        });

    }


    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
