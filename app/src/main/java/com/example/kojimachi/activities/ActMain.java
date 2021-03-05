package com.example.kojimachi.activities;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.example.kojimachi.R;
import com.example.kojimachi.fragment.FrmLogin;

public class ActMain extends BaseActivity {
    private Fragment currentFragment;
    private FragmentManager fragmentManager;
    private View layoutMenuBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationApp();
    }

    public void addFragment(Fragment f){
        try {
            fragmentManager = getSupportFragmentManager();
            currentFragment = fragmentManager.findFragmentById(R.id.frameMenuContainer);
            if (currentFragment != null){
                fragmentManager.beginTransaction().remove(currentFragment).commitAllowingStateLoss();
            }
        }catch (Throwable e){
            e.printStackTrace();
        }
        addOrReplaceFragment(R.id.frameParent, f);
    }

    private void navigationApp(){
        addFragment(new FrmLogin());
    }
}