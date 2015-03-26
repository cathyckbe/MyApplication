package johnnyluo.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Square extends View {
    private Paint paint = new Paint();

    public Square (Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int viewHeight = this.getHeight();
        int viewWidth = this.getWidth();

        paint.setColor(Color.BLACK);
        canvas.drawRect(350, 400, 700, 750,paint);

    }
}
