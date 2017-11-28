package sneha.clickevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button, this_btn, other_class_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anonymous
        button = findViewById(R.id.anonymous_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I am Anonymous...!", Toast.LENGTH_LONG).show();
            }
        });
        //This
        this_btn = findViewById(R.id.this_btn);
        this_btn.setOnClickListener(this);
        // Other class id
        other_class_btn = findViewById(R.id.other_class_btn);
        other_class_btn.setOnClickListener(new ClickListener());
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.this_btn:
                Toast.makeText(this, "I am defined in this class...!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onClickXml(View view) {
        Toast.makeText(this, "I am in XML....!", Toast.LENGTH_SHORT).show();
    }


    class ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "I am defined in another class....!", Toast.LENGTH_SHORT).show();

        }
    }
}
