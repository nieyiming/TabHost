package com.tang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
public class FirstFragment extends Fragment {
    private View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_first,null);
        Log.d("Fragment","FirstFragment onCreateView");
        return mView;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("info","FirstFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("info", "FirstFragment onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("info", "FirstFragment onResume");
    }
}
