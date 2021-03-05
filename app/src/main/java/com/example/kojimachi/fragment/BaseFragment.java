package com.example.kojimachi.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.kojimachi.activities.ActMain;

public abstract class BaseFragment extends Fragment {
    protected String TAG = this.getClass().getSimpleName();

    protected abstract int getLayoutResId();

    protected abstract int getCurrentFragment();

    protected abstract void finish();

    public boolean isBackPreviousEnable() {
        return false;
    }

    public void backToPrevious() {
    }

    protected ActMain actMain;
    private boolean mIsClickAble = true;
    private Handler mHandlerClick = new Handler();

    private Runnable changeStateClickAble = new Runnable() {
        @Override
        public void run() {
            mIsClickAble = true;
        }
    };

    protected abstract void loadControlsAndResize(View view);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResId(), container, false);
        if (actMain == null)
            actMain = (ActMain) getActivity();
        loadControlsAndResize(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (actMain == null)
            actMain = (ActMain) getActivity();
    }

    @Override
    public void onDestroy() {
        try {
            mHandlerClick.removeCallbacks(changeStateClickAble);
            System.gc();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }
}
