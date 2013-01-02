package neuro.soccer;



import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;





public class memoActivity extends Activity {
	
	
	TextView memo1;

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memo);
        
        memo1 = (TextView)findViewById(R.id.memo);
        
        SharedPreferences pref = getSharedPreferences("PrefTest", 0);
        
        String memo2 = pref.getString("memo2","");
        memo1.setText(memo2);
        
    }
    
 public void onPause(){
    	
    	super.onPause();
    	
    	SharedPreferences pref = getSharedPreferences("PrefTest", 0);
    	SharedPreferences.Editor edit = pref.edit();
    
    	String memo2 = memo1.getText().toString();
    	
    	edit.putString("memo2", memo2);
    
    	edit.commit();
    	
 }

}

