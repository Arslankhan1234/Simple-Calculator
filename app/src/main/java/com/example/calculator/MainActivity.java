package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


 Float var1;
 Float var2;
 String opt;
 TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textView);

    }

    public void setvariable(View v) {
       Button b=(Button)v;                               //current click view
       String value=b.getText().toString();             //setting value to current click view text


    if(var1==null)                 //if var1 is null(not initially store any value )then view text will store to var1 otherwise in var2

    {
    var1=Float.parseFloat(value);
    }
    else{
    var2=Float.parseFloat(value);
    }

        text.setText(text.getText()+value);         //setting textview to previous value plus new click view value

    }


    //This function set textView to empty
    public void Clear(View view) {
        var1=null;
        var2=null;
        text.setText("");

    }

    public void operator(View v) {

        Button b=(Button)v;                               //current click view
        String value=b.getText().toString();             //setting value to current click view text
        text.setText(text.getText()+value);         //setting textview to previous value plus new click view value
        opt=value;

    }

    public void FinalOutput(View view)
    {
//        Toast.makeText(getApplicationContext(),Float.toString(var1) ,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),Float.toString(var2) ,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),opt ,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),(var1.getClass().getSimpleName()) ,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),(var2.getClass().getSimpleName()) ,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),(opt.getClass().getSimpleName()) ,Toast.LENGTH_SHORT).show();
float result=0;
if(opt.contains("/"))
{
    result=var1/var2;
}
else if(opt.contains("*"))
{
    result=var1*var2;
}
else if(opt.contains("+"))
{
    result=var1+var2;
}

else if(opt.contains("-"))
{
    result=var1-var2;
}

else if(opt.contains("%"))
{
    result=var1%var2;
}
else if(opt.contains("^"))
{
    result= (float) Math.pow(var1,var2);
}

else if(opt.contains("%"))
{
    result= var1%var2;
}




        text.setText(Float.toString(result));
    }
}