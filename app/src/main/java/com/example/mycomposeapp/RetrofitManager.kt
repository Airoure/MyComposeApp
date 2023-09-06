package com.example.mycomposeapp

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Project Name: MyComposeApp
 * ClassName:    RetorfitManager
 *
 * Description: TODO.
 *
 * @author  zjl
 * @date    2023年09月06日 16:12
 *
 * Copyright (c) 2023年, 4399 Network CO.ltd. All Rights Reserved.
 */
class RetrofitManager {

    private val mOkHttpClient: OkHttpClient

    companion object {
        private const val TIMEOUT = 10L

        @JvmStatic
        val instance: RetrofitManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            RetrofitManager()
        }
    }

    init {
        mOkHttpClient = OkHttpClient.Builder().addInterceptor { chain ->
            val builder = chain.request().newBuilder()
            chain.proceed(builder.build())
        }.connectTimeout(TIMEOUT, TimeUnit.SECONDS).readTimeout(TIMEOUT, TimeUnit.SECONDS).build()
    }

    /**
     * 获取Retrofit
     */
    fun getRetrofit(baseUrl: String, okHttpClient: OkHttpClient? = null): Retrofit {
        val builder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient ?: mOkHttpClient)
        return builder.build()
    }
}