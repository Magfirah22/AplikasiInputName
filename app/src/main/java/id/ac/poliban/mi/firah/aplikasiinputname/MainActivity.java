package id.ac.poliban.mi.firah.aplikasiinputname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etnama = findViewById(R.id.etnama);
        Button btTampilan = findViewById(R.id.btTampilan);

        btTampilan.setOnClickListener(v -> {
            Toast.makeText(this, "Selamat Datang " + etnama.getText().toString(), Toast.LENGTH_SHORT).show();
        });


    }
}
