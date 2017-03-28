package com.jude.libraryprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    LineProgress lineView;
    RotatingProgressView rotate;
    ProgressView progressView;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineView = (LineProgress) findViewById(R.id.lineView);
        rotate = (RotatingProgressView) findViewById(R.id.rotate);
        progressView = (ProgressView) findViewById(R.id.progressView);
        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lineView.drawAgain();
                progressView.drawAgain();
            }
        });

    }
}
