package com.mrhaki.blog

class UserService {

    Collection<String> users

    int count() {
        users ? users.size() : 0
    }

}
