package com.example.sudoku

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        /*btnAcercaDe.setOnClickListener {
            goToAcercaDe()
        }*/
    }

    fun goToAcercaDe() {
        val intent = Intent(this, AcercaDeActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.item_configuracion -> {
                startActivity(Intent(this, AcercaDeActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun setListeners() {
        btnNuevo.setOnClickListener {
            crearNuevo()
        }
        btnAcercaDe.setOnClickListener {
            goToAcercaDe()
        }
    }
    private fun crearNuevo() {
        AlertDialog.Builder(this)
            .setTitle(R.string.titulo_nuevo)
            .setItems(R.array.dificultades, { dialoginterface, i -> startGame(i) }).show()
    }

    fun startGame(value: Int) {
        Log.d("PRUEBA", "click en " + value); // Aqui se debe iniciar un juego.
    }
}