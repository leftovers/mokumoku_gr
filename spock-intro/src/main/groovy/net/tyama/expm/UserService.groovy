package net.tyama.expm

class UserService {

    Collection<String> users

    int count() {
        users ? users.size() : 0
    }

}
