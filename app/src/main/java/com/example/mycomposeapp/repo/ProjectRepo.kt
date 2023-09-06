package com.example.mycomposeapp.repo

import com.example.mycomposeapp.RetrofitManager
import com.example.mycomposeapp.api.ProjectApi

/**
 * Project Name: MyComposeApp
 * ClassName:    ProjectRepo
 *
 * Description: TODO.
 *
 * @author  zjl
 * @date    2023年09月06日 16:35
 *
 * Copyright (c) 2023年, 4399 Network CO.ltd. All Rights Reserved.
 */
class ProjectRepo {
    private val mService: ProjectApi

    init {
        mService = RetrofitManager.instance.getRetrofit("https://www.wanandroid.com/")
            .create(ProjectApi::class.java)
    }

    suspend fun getHomeArticle(page: Int) {
        mService.getHomeArticle()
    }
}