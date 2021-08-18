//Ong Yu Xuan 20042755
package sg.edu.rp.c346.id20042755.c346sa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lv;
    ArrayList<RatLog> ratLogsList;
    CustomAdapter adapter;
    Button logRat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv = findViewById(R.id.lv);
        new ArrayList<RatLog>() = new
    //    adapter = new CustomAdapter(this, R.layout.row,);
   //     lv.setAdapter(adapter);
        ratLogsList = new ArrayList<>();
        logRat.findViewById(R.id.btnAddLog);

    logRat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LayoutInflater inflater =
                    (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View viewDialog = inflater.inflate(R.layout.input, null);

            final EditText etInput = viewDialog.findViewById(R.id.editTextTextPersonName);
            final EditText etInput2 = viewDialog.findViewById(R.id.editTextTextPersonName2);

            AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity2.this);
            myBuilder.setView(viewDialog);
            myBuilder.setTitle("Add Log");
            myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String message = etInput.getText().toString();
                    String message2 = etInput2.getText().toString();
                }
            });
            myBuilder.setNegativeButton("CANCEL", null);
            AlertDialog myDialog = myBuilder.create();
            myDialog.show();
        }
    });

    }
}