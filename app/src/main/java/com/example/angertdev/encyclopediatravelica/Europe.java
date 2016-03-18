package com.example.angertdev.encyclopediatravelica;

//Importing required packages
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Europe extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //Declaring text view for fields that update based on the country selection
    TextView europeCapital;
    TextView europeLanguage;
    TextView europeCurrency;
    TextView europeVisa;

    //Populating arrays containing European capitals, languages, currencies and visa requirements for British citizens
    String[] capital = {" - ", "Vienna", "Brussels", "Prague", "Copenhagen", "Paris", "Berlin", "Athens", "Reykjavik", "Dublin", "Rome", "Amsterdam", "Lisbon", "Bucharest", "Moscow", "Madrid", "Stockholm", "Kiev", "London"};
    String[] language = {" - ", "German", "Dutch", "Czech", "Danish", "French", "German", "Greek", "Icelandic", "English", "Italian", "Dutch", "Portuguese", "Romanian", "Russian", "Spanish", "Swedish", "Ukrainian", "English"};
    String[] currency = {" - ", "Euro (EUR)", "Euro (EUR)", "Koruna (CZK)", "Krone (DKK)", "Euro (EUR)", "Euro (EUR)", "Euro (EUR)", "Krona (ISK)", "Euro (EUR)", "Euro (EUR)", "Euro (EUR)", "Euro (EUR)", "Leu (RON)", "Ruble (RUB)", "Euro (EUR)", "Krona (SEK)", "Hryvnia (UAH)", "Pound Sterling (GBP)"};
    String[] visa = {" - ", "No", "No", "No", "No", "No", "No", "No", "No", "No", "No", "No", "No", "No", "Yes", "No", "No", "No", "No"};

    //Creating a spinner for European countries
    Spinner spinnerEurope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        //Linking the textViews to the GUI layout textViews
        europeCapital = (TextView) findViewById(R.id.asiaCapitalTV);
        europeLanguage = (TextView) findViewById(R.id.asiaLanguageTV);
        europeCurrency = (TextView) findViewById(R.id.asiaCurrencyTV);
        europeVisa = (TextView) findViewById(R.id.asiaVisaTV);

        //Linking the spinner to the GUI layout spinner
        spinnerEurope = (Spinner) findViewById(R.id.asiaSpinner);

        //Creating an instance of the listener class
        spinnerEurope.setOnItemSelectedListener(this);

        //Creating an array adapter using the European country string resource
        ArrayAdapter adapterEurope = ArrayAdapter.createFromResource(this, R.array.europeanCountries, android.R.layout.simple_spinner_dropdown_item);
        spinnerEurope.setAdapter(adapterEurope);

    }

    //Code to be executed when spinner selection is made
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //Changes capital/language/currency/visa textView based on country spinner selection by corresponding array position
        //The array is searched (deliverable 7)
        europeCapital.setText(capital[position]);
        europeLanguage.setText(language[position]);
        europeCurrency.setText(currency[position]);
        europeVisa.setText(visa[position]);
    }

    //Code to be executed when no spinner selection is made
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        //Changes all text views to nothing
        europeCapital.setText("");
        europeLanguage.setText("");
        europeCurrency.setText("");
        europeVisa.setText("");
    }
}
