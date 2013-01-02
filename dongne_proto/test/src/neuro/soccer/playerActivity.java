package neuro.soccer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class playerActivity extends Activity {

	// ///////////////////

	TextView p1pos;
	TextView p1num;
	TextView p1name;

	TextView p2pos;
	TextView p2num;
	TextView p2name;

	TextView p3pos;
	TextView p3num;
	TextView p3name;

	TextView p4pos;
	TextView p4num;
	TextView p4name;

	TextView p5pos;
	TextView p5num;
	TextView p5name;

	TextView p6pos;
	TextView p6num;
	TextView p6name;

	TextView p7pos;
	TextView p7num;
	TextView p7name;

	TextView p8pos;
	TextView p8num;
	TextView p8name;

	TextView p9pos;
	TextView p9num;
	TextView p9name;

	TextView p10pos;
	TextView p10num;
	TextView p10name;

	TextView p11pos;
	TextView p11num;
	TextView p11name;

	TextView p12pos;
	TextView p12num;
	TextView p12name;

	TextView p13pos;
	TextView p13num;
	TextView p13name;

	TextView p14pos;
	TextView p14num;
	TextView p14name;

	TextView p15pos;
	TextView p15num;
	TextView p15name;

	TextView p16pos;
	TextView p16num;
	TextView p16name;

	TextView p17pos;
	TextView p17num;
	TextView p17name;

	TextView p18pos;
	TextView p18num;
	TextView p18name;

	// ///////////////////

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.player);

		// //////////////////

		p1pos = (TextView) findViewById(R.id.position1);
		p1num = (TextView) findViewById(R.id.num1);
		p1name = (TextView) findViewById(R.id.name1);

		p2pos = (TextView) findViewById(R.id.position2);
		p2num = (TextView) findViewById(R.id.num2);
		p2name = (TextView) findViewById(R.id.name2);

		p3pos = (TextView) findViewById(R.id.position3);
		p3num = (TextView) findViewById(R.id.num3);
		p3name = (TextView) findViewById(R.id.name3);

		p4pos = (TextView) findViewById(R.id.position4);
		p4num = (TextView) findViewById(R.id.num4);
		p4name = (TextView) findViewById(R.id.name4);

		p5pos = (TextView) findViewById(R.id.position5);
		p5num = (TextView) findViewById(R.id.num5);
		p5name = (TextView) findViewById(R.id.name5);

		p6pos = (TextView) findViewById(R.id.position6);
		p6num = (TextView) findViewById(R.id.num6);
		p6name = (TextView) findViewById(R.id.name6);

		p7pos = (TextView) findViewById(R.id.position7);
		p7num = (TextView) findViewById(R.id.num7);
		p7name = (TextView) findViewById(R.id.name7);

		p8pos = (TextView) findViewById(R.id.position8);
		p8num = (TextView) findViewById(R.id.num8);
		p8name = (TextView) findViewById(R.id.name8);

		p9pos = (TextView) findViewById(R.id.position9);
		p9num = (TextView) findViewById(R.id.num9);
		p9name = (TextView) findViewById(R.id.name9);

		p10pos = (TextView) findViewById(R.id.position10);
		p10num = (TextView) findViewById(R.id.num10);
		p10name = (TextView) findViewById(R.id.name10);

		p11pos = (TextView) findViewById(R.id.position11);
		p11num = (TextView) findViewById(R.id.num11);
		p11name = (TextView) findViewById(R.id.name11);

		p12pos = (TextView) findViewById(R.id.position12);
		p12num = (TextView) findViewById(R.id.num12);
		p12name = (TextView) findViewById(R.id.name12);

		p13pos = (TextView) findViewById(R.id.position13);
		p13num = (TextView) findViewById(R.id.num13);
		p13name = (TextView) findViewById(R.id.name13);

		p14pos = (TextView) findViewById(R.id.position14);
		p14num = (TextView) findViewById(R.id.num14);
		p14name = (TextView) findViewById(R.id.name14);

		p15pos = (TextView) findViewById(R.id.position15);
		p15num = (TextView) findViewById(R.id.num15);
		p15name = (TextView) findViewById(R.id.name15);

		p16pos = (TextView) findViewById(R.id.position16);
		p16num = (TextView) findViewById(R.id.num16);
		p16name = (TextView) findViewById(R.id.name16);

		p17pos = (TextView) findViewById(R.id.position17);
		p17num = (TextView) findViewById(R.id.num17);
		p17name = (TextView) findViewById(R.id.name17);

		p18pos = (TextView) findViewById(R.id.position18);
		p18num = (TextView) findViewById(R.id.num18);
		p18name = (TextView) findViewById(R.id.name18);

		// /////////////////

		SharedPreferences pref = getSharedPreferences("PrefTest", 0);

		// /////////////////

		String Position1 = pref.getString("Position1", "포지션");
		p1pos.setText(Position1);

		int Num1 = pref.getInt("Num1", 00);
		p1num.setText("" + Num1);

		String Name1 = pref.getString("Name1", "이름");
		p1name.setText(Name1);

		String Position2 = pref.getString("Position2", "포지션");
		p2pos.setText(Position2);

		int Num2 = pref.getInt("Num2", 00);
		p2num.setText("" + Num2);

		String Name2 = pref.getString("Name2", "이름");
		p2name.setText(Name2);

		String Position3 = pref.getString("Position3", "포지션");
		p3pos.setText(Position3);

		int Num3 = pref.getInt("Num3", 00);
		p3num.setText("" + Num3);

		String Name3 = pref.getString("Name3", "이름");
		p3name.setText(Name3);

		String Position4 = pref.getString("Position4", "포지션");
		p4pos.setText(Position4);

		int Num4 = pref.getInt("Num4", 00);
		p4num.setText("" + Num4);

		String Name4 = pref.getString("Name4", "이름");
		p4name.setText(Name4);

		String Position5 = pref.getString("Position5", "포지션");
		p5pos.setText(Position5);

		int Num5 = pref.getInt("Num5", 00);
		p5num.setText("" + Num5);

		String Name5 = pref.getString("Name5", "이름");
		p5name.setText(Name5);

		String Position6 = pref.getString("Position6", "포지션");
		p6pos.setText(Position6);

		int Num6 = pref.getInt("Num6", 00);
		p6num.setText("" + Num6);

		String Name6 = pref.getString("Name6", "이름");
		p6name.setText(Name6);

		String Position7 = pref.getString("Position7", "포지션");
		p7pos.setText(Position7);

		int Num7 = pref.getInt("Num7", 00);
		p7num.setText("" + Num7);

		String Name7 = pref.getString("Name7", "이름");
		p7name.setText(Name7);

		String Position8 = pref.getString("Position8", "포지션");
		p8pos.setText(Position8);

		int Num8 = pref.getInt("Num8", 00);
		p8num.setText("" + Num8);

		String Name8 = pref.getString("Name8", "이름");
		p8name.setText(Name8);

		String Position9 = pref.getString("Position9", "포지션");
		p9pos.setText(Position9);

		int Num9 = pref.getInt("Num9", 00);
		p9num.setText("" + Num9);

		String Name9 = pref.getString("Name9", "이름");
		p9name.setText(Name9);

		String Position10 = pref.getString("Position10", "포지션");
		p10pos.setText(Position10);

		int Num10 = pref.getInt("Num10", 00);
		p10num.setText("" + Num10);

		String Name10 = pref.getString("Name10", "이름");
		p10name.setText(Name10);

		String Position11 = pref.getString("Position11", "포지션");
		p11pos.setText(Position11);

		int Num11 = pref.getInt("Num11", 00);
		p11num.setText("" + Num11);

		String Name11 = pref.getString("Name11", "이름");
		p11name.setText(Name11);

		String Position12 = pref.getString("Position12", "포지션");
		p12pos.setText(Position12);

		int Num12 = pref.getInt("Num12", 00);
		p12num.setText("" + Num12);

		String Name12 = pref.getString("Name12", "이름");
		p12name.setText(Name12);

		String Position13 = pref.getString("Position13", "포지션");
		p13pos.setText(Position13);

		int Num13 = pref.getInt("Num13", 00);
		p13num.setText("" + Num13);

		String Name13 = pref.getString("Name13", "이름");
		p13name.setText(Name13);

		String Position14 = pref.getString("Position14", "포지션");
		p14pos.setText(Position14);

		int Num14 = pref.getInt("Num14", 00);
		p14num.setText("" + Num14);

		String Name14 = pref.getString("Name14", "이름");
		p14name.setText(Name14);

		String Position15 = pref.getString("Position15", "포지션");
		p15pos.setText(Position15);

		int Num15 = pref.getInt("Num15", 00);
		p15num.setText("" + Num15);

		String Name15 = pref.getString("Name15", "이름");
		p15name.setText(Name15);

		String Position16 = pref.getString("Position16", "포지션");
		p16pos.setText(Position16);

		int Num16 = pref.getInt("Num16", 00);
		p16num.setText("" + Num16);

		String Name16 = pref.getString("Name16", "이름");
		p16name.setText(Name16);

		String Position17 = pref.getString("Position17", "포지션");
		p17pos.setText(Position17);

		int Num17 = pref.getInt("Num17", 00);
		p17num.setText("" + Num17);

		String Name17 = pref.getString("Name17", "이름");
		p17name.setText(Name17);

		String Position18 = pref.getString("Position18", "포지션");
		p18pos.setText(Position18);

		int Num18 = pref.getInt("Num18", 00);
		p18num.setText("" + Num18);

		String Name18 = pref.getString("Name18", "이름");
		p18name.setText(Name18);

		// //////////////////

	}

	public void onPause() {

		super.onPause();

		SharedPreferences pref = getSharedPreferences("PrefTest", 0);
		SharedPreferences.Editor edit = pref.edit();

		// ////////////////

		// 1

		String Position1 = p1pos.getText().toString();

		int Num1 = 0;
		try {
			Num1 = Integer.parseInt(p1num.getText().toString());

		} catch (Exception e) {
		}

		String Name1 = p1name.getText().toString();

		edit.putString("Position1", Position1);
		edit.putInt("Num1", Num1);
		edit.putString("Name1", Name1);

		// 2
		String Position2 = p2pos.getText().toString();

		int Num2 = 0;
		try {
			Num2 = Integer.parseInt(p2num.getText().toString());

		} catch (Exception e) {
		}

		String Name2 = p2name.getText().toString();

		edit.putString("Position2", Position2);
		edit.putInt("Num2", Num2);
		edit.putString("Name2", Name2);

		// 3

		String Position3 = p3pos.getText().toString();

		int Num3 = 0;
		try {
			Num3 = Integer.parseInt(p3num.getText().toString());

		} catch (Exception e) {
		}

		String Name3 = p3name.getText().toString();

		edit.putString("Position3", Position3);
		edit.putInt("Num3", Num3);
		edit.putString("Name3", Name3);

		// 4

		String Position4 = p4pos.getText().toString();

		int Num4 = 0;
		try {
			Num4 = Integer.parseInt(p4num.getText().toString());

		} catch (Exception e) {
		}

		String Name4 = p4name.getText().toString();

		edit.putString("Position4", Position4);
		edit.putInt("Num4", Num4);
		edit.putString("Name4", Name4);

		// 5
		String Position5 = p5pos.getText().toString();

		int Num5 = 0;
		try {
			Num5 = Integer.parseInt(p5num.getText().toString());

		} catch (Exception e) {
		}

		String Name5 = p5name.getText().toString();

		edit.putString("Position5", Position5);
		edit.putInt("Num5", Num5);
		edit.putString("Name5", Name5);

		// 6

		String Position6 = p6pos.getText().toString();

		int Num6 = 0;
		try {
			Num6 = Integer.parseInt(p6num.getText().toString());

		} catch (Exception e) {
		}

		String Name6 = p6name.getText().toString();

		edit.putString("Position6", Position6);
		edit.putInt("Num6", Num6);
		edit.putString("Name6", Name6);

		// 7

		String Position7 = p7pos.getText().toString();

		int Num7 = 0;
		try {
			Num7 = Integer.parseInt(p7num.getText().toString());

		} catch (Exception e) {
		}

		String Name7 = p7name.getText().toString();

		edit.putString("Position7", Position7);
		edit.putInt("Num7", Num7);
		edit.putString("Name7", Name7);

		// 8
		String Position8 = p8pos.getText().toString();

		int Num8 = 0;
		try {
			Num8 = Integer.parseInt(p8num.getText().toString());

		} catch (Exception e) {
		}

		String Name8 = p8name.getText().toString();

		edit.putString("Position8", Position8);
		edit.putInt("Num8", Num8);
		edit.putString("Name8", Name8);

		// 9

		String Position9 = p9pos.getText().toString();

		int Num9 = 0;
		try {
			Num9 = Integer.parseInt(p9num.getText().toString());

		} catch (Exception e) {
		}

		String Name9 = p9name.getText().toString();

		edit.putString("Position9", Position9);
		edit.putInt("Num9", Num9);
		edit.putString("Name9", Name9);

		// 10

		String Position10 = p10pos.getText().toString();

		int Num10 = 0;
		try {
			Num10 = Integer.parseInt(p10num.getText().toString());

		} catch (Exception e) {
		}

		String Name10 = p10name.getText().toString();

		edit.putString("Position10", Position10);
		edit.putInt("Num10", Num10);
		edit.putString("Name10", Name10);

		// 11
		String Position11 = p11pos.getText().toString();

		int Num11 = 0;
		try {
			Num11 = Integer.parseInt(p11num.getText().toString());

		} catch (Exception e) {
		}

		String Name11 = p11name.getText().toString();

		edit.putString("Position11", Position11);
		edit.putInt("Num11", Num11);
		edit.putString("Name11", Name11);

		// 12

		String Position12 = p12pos.getText().toString();

		int Num12 = 0;
		try {
			Num12 = Integer.parseInt(p12num.getText().toString());

		} catch (Exception e) {
		}

		String Name12 = p12name.getText().toString();

		edit.putString("Position12", Position12);
		edit.putInt("Num12", Num12);
		edit.putString("Name12", Name12);

		// 13

		String Position13 = p13pos.getText().toString();

		int Num13 = 0;
		try {
			Num13 = Integer.parseInt(p13num.getText().toString());

		} catch (Exception e) {
		}

		String Name13 = p13name.getText().toString();

		edit.putString("Position13", Position13);
		edit.putInt("Num13", Num13);
		edit.putString("Name13", Name13);

		// 14
		String Position14 = p14pos.getText().toString();

		int Num14 = 0;
		try {
			Num14 = Integer.parseInt(p14num.getText().toString());

		} catch (Exception e) {
		}

		String Name14 = p14name.getText().toString();

		edit.putString("Position14", Position14);
		edit.putInt("Num14", Num14);
		edit.putString("Name14", Name14);

		// 15

		String Position15 = p15pos.getText().toString();

		int Num15 = 0;
		try {
			Num15 = Integer.parseInt(p15num.getText().toString());

		} catch (Exception e) {
		}

		String Name15 = p15name.getText().toString();

		edit.putString("Position15", Position15);
		edit.putInt("Num15", Num15);
		edit.putString("Name15", Name15);

		// 16

		String Position16 = p16pos.getText().toString();

		int Num16 = 0;
		try {
			Num16 = Integer.parseInt(p16num.getText().toString());

		} catch (Exception e) {
		}

		String Name16 = p16name.getText().toString();

		edit.putString("Position16", Position16);
		edit.putInt("Num16", Num16);
		edit.putString("Name16", Name16);

		// 17

		String Position17 = p17pos.getText().toString();

		int Num17 = 0;
		try {
			Num17 = Integer.parseInt(p17num.getText().toString());

		} catch (Exception e) {
		}

		String Name17 = p17name.getText().toString();

		edit.putString("Position17", Position17);
		edit.putInt("Num17", Num17);
		edit.putString("Name17", Name17);

		// 18

		String Position18 = p18pos.getText().toString();

		int Num18 = 0;
		try {
			Num18 = Integer.parseInt(p18num.getText().toString());

		} catch (Exception e) {
		}

		String Name18 = p18name.getText().toString();

		edit.putString("Position18", Position18);
		edit.putInt("Num18", Num18);
		edit.putString("Name18", Name18);

		// /////////////////

		edit.commit();

	}

}