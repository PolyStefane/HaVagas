package com.example.havagas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.havagas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        var telefoneTipo  = ""
        var sexo  = ""

        amb.btnSalvar.setOnClickListener {
            telefoneTipo = if (amb.residencialRd.isChecked){
                "Residencial"
            } else {
                "Comercial"
            }
            sexo = if(amb.femininoRd.isChecked){
                "Feminino"
            } else {
                "Masculino"
            }
        }

        amb.celularCb.setOnCheckedChangeListener { _ , isChecked ->
            amb.cellphoneEt.visibility = if (isChecked) View.VISIBLE else View.GONE
        }

        var formulario = Formulario(amb.nomeEt.text.toString(), amb.emailEt.text.toString(), amb.emailCb.isChecked, amb.telefoneEt.text.toString(), telefoneTipo,
            amb.celularCb.isChecked, amb.cellphoneEt.text.toString(), sexo, amb.dataEt.text.toString(), amb.formacaoSp.selectedItem.toString(), amb.anoFormacaoEt.text.toString(), amb.anoConclusaoEt.text.toString(),
            amb.instituicaoEt.text.toString(), amb.tituloMonografiaEt.text.toString(), amb.orientadorEt.text.toString(), amb.vagasDeInteresseEt.text.toString())



        amb.btnLimpar.setOnClickListener {
            amb.nomeEt.text.clear()
            amb.emailEt.text.clear()
            amb.emailCb.isChecked=false
            amb.telefoneEt.text.clear()
            amb.residencialRd.isChecked=false
            amb.comercialRd.isChecked=false
            amb.celularCb.isChecked=false
            amb.cellphoneEt.text.clear()
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