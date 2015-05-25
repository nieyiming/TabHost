package com.tang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;
    private View mIndicatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewId();
    }

    private void initViewId() {
        mTabHost = (FragmentTabHost) this.findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mIndicatorView = getIndicator("我的");
        mTabHost.addTab(mTabHost.newTabSpec("我的").setIndicator(mIndicatorView), FirstFragment.class, null);

        mIndicatorView = getIndicator("购物车");
        mTabHost.addTab(mTabHost.newTabSpec("购物车").setIndicator(mIndicatorView), SecondFragment.class, null);


        mIndicatorView = getIndicator("首页");
        mTabHost.addTab(mTabHost.newTabSpec("首页").setIndicator(mIndicatorView), ThirdFragment.class, null);


    }

    private View getIndicator(String indicator) {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View view = layoutInflater.inflate(R.layout.indicator_item, null);
        TextView textView = (TextView) view.findViewById(R.id.indicator);
        textView.setText(indicator);
        return view;
    }
}
