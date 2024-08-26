package com.example.havagas

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AlertDialog
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
            var formulario = Formulario(amb.nomeEt.text.toString(), amb.emailEt.text.toString(),
                amb.emailCb.isChecked, amb.telefoneEt.text.toString(), telefoneTipo,
                amb.celularCb.isChecked, amb.cellphoneEt.text.toString(), sexo,
                amb.dataEt.text.toString(), amb.formacaoSp.selectedItem.toString(),
                amb.anoFormacaoEt.text.toString(), amb.anoConclusaoEt.text.toString(),
                amb.instituicaoEt.text.toString(), amb.tituloMonografiaEt.text.toString(),
                amb.orientadorEt.text.toString(), amb.vagasDeInteresseEt.text.toString())

            AlertDialog.Builder(this)
                .setTitle("Dados preenchidos")
                .setMessage(formulario.toString())
                .setPositiveButton("Fechar", null)
                .show()
        }

        amb.celularCb.setOnCheckedChangeListener { _ , isChecked ->
            amb.cellphoneEt.visibility = if (isChecked) View.VISIBLE else View.GONE
        }

        amb.formacaoSp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when (position) {
                    0,1 -> {amb.fundamentalAoMedioLt.visibility = View.VISIBLE
                            amb.graduacaoAEspecializacaoLt.visibility = View.GONE
                            amb.mestradoAoDoutoradoLt.visibility = View.GONE}
                    2,3 -> {amb.graduacaoAEspecializacaoLt.visibility = View.VISIBLE
                            amb.fundamentalAoMedioLt.visibility = View.GONE
                            amb.mestradoAoDoutoradoLt.visibility = View.GONE}
                    4,5 -> {amb.mestradoAoDoutoradoLt.visibility = View.VISIBLE
                            amb.graduacaoAEspecializacaoLt.visibility = View.VISIBLE
                            amb.fundamentalAoMedioLt.visibility = View.GONE}
                    else -> {amb.fundamentalAoMedioLt.visibility = View.GONE
                        amb.graduacaoAEspecializacaoLt.visibility = View.GONE
                        amb.mestradoAoDoutoradoLt.visibility = View.GONE
                    }
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                amb.anoFormacaoEt.visibility = View.GONE
                amb.anoConclusaoEt.visibility = View.GONE
                amb.instituicaoEt.visibility = View.GONE
                amb.tituloMonografiaEt.visibility = View.GONE
                amb.orientadorEt.visibility = View.GONE
            }
        }

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