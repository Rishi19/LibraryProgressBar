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

public class RotatingProgressView extends View
{
    Paint paint1, paint2, paint3, paint4;
    int startAngle1 = 0, startAngle2 = 90, startAngle3 = 180, startAngle4 = 270;

    public RotatingProgressView(Context context)
    {
        super(context);
        init();
    }

    public RotatingProgressView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public RotatingProgressView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
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

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        final RectF rectF1 = new RectF(5, 5, width - 5, height - 5);
        final RectF rectF2 = new RectF(15, 15, width - 15, height - 15);
        final RectF rectF3 = new RectF(30, 30, width - 30, height - 30);
        final RectF rectF4 = new RectF(45, 45, width - 45, height - 45);

        canvas.drawArc(rectF1, startAngle1, 180, false, paint1);
        canvas.drawArc(rectF2, startAngle2, 180, false, paint2);
        canvas.drawArc(rectF3, startAngle3, 180, false, paint3);
        canvas.drawArc(rectF4, startAngle4, 180, false, paint4);
        startAngle1 += 10;
        startAngle2 -= 5;
        startAngle3 += 10;
        startAngle4 += 5;
        invalidate();
    }
}
