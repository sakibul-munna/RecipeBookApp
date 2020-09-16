package com.example.recipebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private ImageButton search_button;
    private EditText text_input;
    private Editable text_searched;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search_button = (ImageButton)  findViewById(R.id.main_button);
        text_input = findViewById(R.id.textInputEditTextID);

        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ShowRecipeActivity.class);
                String text_searched = text_input.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(text_searched,"ts");
                myIntent.putExtras(bundle);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}