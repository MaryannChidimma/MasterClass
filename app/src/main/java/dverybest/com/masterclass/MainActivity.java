package dverybest.com.masterclass;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        image1 =findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 =findViewById(R.id.image3);
        image4 =findViewById(R.id.image4);
        button = findViewById(R.id.button);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable drawable =image.getDrawable();
                image.setImageDrawable(image1.getDrawable());
                image1.setImageDrawable(drawable);
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dverybest.dx.am"));
                startActivity(intent);
            }
        });
    }
}
