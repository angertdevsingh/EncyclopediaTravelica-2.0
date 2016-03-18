package com.example.angertdev.encyclopediatravelica;

//Importing required packages
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Asia extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //Declaring text view for fields that update based on the country selection
    TextView asiaCapital;
    TextView asiaLanguage;
    TextView asiaCurrency;
    TextView asiaVisa;

    //Populating arrays containing Asian capitals, languages, currencies and visa requirements for British citizens
    String[] capital = {" - ", "Phnom Penh", "Beijing", "New Delhi", "Jakarta", "Tokyo", "Kuala Lumpur", "Male", "Ulaanbaatar", "Kathmandu", "Pyongyang", "Islamabad", "Manila", "Singapore", "Seoul", "Bangkok", "Ankara", "Abu Dhabi", "Hanoi"};
    String[] language = {" - ", "Khmer", "Mandarin", "Hindi", "Bahasa Indonesia", "Japanese", "Bahasa Malaysia", "Maldivian Dhivehi", "Mongolian", "Nepali", "Korean", "Punjabi", "Filipino", "English", "Korean", "Thai", "Turkish", "Arabic", "Vietnamese"};
    String[] currency = {" - ", "Riel (KHR)", "Yuan Renminbi (CNY)", "Rupee (INR)", "Rupiah (IDR)", "Yen (JPY)", "Ringgit (MYR)", "Rufiyaa (MVR)", "Tugrik (MNT)", "Rupee (NPR)", "Won (KPW)", "Rupee (PKR)", "Peso (PHP)", "Dollar (SGD)", "Won (KRW)", "Baht (THB)", "Lira (TRY)", "Dirham (AED)", "Dong (VND)"};
    String[] visa = {" - ", "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes", "No", "No"};

    //Creating a spinner for Asian countries
    Spinner spinnerAsia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        //Linking the textViews to the GUI layout textViews
        asiaCapital = (TextView) findViewById(R.id.asiaCapitalTV);
        asiaLanguage = (TextView) findViewById(R.id.asiaLanguageTV);
        asiaCurrency = (TextView) findViewById(R.id.asiaCurrencyTV);
        asiaVisa = (TextView) findViewById(R.id.asiaVisaTV);

        //Linking the spinner to the GUI layout spinner
        spinnerAsia = (Spinner) findViewById(R.id.asiaSpinner);

        //Creating an instance of the listener class
        spinnerAsia.setOnItemSelectedListener(this);

        //Creating an array adapter using the Asian country string resource
        ArrayAdapter adapterAsia = ArrayAdapter.createFromResource(this, R.array.asianCountries, android.R.layout.simple_spinner_dropdown_item);
        spinnerAsia.setAdapter(adapterAsia);

    }

    //Code to be executed when spinner selection is made
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //Changes capital/language/currency/visa textView based on country spinner selection by corresponding array position
        //The array is searched (deliverable 7)
        asiaCapital.setText(capital[position]);
        asiaLanguage.setText(language[position]);
        asiaCurrency.setText(currency[position]);
        asiaVisa.setText(visa[position]);
    }

    //Code to be executed when no spinner selection is made
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        //Changes all text views to nothing
        asiaCapital.setText("");
        asiaLanguage.setText("");
        asiaCurrency.setText("");
        asiaVisa.setText("");
    }
}
