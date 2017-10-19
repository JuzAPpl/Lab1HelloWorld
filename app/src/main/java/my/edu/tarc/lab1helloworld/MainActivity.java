package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global variables
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    //onCreate() = main() function in java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView() = show UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Link UI to program
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view){
        String strName;
        int intAge;

        strName = editTextName.getText().toString();
        intAge = Integer.parseInt(editTextAge.getText().toString());
        intAge += 1;

        textViewMessage.setText("Hi " + strName + ", you will be " + intAge + " in 2018.");
    }

    public void resetFields(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("Hello World!");
    }
}
