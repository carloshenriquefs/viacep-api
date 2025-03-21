package br.com.fiap.viacep.factory

import br.com.fiap.viacep.service.CepService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URL = "https://viacep.com.br/ws/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCepService(): CepService {
        return retrofitFactory.create(CepService::class.java)
    }

}