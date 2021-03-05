package com.example.kojimachi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.kojimachi.R;

public class FrmLogin extends BaseFragment implements View.OnClickListener {
    private EditText edtLoginID;
    private EditText edtLoginPass;
    @Override
    protected int getLayoutResId() {
        return R.layout.frm_login;
    }

    @Override
    protected int getCurrentFragment() {
        return 0;
    }

    @Override
    protected void finish() {

    }

    @Override
    protected void loadControlsAndResize(View view) {
        View imgLogo = view.findViewById(R.id.imgLogo);
        imgLogo.getLayoutParams().width = actMain.getSizeWithScale(192);
        imgLogo.getLayoutParams().height = actMain.getSizeWithScale(146);

        View imgLogoText = view.findViewById(R.id.imgLogoText);
        imgLogoText.getLayoutParams().width = actMain.getSizeWithScale(234);
        imgLogoText.getLayoutParams().height = actMain.getSizeWithScale(50);

        View clEdtLoginID = view.findViewById(R.id.clEdtLoginID);
        clEdtLoginID.getLayoutParams().width = actMain.getSizeWithScale(302);

        edtLoginID = view.findViewById(R.id.edtLoginID);
        edtLoginID.getLayoutParams().height = actMain.getSizeWithScale(46);

        View clEdtLoginPass = view.findViewById(R.id.clEdtLoginPass);
        clEdtLoginPass.getLayoutParams().width = actMain.getSizeWithScale(302);

        edtLoginPass = view.findViewById(R.id.edtLoginPass);
        edtLoginPass.getLayoutParams().height = actMain.getSizeWithScale(46);

        View btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.getLayoutParams().width = actMain.getSizeWithScale(302);
        btnLogin.getLayoutParams().height = actMain.getSizeWithScale(46);
    }

    @Override
    public void onClick(View v) {

    }

}