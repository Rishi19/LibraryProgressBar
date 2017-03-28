package com.jude.libraryprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Jude on 3/28/2017.
 */

public class SemiArcProgressView extends View
{
    Paint paint1, paint2, paint3;

    public SemiArcProgressView(Context context)
    {
        super(context);
        init();
    }

    public SemiArcProgressView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public SemiArcProgressView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setStrokeWidth(15f);
        paint1.setStyle(Paint.Style.STROKE);

        paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        paint2.setStrokeWidth(15f);
        paint2.setStyle(Paint.Style.STROKE);

        paint3 = new Paint();
        paint3.setColor(Color.YELLOW);
        paint3.setStrokeWidth(15f);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float radius;

        if (width > height)
        {
            radius = height / 2;
        }
        else
        {
            radius = width / 2;
        }
        Path path = new Path();
        path.addCircle(width, height, radius, Path.Direction.CW);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);

        float center_x, center_y;
        final RectF oval = new RectF();
        paint.setStyle(Paint.Style.STROKE);

        center_x = width / 2;
        center_y = height / 2;

        Log.i("TEST", "Width : "+width+" == Height : "+height);
        Log.i("TEST", "center_x : "+center_x+" == center_y : "+center_y);
        Log.i("TEST", "radius : "+radius);

        oval.set(center_x - radius, (center_y - radius) + 10, center_x + radius, center_y + radius);
        canvas.drawArc(oval, 180, 45, false, paint1); // RED
        canvas.drawArc(oval, 225, 45, false, paint2); // GREEN
        canvas.drawArc(oval, 270, 90, false, paint3); // YELLOW*/

        /*final RectF rectF1 = new RectF(5, 5, width - 5, (height) - 5);
        canvas.drawArc(rectF1, 180, 45, false, paint1); // RED
        canvas.drawArc(rectF1, 225, 45, false, paint2); // GREEN
        canvas.drawArc(rectF1, 270, 90, false, paint3); // YELLOW*/
    }
}
