package com.example.android.opengl.myk;

import android.app.Activity;
import android.os.Bundle;

public class OpenGL0 extends Activity {
	 MyGLView myGLView;
	  
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    myGLView = new MyGLView(this);
	    setContentView(myGLView);
	  }
	  
	  @Override
	  protected void onResume(){
	    super.onResume();
	    myGLView.onResume();
	  }
	  
	  @Override
	  protected void onPause(){
	    super.onPause();
	    myGLView.onPause();
	  }
	
}
