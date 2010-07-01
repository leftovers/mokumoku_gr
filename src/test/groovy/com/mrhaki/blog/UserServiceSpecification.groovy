package com.mrhaki.blog

import spock.lang.Specification
import spock.lang.Unroll

class UserServiceSpecification extends Specification {

    @Unroll("Expect to count #expectedCount users for following list #userList")
    def "Return total number of users"() {
        setup: 'Create UserService instance with users'
        UserService userService = new UserService(users: userList)

        expect: 'Invoke count() method'
        expectedCount == userService.count()

        where:
        expectedCount   | userList
        0               | null
        0               | []
        1               | ['mrhaki']
        2               | ['mrhaki', 'hubert']
    }

}
