package kr.ac.hansung.jmlee.ch02_basicui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        R.string.button_clicked_msg, Toast.LENGTH_SHORT).show();
            }
        });

        Button  button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new Button2Listener());
    }

    class Button2Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            ((Button)v).setText("Button2 is clicked");
        }
    }

    public void onButton3Clicked(View v){
        Log.i("jmlee", "Button3 is clicked");
    }
}
