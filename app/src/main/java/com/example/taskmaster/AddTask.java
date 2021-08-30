package com.example.taskmaster;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddTask extends AppCompatActivity {

    TextView taskTitle;
    TextView taskDescription;
    TextView totalTasks;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        taskTitle = findViewById(R.id.editTextTaskTitle);
        taskDescription = findViewById(R.id.editTextTaskDescription);
        totalTasks = findViewById(R.id.editTextNumber);
    }



}
