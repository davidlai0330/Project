package com.example.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText weightEditText;
	private EditText heightEditText;
	private Button startButton;
	private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        weightEditText = (EditText)findViewById(R.id.weightEditText);
        heightEditText = (EditText)findViewById(R.id.heightEditText);
        resultTextView = (TextView)findViewById(R.id.resultTextView);
        startButton = (Button)findViewById(R.id.startButton);
        
        startButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				float wValue = Float.parseFloat(weightEditText.getText().toString());
				float hValue = Float.parseFloat(heightEditText.getText().toString());
				
				//BMI = Kg / M*2
				float result = wValue / ((hValue/100)*(hValue/100));
				resultTextView.setText(""+result);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
