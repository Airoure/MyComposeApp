package com.example.mycomposeapp.api

import com.example.mycomposeapp.model.HttpResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Project Name: MyComposeApp
 * ClassName:    ProjectApi
 *
 * Description: TODO.
 *
 * @author  zjl
 * @date    2023年09月06日 16:23
 *
 * Copyright (c) 2023年, 4399 Network CO.ltd. All Rights Reserved.
 */
interface ProjectApi {
    @GET("article/list/{page}")
    suspend fun getHomeArticle(@Path("page") page: Int = 0): HttpResponse<List<>>
}