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

public class ProgressView extends View
{
    protected Paint paint1, paint2;
    private int finalAngle = 0;

    public ProgressView(Context context)
    {
        super(context);
        initViews();
    }

    public ProgressView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initViews();
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        final RectF rectF = new RectF(5, 5, width - 5, height - 5);
        canvas.drawArc(rectF, 0, 360, false, paint2);
        if (finalAngle < 180)
        {
            canvas.drawArc(rectF, 0, finalAngle, false, paint1);
            finalAngle += 5;
            invalidate();
        }
        else
        {
            canvas.drawArc(rectF, 0, 180, false, paint1);
        }
    }

    private void initViews()
    {
        paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setStrokeWidth(5f);
        paint1.setStyle(Paint.Style.STROKE);

        paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        paint2.setStrokeWidth(5f);
        paint2.setStyle(Paint.Style.STROKE);
    }

    public void drawAgain()
    {
        finalAngle = 0;
        invalidate();
    }
}
