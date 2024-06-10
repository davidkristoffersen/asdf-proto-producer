package com.example.app

import notification.NotificationApi
import user.UserApi
import user.UserExtendedOuterClass

const val NOTIFICATION_ID = 412
const val USER_ID = 591

fun getMockUser(): UserApi.User {
    val notific = NotificationApi.Notification.newBuilder()
        .setId(NOTIFICATION_ID)
        .setTitle("Notification title")
        .setBody("Notification body")
        .build()
    val user = UserApi.User.newBuilder()
        .setId(USER_ID)
        .setName("John Doe")
        .setEmail("john.doe@example.com")
        .setNotific(notific)
        .build()

    return user
}

fun getMockUserExtended(): UserExtendedOuterClass.UserExtended {
    val userExtended = UserExtendedOuterClass.UserExtended.newBuilder()
        .setUserId(USER_ID)
        .setAge(25)
        .setHeight(180)
        .build()

    return userExtended
}
