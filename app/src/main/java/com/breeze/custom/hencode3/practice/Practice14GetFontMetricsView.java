package com.breeze.custom.hencode3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice14GetFontMetricsView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String[] texts = {"A", "a", "J", "j", "Â", "â"};
    float yOffset;
    int top = 200;
    int bottom = 400;

    public Practice14GetFontMetricsView(Context context) {
        super(context);
    }

    public Practice14GetFontMetricsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice14GetFontMetricsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(20);
        paint1.setColor(Color.parseColor("#E91E63"));
        paint2.setTextSize(160);

        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        yOffset = -(fontMetrics.ascent + fontMetrics.descent) / 2;
        //baseline     是基线  baseline以上是负值，baseline以下是正值   因此ascent和top都是负值，descent和bottom都是正值
        //ascent    从baseline往上至至文本最高处的距离称之为ascent(上坡度)
        //descent   baseline至文本最低处的距离称之为descent(下坡度)
        //top、bottom    是绘制文本时在最外层留出的一些内边距
        //具体可以看mipmap目录下的text_paint图片
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(50, top, getWidth() - 50, bottom, paint1);

        // 使用 Paint.getFontMetrics() 计算出文字的显示区域
        // 然后计算出文字的绘制位置，从而让文字上下居中
        // 这种居中算法的优点是，可以让不同的文字的 baseline 对齐

        int middle = (top + bottom) / 2;
        canvas.drawText(texts[0], 100, middle + yOffset, paint2);
        canvas.drawText(texts[1], 200, middle + yOffset, paint2);
        canvas.drawText(texts[2], 300, middle + yOffset, paint2);
        canvas.drawText(texts[3], 400, middle + yOffset, paint2);
        canvas.drawText(texts[4], 500, middle + yOffset, paint2);
        canvas.drawText(texts[5], 600, middle + yOffset, paint2);
    }
}
