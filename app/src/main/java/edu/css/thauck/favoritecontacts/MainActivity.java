package edu.css.thauck.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnCall1, btnCall2, btnCall3;
    Button btnText1, btnText2, btnText3;
    TextView tvNumber1, tvNumber2, tvNumber3;
    Spinner spinnerMessage1, spinnerMessage2, spinnerMessage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickEventCall1();
        buttonClickEventCall2();
        buttonClickEventCall3();
    }

    private void buttonClickEventCall1() {
        /**
         * Set up button click event listener to call first contact
         */
        btnCall1 = (Button) findViewById(R.id.buttonCall1);
        tvNumber1 = (TextView) findViewById(R.id.textViewPhone1);
        btnCall1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Call contact on button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvNumber1));
                // Check if there is an app that can make phone calls
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });
        /**
         * Set up button click event listener to text first contact
         */
        btnText1 = (Button) findViewById(R.id.buttonText1);
        spinnerMessage1 = (Spinner) findViewById(R.id.spinnerText1);
        btnText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Text contact on button click
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:2188215186"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", String.valueOf(spinnerMessage1));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    private void buttonClickEventCall2() {
        /**
         * Set up button click event listener to call second contact
         */
        btnCall2 = (Button) findViewById(R.id.buttonCall2);
        tvNumber2 = (TextView) findViewById(R.id.textViewPhone2);
        btnCall2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Call contact on button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvNumber2));
                // Check if there is an app that can make phone calls
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        /**
         * Set up button click event listener to text second contact
         */
        btnText2 = (Button) findViewById(R.id.buttonText2);
        spinnerMessage2 = (Spinner) findViewById(R.id.spinnerText2);
        btnText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Text contact on button click
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:2188310036"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", String.valueOf(spinnerMessage2));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    private void buttonClickEventCall3() {
        /**
         * Set up button click event listener to call third contact
         */
        btnCall3 = (Button) findViewById(R.id.buttonCall3);
        tvNumber3 = (TextView) findViewById(R.id.textViewPhone3);
        btnCall3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Call contact on button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvNumber3));
                // Check if there is an app that can make phone calls
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        /**
         * Set up button click event listener to text first contact
         */
        btnText3 = (Button) findViewById(R.id.buttonText3);
        spinnerMessage3 = (Spinner) findViewById(R.id.spinnerText3);
        btnText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Text contact on button click
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:2182322754"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", String.valueOf(spinnerMessage3));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
