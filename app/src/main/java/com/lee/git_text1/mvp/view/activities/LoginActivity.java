package com.lee.git_text1.mvp.view.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lee.git_text1.R;
import com.lee.git_text1.mvp.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.login_phone)
    EditText login_Phone;
    @BindView(R.id.login_password)
    EditText login_Password;
    @BindView(R.id.forget_password)
    TextView forget_Password;
    @BindView(R.id.register)
    Button register;
    @BindView(R.id.login_button)
    Button login_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }


    @OnClick({R.id.register, R.id.login_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register:
                break;
            case R.id.login_button:
                break;
        }
    }
}
