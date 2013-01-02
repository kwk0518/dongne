package neuro.soccer;

import android.app.Activity;
import android.os.Bundle;


import android.content.Intent;

import android.view.View;
import android.view.Window;


public class HomeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
    }
    
    
    //플레이어 버튼 클릭 이벤트 처리
    public void playerClick(View v){
    	Intent intent = new Intent(this, playerActivity.class);
    	startActivity(intent);
    }

    //선수관리 버튼 클릭 이벤트 처리
    public void taticsClick(View v){
    	Intent intent = new Intent(this, taticsActivity.class);
    	startActivity(intent);
    }
    
    //팀 버튼 클릭 이벤트 처리
    public void teamClick(View v){
    	Intent intent = new Intent(this, teamActivity.class);
    	startActivity(intent);
    }
    
   
    //메모 버튼 클릭 이벤트 처리
    public void memoClick(View v){
    	Intent intent = new Intent(this, memoActivity.class);
    	startActivity(intent);
    }
   
    
    
}