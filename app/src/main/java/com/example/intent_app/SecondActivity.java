package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void closeButton(View view) {
        EditText lessonInput = findViewById(R.id.lesson_name_input);
        String lessonName = lessonInput.getText().toString();
        TextView tv = findViewById(R.id.lesson);
        tv.setText(lessonName);

        Intent intent = new Intent();
        intent.putExtra("lessonName", lessonName);
        setResult(RESULT_OK, intent);
        finish();
    }
}