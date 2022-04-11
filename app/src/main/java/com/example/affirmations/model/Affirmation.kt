package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int, // класс который принемает в переменную stringResourceId идентификатор строки
    @DrawableRes val imageResourceId: Int
    )