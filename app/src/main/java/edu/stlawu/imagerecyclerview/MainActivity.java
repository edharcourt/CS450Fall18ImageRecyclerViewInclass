package edu.stlawu.imagerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.rv_images);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,
                        LinearLayoutManager.VERTICAL,
                        false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        this.imageAdapter =
            new ImageAdapter(
                    ImageURLInterface
                             .create(ImageURLInterface.GOOGLE),
                    this);

        recyclerView.setAdapter(this.imageAdapter);
        recyclerView.addItemDecoration(
            new DividerItemDecoration(this,
                    DividerItemDecoration.VERTICAL));
    }
}
