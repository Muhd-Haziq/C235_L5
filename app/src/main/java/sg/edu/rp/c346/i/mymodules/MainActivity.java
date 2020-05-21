package sg.edu.rp.c346.i.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.c346);
        mod2 = findViewById(R.id.c349);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent(MainActivity.this, ModuleDetailActivity.class);
                details.putExtra("code", "C346");
                details.putExtra("name", "Android Programming");
                details.putExtra("year", 2020);
                details.putExtra("semester", 1);
                details.putExtra("credit", 4);
                details.putExtra("venue", "W66M");

                startActivity(details);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent(MainActivity.this, ModuleDetailActivity.class);
                details.putExtra("code", "C349");
                details.putExtra("name", "iPad Programming");
                details.putExtra("year", 2021);
                details.putExtra("semester", 2);
                details.putExtra("credit", 3);
                details.putExtra("venue", "E66I");

                startActivity(details);
            }
        });

    }
}
