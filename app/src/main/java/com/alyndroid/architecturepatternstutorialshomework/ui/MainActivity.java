package com.alyndroid.architecturepatternstutorialshomework.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.alyndroid.architecturepatternstutorialshomework.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.R;
import com.alyndroid.architecturepatternstutorialshomework.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final DataBase dataBase = new DataBase();


        //MVC Pattern
        binding.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.plusResultTextView.setText(String.valueOf(addTwoNumbers(dataBase)));
            }
        });

        //MVP


        //MVVM


    }

    int addTwoNumbers(DataBase database) {
        int firstNum = database.getNumbers().getFirstNum();
        int secondNum = database.getNumbers().getSecondNum();
        return firstNum + secondNum;
    }
}
