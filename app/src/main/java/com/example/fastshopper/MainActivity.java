package com.example.fastshopper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonCompras = findViewById(R.id.button_compras);
        this.mViewHolder.buttonEditar = findViewById(R.id.button_editar);

        this.mViewHolder.buttonCompras.setOnClickListener(this);
        this.mViewHolder.buttonEditar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_compras) {
            Intent intent = new Intent(this, ComprasActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button_editar) {
            Intent intent = new Intent(this, EditarActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        Button buttonCompras;
        Button buttonEditar;
    }
}
