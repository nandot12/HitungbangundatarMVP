package com.udacoding.hitungbangundatarmvp.presenter

import com.udacoding.hitungbangundatarmvp.model.Hasil

class HitungPresenter (val luasView: LuasView){


    fun luas (a : String ,b : String){


        if(a.isEmpty() || b.isEmpty()){

            luasView.empty("tidak boleh kosong")

        }
        else{

            val x = a.toDouble()
            val y = b.toDouble()

            val total = x.div(2).times(y)

            val hasil = Hasil()
            hasil.textHasil = "$total"

            luasView.success(hasil)
        }

    }
}