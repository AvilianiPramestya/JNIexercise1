package id.ac.ui.cs.mobileprogramming.aviliani.exercise6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public native String helloWorld();

    static {
        System.loadLibrary("exercise6");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.text_hello_world)).setText(helloWorld());
    }
}
