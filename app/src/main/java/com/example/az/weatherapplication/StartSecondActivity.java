package com.example.az.weatherapplication;

/**
 * Created by Az on 20.05.2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class StartSecondActivity implements View.OnClickListener {

    public final static String TEXT = "Text";
    private Activity sourceActivity;

    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }
    @Override
    public void onClick(View v) {
        EditText txt =  sourceActivity.findViewById(R.id.editText);
        EditText num =  sourceActivity.findViewById(R.id.editText2);
        Parcel parcel = new Parcel();
        parcel.text = txt.getText().toString();
        parcel.number = Integer.parseInt(num.getText().toString());
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra(TEXT, parcel);
        sourceActivity.startActivityForResult(intent, 1);
    }


}

