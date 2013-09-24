package com.kk.english_app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;

public class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        super.onCreate(savedInstanceState);
    }


    protected Button getBtn(int id) {
        return (Button) this.findViewById(id);
    }
    protected ImageButton getIBtn(int id) {
        return (ImageButton) this.findViewById(id);
    }
    protected TextView getTv(int id) {
        return (TextView) this.findViewById(id);
    }
    protected ImageView getIv(int id) {
        return (ImageView) this.findViewById(id);
    }
    protected EditText getEt(int id) {
        return (EditText) this.findViewById(id);
    }
    protected ProgressBar getPb(int id) {
        return (ProgressBar) this.findViewById(id);
    }
    protected ListView getLv(int id) {
        return (ListView) this.findViewById(id);
    }
    protected View getV(int id) {
        return (View) this.findViewById(id);
    }
    protected ScrollView getSv(int id) {
        return (ScrollView) this.findViewById(id);
    }

}
