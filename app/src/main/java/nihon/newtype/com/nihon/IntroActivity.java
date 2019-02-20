package nihon.newtype.com.nihon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }


    public void firstBtn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

}