package com.example.asdfprotoproducer

import notification.NotificationApi.Notification
import org.junit.Test

import org.junit.Assert.*
import user.UserApi
import user.UserExtendedOuterClass.UserExtended

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun proto_user() {
        val notificId = 412
        val userId = 591

        val notific = Notification.newBuilder()
            .setId(notificId)
            .setTitle("Notification title")
            .setBody("Notification body")
            .build()
        val user = UserApi.User.newBuilder()
            .setId(userId)
            .setName("John Doe")
            .setEmail("john.doe@example.com")
            .setNotific(notific)
            .build()

        val userExtended = UserExtended.newBuilder()
            .setUserId(userId)
            .setAge(25)
            .setHeight(180)

        assert(user.id == userId)
        assert(user.name == "John Doe")
        assert(user.email == "john.doe@example.com")
        assert(user.notific.id == notificId)
        assert(user.notific.title == "Notification title")
        assert(user.notific.body == "Notification body")
        assert(userExtended.userId == userId)
        assert(userExtended.age == 25)
        assert(userExtended.height == 180)
    }
}