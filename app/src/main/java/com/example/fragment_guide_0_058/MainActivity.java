package com.example.fragment_guide_0_058;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment_guide_0_058.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
Button botoncito;
ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        botoncito=mBinding.button;

        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea una instancia del fragmento MessageFragment
                QuestionFragment fragment = new QuestionFragment();
                // Obtiene el administrador de fragmentos
                FragmentManager fragmentManager = getSupportFragmentManager();
                // Inicia una transacción de fragmento
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                // Reemplaza el contenido del contenedor con el fragmento MessageFragment
                transaction.replace(mBinding.container.getId(), fragment);
                // Opcional: añade la transacción a la pila de retroceso
                transaction.addToBackStack(null);
                // Realiza la transacción
                transaction.commit();

            }
        });
    }
}