package neuro.soccer;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

//import android.util.Log;

public class teamActivity extends PreferenceActivity implements
		Preference.OnPreferenceChangeListener {

	// ///////

	private ListPreference team1;
	private ListPreference team2;
	private ListPreference team3;
	private ListPreference team4;
	private ListPreference team5;
	private ListPreference team6;
	private ListPreference team7;
	private ListPreference team8;
	private ListPreference team9;
	private ListPreference team10;
	private ListPreference team11;
	private ListPreference team12;
	private ListPreference team13;

	// //////

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.team);

		// ///////

		team1 = (ListPreference) findPreference("keyList1");
		team1.setOnPreferenceChangeListener(this);

		team2 = (ListPreference) findPreference("keyList2");
		team2.setOnPreferenceChangeListener(this);

		team3 = (ListPreference) findPreference("keyList3");
		team3.setOnPreferenceChangeListener(this);

		team4 = (ListPreference) findPreference("keyList4");
		team4.setOnPreferenceChangeListener(this);

		team5 = (ListPreference) findPreference("keyList5");
		team5.setOnPreferenceChangeListener(this);

		team6 = (ListPreference) findPreference("keyList6");
		team6.setOnPreferenceChangeListener(this);

		team7 = (ListPreference) findPreference("keyList7");
		team7.setOnPreferenceChangeListener(this);

		team8 = (ListPreference) findPreference("keyList8");
		team8.setOnPreferenceChangeListener(this);

		team9 = (ListPreference) findPreference("keyList9");
		team9.setOnPreferenceChangeListener(this);

		team10 = (ListPreference) findPreference("keyList10");
		team10.setOnPreferenceChangeListener(this);

		team11 = (ListPreference) findPreference("keyList11");
		team11.setOnPreferenceChangeListener(this);

		team12 = (ListPreference) findPreference("keyList12");
		team12.setOnPreferenceChangeListener(this);

		team13 = (ListPreference) findPreference("keyList13");
		team13.setOnPreferenceChangeListener(this);

		// //////
	}

	public boolean onPreferenceChange(Preference preference, Object objValue) {

		if (preference == team1) {

			team1.setSummary(objValue.toString());

			return true;
		}

		if (preference == team2) {

			team2.setSummary(objValue.toString());

			return true;
		}

		if (preference == team3) {

			team3.setSummary(objValue.toString());

			return true;
		}

		if (preference == team4) {

			team4.setSummary(objValue.toString());

			return true;
		}

		if (preference == team5) {

			team5.setSummary(objValue.toString());

			return true;
		}

		if (preference == team6) {

			team6.setSummary(objValue.toString());

			return true;
		}

		if (preference == team7) {

			team7.setSummary(objValue.toString());

			return true;
		}

		if (preference == team8) {

			team8.setSummary(objValue.toString());

			return true;
		}

		if (preference == team9) {

			team9.setSummary(objValue.toString());

			return true;
		}

		if (preference == team10) {

			team10.setSummary(objValue.toString());

			return true;
		}

		if (preference == team11) {

			team11.setSummary(objValue.toString());

			return true;
		}

		if (preference == team12) {

			team12.setSummary(objValue.toString());

			return true;
		}

		if (preference == team13) {

			team13.setSummary(objValue.toString());

			return true;
		}

		return false;
	}

}
	
		
	