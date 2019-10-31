package com.example.d_icebreakers;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void On_Roll_Dice(View view)
    {
        TextView Score = this.findViewById(R.id.Score);
        TextView tv = this.findViewById(R.id.textView);
        TextView Output = this.findViewById(R.id.OutputBox);



        Random r = new Random();
        int number = r.nextInt(6)+1; // gives numbers between 1-6

        Output.setText(Integer.toString(number));

        TextInputEditText UI = this.findViewById(R.id.U_Input);
        try
        {
            int UIasInteger = Integer.parseInt(UI.getText().toString());
        }
        catch (NumberFormatException nfe){

        }
        int UIasInteger = Integer.parseInt(UI.getText().toString());


        if (number == UIasInteger) {
            tv.setText("Congratulations");
            counter = counter+1;
            Score.setText(Integer.toString(counter));
        }
        else
        {
            tv.setText("Nope");
        }

    }
    public void On_DIcebreaker_Click(View view)
    {
        TextView Output = this.findViewById(R.id.OutputBox);
        Random r = new Random();
        int number = r.nextInt(6)+1;


        switch (number)
        {
            case 1:
                Output.setText("If you could go anywhere in the world, where would you go?");
                break;
            case 2:
                Output.setText("If you were stranded on a desert island, what three things would you want to take with you?");
                break;
            case 3:
                Output.setText("If you could eat only one food for the rest of your life, what would that be?");
                break;
            case 4:
                Output.setText("If you won a million dollars, what is the first thing you would buy?");
                break;
            case 5:
                Output.setText("If you could spend the day with one fictional character, who would it be?");
                break;
            case 6:
                Output.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
                break;
        }
    }
    public void On_Exit_Click(View view)
    {
        System.exit(0);
    }
}
