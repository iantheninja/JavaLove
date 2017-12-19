package com.ianmunene.javalove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Drink.drinks);
        ListView listDrinks = findViewById(R.id.lv_drinks);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getBaseContext(), DrinkActivity.class);
                    startActivity(intent);
                }
            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
