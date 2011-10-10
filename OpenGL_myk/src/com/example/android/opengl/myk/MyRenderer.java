package com.example.android.opengl.myk;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLU;
import android.opengl.GLSurfaceView.Renderer;

public class MyRenderer implements Renderer {

	MyCube cube = new MyCube();

	@Override
	public void onDrawFrame(GL10 gl) {

		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);

		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glTranslatef(0, 0, -3f);
		
	    gl.glRotatef(30f, 1, 1, 0); // xとy 軸の回りに 30 度だけ回転させる
		cube.draw(gl);

	}

	/**
	 * landscape と portraid の切り替え (縦向き、横向き切り替え) のときに呼ばれる
	 */
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
	    gl.glViewport(0, 0, width, height);
	    
	    gl.glMatrixMode(GL10.GL_PROJECTION);
	    gl.glLoadIdentity();    
	    GLU.gluPerspective(gl, 45f,(float) width / height, 1f, 50f);
	}

	/**
	 * 初期化時
	 */
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
	    gl.glEnable(GL10.GL_DEPTH_TEST);
	    
	    gl.glEnable(GL10.GL_LIGHTING);
	    gl.glEnable(GL10.GL_LIGHT0);
	    
	    gl.glDepthFunc(GL10.GL_LEQUAL);
	    

	}

}
