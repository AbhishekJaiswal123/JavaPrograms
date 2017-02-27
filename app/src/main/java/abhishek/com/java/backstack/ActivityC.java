package abhishek.com.java.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import abhishek.com.java.R;

/**
 * Created by abhishek on 10/1/17.
 */

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_c);
        Button btn = (Button) findViewById(R.id.nav_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityC.this,ActivityD.class);
                startActivity(intent);
            }
        });
    }
}
