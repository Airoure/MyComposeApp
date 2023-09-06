package com.example.mycomposeapp.model

import com.squareup.moshi.Json

/**
 * Project Name: MyComposeApp
 * ClassName:    HttpResponse
 *
 * Description: TODO.
 *
 * @author  zjl
 * @date    2023年09月06日 16:24
 *
 * Copyright (c) 2023年, 4399 Network CO.ltd. All Rights Reserved.
 */
data class HttpResponse<T>(
    @Json(name = "data")
    val data: T,
    @Json(name = "errorCode")
    val code: Int,
    @Json(name = "errorMsg")
    val message: String,
)