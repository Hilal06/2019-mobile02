package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	Random acakAngka = new Random();
	private int angka;
	private EditText numInput;

	public void setAngka(int angka) {
		this.angka = angka;
	}

	public int getAngka() {
		return angka;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numInput = findViewById(R.id.number_input);
		this.initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		int n = 1 + acakAngka.nextInt(100);
		this.setAngka(n);
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int n = Integer.valueOf(numInput.getText().toString());
		if(n == this.getAngka()){
			Toast.makeText(this, R.string.right_answer, Toast.LENGTH_SHORT).show();
		} else if( n > this.getAngka()) {
			Toast.makeText(this, R.string.gt_answer, Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, R.string.lt_answer, Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numInput.setText("");
		this.initRandomNumber();
	}
}
