package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.recyclerview1.adapters.BookAdapter;
import com.example.recyclerview1.datas.BookData;
import com.example.recyclerview1.models.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvFood;
    Button btnGanti;
    public List<Book> foodList = new ArrayList<>();
    int pilihan = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Book List");

        rvFood = findViewById(R.id.rv_food);

        btnGanti = findViewById(R.id.btn_ganti);



        foodList = BookData.getDataFood();
        BookAdapter foodAdapter = new BookAdapter(foodList);

        rvFood.setAdapter(foodAdapter);
        rvFood.setLayoutManager(new LinearLayoutManager(this));

        rvFood.addItemDecoration(new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL));

        btnGanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pilihan == 1) {
                    rvFood.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
                    pilihan = 2;
                } else if(pilihan == 2) {
                    rvFood.setLayoutManager(new StaggeredGridLayoutManager(2,
                            StaggeredGridLayoutManager.VERTICAL));
                    pilihan = 1;
                }
            }
        });

        foodAdapter.setOnItemClickCallback(new BookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
//                showSelectedFood(data);
                Intent moveIntent = new Intent(MainActivity.this, BookDetailActivity.class);
                moveIntent.putExtra(BookDetailActivity.ITEM_EXTRA, data);
                startActivity(moveIntent);
            }
        });
    }

    private void showSelectedFood(Book data) {
        Toast.makeText(this, "Kamu memilih " + data.getName(), Toast.LENGTH_SHORT).show();
    }
}