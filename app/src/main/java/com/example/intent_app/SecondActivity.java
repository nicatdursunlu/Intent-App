package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText lesson = findViewById(R.id.lesson_name_input);
        String fenn = lesson.getText().toString();
        TextView tv = findViewById(R.id.lesson);
        tv.setText(fenn);


        Intent intent = getIntent();
        String lessonName = "";
        intent.putExtra("lessonName", lessonName);
        setResult(RESULT_OK, intent);
//        finish();
    }
}