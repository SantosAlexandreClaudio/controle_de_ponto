package com.nota10x.appcontroledepontonota10x.view.Formcadastro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.nota10x.appcontroledepontonota10x.R;
import com.nota10x.appcontroledepontonota10x.databinding.ActivityFormCadastroBinding;

public class FormCadastro extends AppCompatActivity {

    private lateinit var binding: ActivityFormCadastroBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binging = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}