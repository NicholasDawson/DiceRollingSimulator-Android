package inventsoft.dicerollingsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView dice;

    private Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = findViewById(R.id.dice);
    }

    public void onClick(View view) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                dice.setText(Integer.toString(r.nextInt( (6 - 1) + 1) + 1));
            }
        }, 250);
        dice.setText("...");


    }
}
