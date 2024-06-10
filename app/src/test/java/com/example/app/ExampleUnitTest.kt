package com.example.app

import org.junit.Test

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