package manjunathkr.githubsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hello
        //This is new changes

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);


    }
}
