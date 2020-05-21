package sg.edu.rp.c346.i.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {


    TextView tvDetails;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails = findViewById(R.id.txtDetails);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent moduleReceiver = getIntent();
        String code = moduleReceiver.getStringExtra("code");
        String name = moduleReceiver.getStringExtra("name");
        int year = moduleReceiver.getIntExtra("year", 0);
        int semester = moduleReceiver.getIntExtra("semester", 0);
        int credit = moduleReceiver.getIntExtra("credit", 0);
        String venue = moduleReceiver.getStringExtra("venue");

        tvDetails.setText(String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s", code, name, year, semester, credit, venue));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ModuleDetailActivity.this, MainActivity.class));

            }
        });


    }
}
