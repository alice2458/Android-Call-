package com.example.alice.panwink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.support.v4.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etNum = null;
    private Button btDial = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dial = findViewById(R.id.btDal);

        dial.setOnClickListener(new MyListener());
    }
    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText num = MainActivity.this.findViewById(R.id.etNum);
            String number = num.getText().toString();
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + number));
            startActivity(intent);
        }
    }
}
