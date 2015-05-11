package ee.sinchukov.customarrayadapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class InfoActivity extends ActionBarActivity {

    private int position;
    Bundle extras;
    TextView textView;
    String [] population;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // get extras from Main Screen
        extras = getIntent().getExtras();
        position = extras.getInt(MainActivity.EXTRA_POSITION);

        // population info
        population = getResources().getStringArray(R.array.population);

        // set info text
        textView = (TextView)findViewById(R.id.textView);
        textView.setText(population[position]);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
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
}
