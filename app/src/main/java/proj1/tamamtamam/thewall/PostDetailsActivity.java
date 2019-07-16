package proj1.tamamtamam.thewall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PostDetailsActivity extends AppCompatActivity {

    private String title;
    private String price;
    private String place;
    private String imageUrl;

    private ImageView postImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);
        title = getIntent().getStringExtra("title");
        price = getIntent().getStringExtra("price");
        place = getIntent().getStringExtra("place");
        imageUrl = getIntent().getStringExtra("imageUrl");

        setTitle(title);

        postImage = findViewById(R.id.post_image);
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.ic_wallpaper_gray_24dp)
                .into(postImage);

        ((TextView) findViewById(R.id.post_title)).setText(title);
        ((TextView) findViewById(R.id.price)).setText(price);
        ((TextView) findViewById(R.id.place)).setText(place);
    }

}
