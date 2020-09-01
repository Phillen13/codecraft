package com.codecraft.test1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputString = findViewById(R.id.et_input_string);
        Button checkString = findViewById(R.id.btn_check);
        TextView result = findViewById(R.id.tv_result);

        checkString.setOnClickListener(v ->
        {
            if (inputString.getText() != null) {
                if (checkOccurrence(inputString.getText().toString())) {
                    result.setTextColor(Color.GREEN);
                    result.setText(R.string.positive_result);
                } else {
                    result.setTextColor(Color.RED);
                    result.setText(R.string.negative_result);
                }
            }
        });

    }

    /**
     * If a particular String has a first character that
     * is in the range [A-Z], returns true, else false.
     *
     * @param toCheck The String that is being checked.
     */
    public static boolean checkOccurrence(String toCheck) {
        if (!toCheck.equals("")) {
            String firstChar = "" + toCheck.charAt(0);
            return firstChar.matches(".*[A-Z].*");
        }
        return false;
    }
}