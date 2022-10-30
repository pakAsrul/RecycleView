package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerview1.models.Book;

public class BookDetailActivity extends AppCompatActivity {

    ImageView iv_food;
    TextView food_title, food_price;
    public static final String ITEM_EXTRA = "item_extra";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        iv_food = findViewById(R.id.food_image);
        food_title = findViewById(R.id.tv_title_detail);
        food_price = findViewById(R.id.tv_price_detail);

        Book food = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(food != null) {
            Glide.with(this)
                    .load(food.getLogo())
                    .into(iv_food);
            food_title.setText(food.getName());
            food_price.setText(food.getPrice());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Book Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}