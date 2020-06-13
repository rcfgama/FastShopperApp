package com.example.fastshopper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditarActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        this.mViewHolder.buttonHome = findViewById(R.id.button_home);
        this.mViewHolder.buttonCompras = findViewById(R.id.button_compras);

        this.mViewHolder.buttonHome.setOnClickListener(this);
        this.mViewHolder.buttonCompras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button_compras) {
            Intent intent = new Intent(this, ComprasActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        Button buttonHome;
        Button buttonCompras;
    }
}
