package com.example.recipebookapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowRecipeActivity extends AppCompatActivity {
    private TextView textView2;
    private String text_searched;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_recipe);
        Bundle bundle = getIntent().getExtras();
        text_searched = bundle.getString("ts");
        textView2 = findViewById(R.id.second_textView1);
        textView2.setText(text_searched);

    }
}
