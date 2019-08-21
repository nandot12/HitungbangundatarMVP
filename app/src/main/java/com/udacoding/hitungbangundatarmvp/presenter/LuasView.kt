package com.udacoding.hitungbangundatarmvp.presenter

import com.udacoding.hitungbangundatarmvp.model.Hasil

interface LuasView {


    fun success(a : Hasil)
    fun empty(x : String)
}