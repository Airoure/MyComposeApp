package com.example.mycomposeapp.srceen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapp.R

/**
 * Project Name: MyComposeApp
 * ClassName:    MainScreen
 *
 * Description: TODO.
 *
 * @author  zjl
 * @date    2023年09月06日 14:04
 *
 * Copyright (c) 2023年, 4399 Network CO.ltd. All Rights Reserved.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(topBar = { PlayHistoryTopBar() }, bottomBar = { }) {

    }
}

@Composable
fun PlayHistoryTopBar() {
    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.back_arrow),
            modifier = Modifier.padding(start = 10.dp),
            contentDescription = ""
        )
        Text(text = "播放历史", fontSize = 18.sp, modifier = Modifier.padding(start = 4.dp))
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.delete_button),
            modifier = Modifier
                .padding(end = 10.dp),
            contentDescription = ""
        )

    }
}