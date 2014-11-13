package com.fguide2.pdv69.fguide2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class StartActivity extends Activity {

    RadioButton dap;
    RadioButton esp;
    RadioButton lac;
    RadioButton pno;
    RadioGroup RG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        RG=(RadioGroup) findViewById(R.id.rgGroup);
        dap=(RadioButton) findViewById(R.id.rbDapitan);
        esp=(RadioButton) findViewById(R.id.rbEspanya);
        lac=(RadioButton) findViewById(R.id.rbLacson);
        pno=(RadioButton) findViewById(R.id.rbPNoval);

        /*RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                Intent intent = null;
                if(checkedId==R.id.rbDapitan){
                    intent = new Intent(StartActivity.this,SelectionActivity.class);
                }
                else if (checkedId==R.id.rbEspanya){
                    intent = new Intent(StartActivity.this,SelectionActivity_Esp.class);
                }
                else if (checkedId==R.id.rbLacson){
                    intent = new Intent(StartActivity.this,SelectionActivity_Lac.class);
                }
                else if (checkedId==R.id.rbPNoval){
                    intent = new Intent(StartActivity.this,SelectionActivity_Nov.class);
                }
                startActivity(intent);
             }
        }
        );*/

        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgGroup, int checkedId) {
                Button button = (Button)findViewById(R.id.btnSearch);
                switch (checkedId) {
                    case R.id.rbDapitan:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), SelectionActivity.class));
                                    }
                                }
                        );
                        break;

                    case R.id.rbEspanya:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), SelectionActivity_Esp.class));
                                    }
                                }
                        );
                        break;

                    case R.id.rbLacson:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), SelectionActivity_Lac.class));
                                    }
                                }
                        );
                        break;

                    case R.id.rbPNoval:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), SelectionActivity_Nov.class));
                                    }
                                }
                        );
                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
