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
    
    
    //�÷��̾� ��ư Ŭ�� �̺�Ʈ ó��
    public void playerClick(View v){
    	Intent intent = new Intent(this, playerActivity.class);
    	startActivity(intent);
    }

    //�������� ��ư Ŭ�� �̺�Ʈ ó��
    public void taticsClick(View v){
    	Intent intent = new Intent(this, taticsActivity.class);
    	startActivity(intent);
    }
    
    //�� ��ư Ŭ�� �̺�Ʈ ó��
    public void teamClick(View v){
    	Intent intent = new Intent(this, teamActivity.class);
    	startActivity(intent);
    }
    
   
    //�޸� ��ư Ŭ�� �̺�Ʈ ó��
    public void memoClick(View v){
    	Intent intent = new Intent(this, memoActivity.class);
    	startActivity(intent);
    }
   
    
    
}