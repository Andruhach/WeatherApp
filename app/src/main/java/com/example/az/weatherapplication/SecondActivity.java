package com.example.az.weatherapplication;

/**
 * Created by Az on 20.05.2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.az.weatherapplication.StartSecondActivity.TEXT;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Parcel parcel = (Parcel) getIntent().getExtras().getSerializable(TEXT);
        TextView textView =  findViewById(R.id.textView);
        EditText editText =  findViewById(R.id.editText3);
        textView.setText(parcel.text);
        editText.setText(((Integer) parcel.number).toString());
        Toast.makeText(getApplicationContext(),"Second - onCreate()",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Second - onStart()",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Second - onResume()",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Second - onPause()",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Second - onStop()",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Second - onRestart()",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Second - onDestroy()",
                Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBack:
                EditText editText =  findViewById(R.id.editText3);
                Intent intentResult = new Intent();
                intentResult.putExtra("Number", editText.getText().toString());
                setResult(Activity.RESULT_OK, intentResult);
                finish();
                break;
            default:
                break;
        }
    }
}

