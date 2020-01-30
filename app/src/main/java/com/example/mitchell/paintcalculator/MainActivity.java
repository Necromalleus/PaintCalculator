package com.example.mitchell.paintcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costPerTicket = 1.00;
    int numberOfTickets;
    double totalCost;
    String groupChoice;
    int gallons = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tickets = (EditText)findViewById(R.id.editText);
        final EditText text = (EditText)findViewById(R.id.editText2);
        final Spinner group = (Spinner)findViewById(R.id.spinner);
        final TextView result = ((TextView)findViewById(R.id.textView2));
        Button cost = (Button)findViewById(R.id.button);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfTickets = Integer.parseInt(tickets.getText( ).toString( ));
                gallons = Integer.parseInt(text.getText( ).toString( ));
                totalCost = gallons * numberOfTickets;
                DecimalFormat currency = new DecimalFormat("###,###.##");
                groupChoice =  group.getSelectedItem( ).toString( );
                //groupChoice = text * tickets;
                result.setText("You need " + currency.format(totalCost) + " gallons of " + groupChoice + " paint." );
            }
        });
    }
}
