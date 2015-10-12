package activity.ctec.errorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class errorActivity extends AppCompatActivity
{

    private Button BaconButton;()
    private Button EggsButton;
    private EditText BaconText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        BaconButton = (Button) findViewById(R.id.BaconButton);
        EggsButton = (Button) findViewById(R.id.EggsButton);
        BaconText = (EditText) findViewById(R.id.BaconText);
        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_error, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        BaconButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonClickView)
            {
                //stuff here
            }
        });
    }
}
