package com.example.asdfprotoproducer

import com.example.asdfprotoproducer.java.NotificationApi
import com.example.asdfprotoproducer.java.UserApi
import com.example.asdfprotoproducer.java.UserExtendedOuterClass
import org.junit.Test

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

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun proto_user() {
        val user = getMockUser()
        val notific = user.notific
        val extUser = getMockUserExtended()

        assert(user.id == USER_ID)
        assert(user.name == "John Doe")
        assert(user.email == "john.doe@example.com")
        assert(notific.id == NOTIFICATION_ID)
        assert(notific.title == "Notification title")
        assert(notific.body == "Notification body")
        assert(extUser.userId == USER_ID)
        assert(extUser.age == 25)
        assert(extUser.height == 180)
    }
}