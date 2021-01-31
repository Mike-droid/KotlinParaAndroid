package com.platzi.conf.network

import java.lang.Exception

interface Callback<T> { //con T le decimos que puede ser un tipo de dato dinstinto cada vez
    fun onSuccess(result: T?)

    fun onFailed(exception: Exception)
}