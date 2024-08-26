package com.example.havagas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.havagas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)





        amb.btnLimpar.setOnClickListener {
            amb.nomeEt.text.clear()
            amb.emailEt.text.clear()
            amb.emailCb.isChecked=false
            amb.telefoneEt.text.clear()
            amb.residencialRd.isChecked=false
            amb.comercialRd.isChecked=false
            amb.celularCb.isChecked=false
            amb.masculinoRd.isChecked=false
            amb.femininoRd.isChecked=false
            amb.dataEt.text.clear()
            amb.formacaoSp.setSelection(0)
            amb.anoFormacaoEt.text.clear()
            amb.anoConclusaoEt.text.clear()
            amb.instituicaoEt.text.clear()
            amb.tituloMonografiaEt.text.clear()
            amb.orientadorEt.text.clear()
            amb.vagasDeInteresseEt.text.clear()
        }

    }
}