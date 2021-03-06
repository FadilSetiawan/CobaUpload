package com.example.user.tebakgambar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class CaraMainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cara_main);
		Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
		setSupportActionBar(toolbar); // Memasang Toolbar pada Aplikasi
		getSupportActionBar().setTitle("Fadil_Setiawan_D1042151056"); // Memasang Judul pada Toolbar
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Memanggil/Memasang menu item pada toolbar dari layout menu_bar.xml
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.cara_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	//Membuat event/kejadian saat salah satu item pada toolbar di klik
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.about :
				//Kode disini akan di eksekusi saat tombol about di klik
				Toast.makeText(this, " By: Fadil", Toast.LENGTH_SHORT).show();
				break;
			case R.id.keluar:
				System.exit(0);
				break;
			default:
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
