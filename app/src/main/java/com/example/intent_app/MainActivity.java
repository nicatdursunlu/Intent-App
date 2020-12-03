package com.example.intent_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final int REQ_CODE = 123;

    public void openSecondScreen(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE) {
            String lessonName = data.getStringExtra("lessonName");
            TextView tv = findViewById(R.id.lesson_name_text);
            tv.setText("Lesson is " + lessonName);
            Toast.makeText(this, "Lesson is : " + lessonName, Toast.LENGTH_LONG).show();
        }
    }
}