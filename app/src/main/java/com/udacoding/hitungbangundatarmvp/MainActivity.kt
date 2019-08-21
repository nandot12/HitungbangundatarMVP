package com.udacoding.hitungbangundatarmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.udacoding.hitungbangundatarmvp.model.Hasil
import com.udacoding.hitungbangundatarmvp.presenter.HitungPresenter
import com.udacoding.hitungbangundatarmvp.presenter.LuasView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LuasView {



    var presenter : HitungPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        presenter = HitungPresenter(this)





        hitung.setOnClickListener {

            var alas = edt1.text.toString()
            val tinggi = edt2.text.toString()

            presenter?.luas(alas,tinggi)


        }
    }

    override fun empty(x: String) {

        Toast.makeText(this,x,Toast.LENGTH_SHORT).show()
    }

    override fun success(a: Hasil) {

        Toast.makeText(this,a.textHasil,Toast.LENGTH_SHORT).show()
    }
}
