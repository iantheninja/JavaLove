package com.ianmunene.javalove;

import android.app.Activity;
import android.os.Bundle;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
