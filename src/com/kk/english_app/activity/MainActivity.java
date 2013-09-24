package com.kk.english_app.activity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.kk.english_app.R;
import com.kk.english_app.helper.ToastHelper;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private EditText mIdEditText;
    private EditText mPassEditText;
    private EditText mPassAgainEditText;
    private Button mSubmitBtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        initView();
    }

    private void initView(){
        mIdEditText = getEt(R.id.id_edit_text);
        mPassEditText = getEt(R.id.pass_edit_text);
        mPassEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        mPassAgainEditText = getEt(R.id.pass_again_edit_text);
        mPassAgainEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        mSubmitBtn = getBtn(R.id.submit_btn);
        mSubmitBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit_btn:
                onClickSubmitBtn();
                break;
        }
    }

    
    private void onClickSubmitBtn(){
        String idText = mIdEditText.getText().toString();
        String passText = mPassEditText.getText().toString();
        String passAgainText = mPassAgainEditText.getText().toString();

        if(idText != null && passText != null && passAgainText != null){
            if(!idText.equals("") && !passText.equals("") && !passAgainText.equals("")){
                if(passText.equals(passAgainText)){
                    ToastHelper.shortMessage(getApplicationContext(), "Your ID is " + idText + " and Pass is " + passText);
                }else{
                    ToastHelper.shortMessage(getApplicationContext(), "パスワードが正しくありません");
                }
            }else{
                ToastHelper.shortMessage(getApplicationContext(), "すべて入力してください");
            }
        }

    }

}
