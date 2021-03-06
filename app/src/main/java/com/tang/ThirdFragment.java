package com.tang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tangjian on 21/5/15.
 * email:tangjian19900607@gmail.com
 * QQ:562980080
 * WeChat:ITnan562980080
 */
public class ThirdFragment extends Fragment {
    private View mView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_third,null);
        mSwipeRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.swiperefresh);
        Log.d("Fragment", "ThirdFragment onCreateView");
        return mView;
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("info","ThirdFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("info", "ThirdFragment onStop");
    }
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        mSwipeRefreshLayout.setRefreshing(false);
        Log.d("info","ThirdFragment onHiddenChanged");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("info", "ThirdFragment onResume");
    }
}
