package com.jude.libraryprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jude on 3/28/2017.
 */

public class MultipleProgressView extends View
{
    Paint paint1, paint2, paint3, paint4;

    public MultipleProgressView(Context context)
    {
        super(context);
        init();
    }

    public MultipleProgressView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public MultipleProgressView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        final RectF rectF1 = new RectF(5, 5, width - 5, height - 5);
        canvas.drawArc(rectF1, 0, 90, false, paint1); // RED
        canvas.drawArc(rectF1, 90, 90, false, paint3); // YELLOW
        canvas.drawArc(rectF1, 180, 90, false, paint2); // GREEN
        canvas.drawArc(rectF1, 270, 90, false, paint4); // BLUE
    }

    private void init()
    {
        paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setStrokeWidth(5f);
        paint1.setStyle(Paint.Style.STROKE);

        paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        paint2.setStrokeWidth(5f);
        paint2.setStyle(Paint.Style.STROKE);

        paint3 = new Paint();
        paint3.setColor(Color.YELLOW);
        paint3.setStrokeWidth(5f);
        paint3.setStyle(Paint.Style.STROKE);

        paint4 = new Paint();
        paint4.setColor(Color.BLUE);
        paint4.setStrokeWidth(5f);
        paint4.setStyle(Paint.Style.STROKE);
    }
}
