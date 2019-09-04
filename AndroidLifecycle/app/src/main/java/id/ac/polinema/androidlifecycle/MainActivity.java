package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	// TODO: tambahkan callback onStart() di sini

	@Override
	protected void onStart() {
		super.onStart();
	}


	// TODO: tambahkan callback onStop() di sini

	@Override
	protected void onStop() {
		super.onStop();
	}


	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()

	@Override
	protected void onResume() {
		super.onResume();
	}
	@Override
	protected void onPause() {
		super.onPause();
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
