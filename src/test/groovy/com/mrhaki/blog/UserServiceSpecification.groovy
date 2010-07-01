package com.mrhaki.blog

import spock.lang.Specification

class UserServiceSpecification extends Specification {

    def "Return total number of users"() {
        setup: 'Create UserService instance with 2 users'
        UserService userService = new UserService(users: ['mrhaki', 'hubert'])

        expect: 'Invoke count() method'
        2 == userService.count()
    }

}
