package com.ianmunene.javalove;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Get the drink from the intent
        int drinkId = (int) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        // Populate the drink name
        TextView name = findViewById(R.id.tv_drink_name);
        name.setText(drink.getName());

        // Populate the description
        TextView description = findViewById(R.id.tv_description);
        description.setText(drink.getDescription());

        // Populate the drink Image
        ImageView drinkImage = findViewById(R.id.iv_drink);
        drinkImage.setImageResource(drink.getImageResourceId());
        drinkImage.setContentDescription(drink.getName());
    }
}
