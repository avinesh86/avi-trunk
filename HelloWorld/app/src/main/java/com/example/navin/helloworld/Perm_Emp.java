package com.example.navin.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Perm_Emp extends AppCompatActivity implements OnItemSelectedListener {


    EditText txt1;
    EditText txtCount;
    EditText editTextUnit;
    EditText editTextHrs;
    int Row;
    int Col;
    int count, i, j;
    String str;
    String stm;
    String Count;
    String Unit;
    String hrs;
    Button Create;
    TableLayout TabLayout_Create;
    TableLayout TabLayout_Show;
    Button Show;
    private RadioGroup radioDayGroup;
    private RadioButton radioDayButton;
    TextView hrsView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perm__emp);

        //txt1 = (EditText) findViewById(R.id.editText1);
        txtCount = (EditText) findViewById(R.id.editText2);
        editTextHrs = (EditText) findViewById(R.id.editTextHrs);
        editTextUnit=(EditText) findViewById(R.id.editTextUnit);
        Create = (Button) findViewById(R.id.button1);
        Show = (Button) findViewById(R.id.Show);
        TabLayout_Create = (TableLayout) findViewById(R.id.TableLayout);
        TabLayout_Show = (TableLayout) findViewById(R.id.TableLayout2);
        radioDayGroup = (RadioGroup) findViewById(R.id.radioDayType);
        hrsView = (TextView) findViewById(R.id.textview5);



        // get selected radio button from radioGroup
        int selectedId = radioDayGroup.getCheckedRadioButtonId();

        // find the radio button by returned id
        radioDayButton = (RadioButton) findViewById(selectedId);

        Toast.makeText(Perm_Emp.this, radioDayButton.getText(),
                Toast.LENGTH_SHORT).show();

        if (radioDayButton.getText().toString().equals("Full Day")) {
            editTextHrs.setVisibility(View.GONE);
            hrsView.setVisibility(View.GONE);
            editTextHrs.setFocusable(false);
            editTextHrs.setClickable(false);
        } else {
            editTextHrs.setVisibility(View.VISIBLE);
            hrsView.setVisibility(View.VISIBLE);
        }

        radioDayButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = radioDayGroup.getCheckedRadioButtonId();
                String xx=radioDayButton.getText().toString();
                // find the radio button by returned id
                radioDayButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(Perm_Emp.this, radioDayButton.getText(),
                        Toast.LENGTH_SHORT).show();

                if (radioDayButton.getText().toString().equals("Full Day")) {
                    editTextHrs.setVisibility(View.GONE);
                    hrsView.setVisibility(View.GONE);
                    editTextHrs.setFocusable(false);
                    editTextHrs.setClickable(false);
                } else {
                    editTextHrs.setVisibility(View.VISIBLE);
                    hrsView.setVisibility(View.VISIBLE);
                }

                // Toast.makeText(MainActivity.this,radioDayButton.getText(),
                // Toast.LENGTH_SHORT).show();
            }
        });

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Male");
        categories.add("Female");
        categories.add("Cont male");
        categories.add("Cont Female");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
                String x = (String) parent.getItemAtPosition(position);
                Toast.makeText(Perm_Emp.this, x, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        final String text = spinner.getSelectedItem().toString();
        Toast.makeText(Perm_Emp.this, text, Toast.LENGTH_SHORT).show();

        Create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

				/*
				 * Row= Integer.parseInt(txt1.getText().toString()); Col=
				 * Integer.parseInt(txt2.getText().toString());
				 */
                Count = txtCount.getText().toString();
                Unit = editTextUnit.getText().toString();
                hrs = editTextHrs.getText().toString();

               /* Row = Integer.parseInt(str);
                Col = Row = Integer.parseInt(stm);

                Toast.makeText(Perm_Emp.this, str, Toast.LENGTH_SHORT)
                        .show();
                Toast.makeText(Perm_Emp.this, stm, Toast.LENGTH_SHORT)
                        .show();*/

                // TextView[] txt;
                // for (i = 1; i <= Row; i++) {
                for (i = 1; i <= 1; i++) {
                    final TableRow row = new TableRow(Perm_Emp.this);
                    if (i % 2 == 0) {
                        row.setBackgroundColor(Color.MAGENTA);
                    } else {
                        row.setBackgroundColor(Color.GRAY);
                    }

                    // for (j = 1; j <= Col; j++) {
                    for (j = 1; j < 2; j++) {

                        final EditText txt = new EditText(Perm_Emp.this);
                        txt.setTextColor(Color.GREEN);
                        txt.setTextSize(TypedValue.COMPLEX_UNIT_PT, 8);
                        txt.setTypeface(Typeface.SERIF, Typeface.BOLD);
                        txt.setGravity(Gravity.LEFT);
                        // txt.setText("C" + i + j + " ");
                        txt.setText(spinner.getSelectedItem().toString()
                                + "   " + hrs + "   " + Count);

                        row.addView(txt);
                    }
                    TabLayout_Create.addView(row);

                }

            }
        });

        Show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                for (i = 0; i < Row; i++) {
                    final TableRow row = (TableRow) TabLayout_Create
                            .getChildAt(i);
                    final TableRow row1 = new TableRow(Perm_Emp.this);

                    if (i % 2 == 0) {
                        row1.setBackgroundColor(Color.YELLOW);
                    } else {
                        row1.setBackgroundColor(Color.RED);
                    }
                    for (j = 0; j < Col; j++) {
                        final EditText etxt = (EditText) row.getChildAt(j);

                        final TextView txt = new TextView(Perm_Emp.this);
                        txt.setTextColor(Color.GREEN);
                        txt.setTextSize(TypedValue.COMPLEX_UNIT_PT, 8);
                        txt.setTypeface(Typeface.SERIF, Typeface.BOLD);
                        txt.setGravity(Gravity.LEFT);
                        txt.setText(etxt.getText());

                        row1.addView(txt);
                    }
                    TabLayout_Show.addView(row1);
                }

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub

    }

}
