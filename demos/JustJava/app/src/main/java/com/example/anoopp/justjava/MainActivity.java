package com.example.anoopp.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity;
    int price;
    final int costCofee=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity=2;
        price=quantity*costCofee;
        display(quantity);
        displayPrice(price);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        price=quantity*costCofee;
        displayPrice(price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method increments the quantity
     */
    public void increment(View view) {
        quantity = quantity+1;
        display(quantity);
    }

    /**
     * This method increments the quantity
     */
    public void decrement(View view) {
        quantity = quantity-1;
        display(quantity);
    }

}
