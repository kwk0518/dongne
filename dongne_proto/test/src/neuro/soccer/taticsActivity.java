package neuro.soccer;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.AbsoluteLayout.LayoutParams;

public class taticsActivity extends Activity implements OnTouchListener {

	int windowwidth;
	int windowheight;

	// /////////

	private LayoutParams layoutParams1;
	private LayoutParams layoutParams2;
	private LayoutParams layoutParams3;
	private LayoutParams layoutParams4;
	private LayoutParams layoutParams5;
	private LayoutParams layoutParams6;
	private LayoutParams layoutParams7;
	private LayoutParams layoutParams8;
	private LayoutParams layoutParams9;
	private LayoutParams layoutParams10;
	private LayoutParams layoutParams11;

	// /////////////
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tatics);

		windowwidth = getWindowManager().getDefaultDisplay().getWidth();
		windowheight = getWindowManager().getDefaultDisplay().getHeight();

		// ///////

		ImageView ball1 = (ImageView) findViewById(R.id.ball1);
		ball1.setOnTouchListener(this);

		ImageView ball2 = (ImageView) findViewById(R.id.ball2);
		ball2.setOnTouchListener(this);

		ImageView ball3 = (ImageView) findViewById(R.id.ball3);
		ball3.setOnTouchListener(this);

		ImageView ball4 = (ImageView) findViewById(R.id.ball4);
		ball4.setOnTouchListener(this);

		ImageView ball5 = (ImageView) findViewById(R.id.ball5);
		ball5.setOnTouchListener(this);

		ImageView ball6 = (ImageView) findViewById(R.id.ball6);
		ball6.setOnTouchListener(this);

		ImageView ball7 = (ImageView) findViewById(R.id.ball7);
		ball7.setOnTouchListener(this);

		ImageView ball8 = (ImageView) findViewById(R.id.ball8);
		ball8.setOnTouchListener(this);

		ImageView ball9 = (ImageView) findViewById(R.id.ball9);
		ball9.setOnTouchListener(this);

		ImageView ball10 = (ImageView) findViewById(R.id.ball10);
		ball10.setOnTouchListener(this);

		ImageView ball11 = (ImageView) findViewById(R.id.ball11);
		ball11.setOnTouchListener(this);

		// ////////////////

	}

	public boolean onTouch(View v, MotionEvent event) {

		if (v.getId() == R.id.ball1) {

			ImageView ball1 = (ImageView) findViewById(R.id.ball1);
			layoutParams1 = (LayoutParams) ball1.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams1.x = x_cord - 25;
				layoutParams1.y = y_cord - 75;

				ball1.setLayoutParams(layoutParams1);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball2) {

			ImageView ball2 = (ImageView) findViewById(R.id.ball2);
			layoutParams2 = (LayoutParams) ball2.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams2.x = x_cord - 25;
				layoutParams2.y = y_cord - 75;

				ball2.setLayoutParams(layoutParams2);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball3) {

			ImageView ball3 = (ImageView) findViewById(R.id.ball3);
			layoutParams3 = (LayoutParams) ball3.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams3.x = x_cord - 25;
				layoutParams3.y = y_cord - 75;

				ball3.setLayoutParams(layoutParams3);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball4) {

			ImageView ball4 = (ImageView) findViewById(R.id.ball4);
			layoutParams4 = (LayoutParams) ball4.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams4.x = x_cord - 25;
				layoutParams4.y = y_cord - 75;

				ball4.setLayoutParams(layoutParams4);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball5) {

			ImageView ball5 = (ImageView) findViewById(R.id.ball5);
			layoutParams5 = (LayoutParams) ball5.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams5.x = x_cord - 25;
				layoutParams5.y = y_cord - 75;

				ball5.setLayoutParams(layoutParams5);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball6) {

			ImageView ball6 = (ImageView) findViewById(R.id.ball6);
			layoutParams6 = (LayoutParams) ball6.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams6.x = x_cord - 25;
				layoutParams6.y = y_cord - 75;

				ball6.setLayoutParams(layoutParams6);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball7) {

			ImageView ball7 = (ImageView) findViewById(R.id.ball7);
			layoutParams7 = (LayoutParams) ball7.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams7.x = x_cord - 25;
				layoutParams7.y = y_cord - 75;

				ball7.setLayoutParams(layoutParams7);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball8) {

			ImageView ball8 = (ImageView) findViewById(R.id.ball8);
			layoutParams8 = (LayoutParams) ball8.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams8.x = x_cord - 25;
				layoutParams8.y = y_cord - 75;

				ball8.setLayoutParams(layoutParams8);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball9) {

			ImageView ball9 = (ImageView) findViewById(R.id.ball9);
			layoutParams9 = (LayoutParams) ball9.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams9.x = x_cord - 25;
				layoutParams9.y = y_cord - 75;

				ball9.setLayoutParams(layoutParams9);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball10) {

			ImageView ball10 = (ImageView) findViewById(R.id.ball10);
			layoutParams10 = (LayoutParams) ball10.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams10.x = x_cord - 25;
				layoutParams10.y = y_cord - 75;

				ball10.setLayoutParams(layoutParams10);

				break;
			default:
				break;
			}
		}

		if (v.getId() == R.id.ball11) {

			ImageView ball11 = (ImageView) findViewById(R.id.ball11);
			layoutParams11 = (LayoutParams) ball11.getLayoutParams();
			switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_UP:
				break;
			case MotionEvent.ACTION_MOVE:
				int x_cord = (int) event.getRawX();
				int y_cord = (int) event.getRawY();

				if (x_cord > windowwidth) {
					x_cord = windowwidth;
				}
				if (y_cord > windowheight) {
					y_cord = windowheight;
				}

				layoutParams11.x = x_cord - 25;
				layoutParams11.y = y_cord - 75;

				ball11.setLayoutParams(layoutParams11);

				break;
			default:
				break;
			}
		}

		v.invalidate();
		return true;
	}

}