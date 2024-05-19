import java.util.*

class Registration {
    private var _email = "example@gmail.com"
    private var _password = ""
    fun setPassword(password: String){
        if((password.length < 6)) println("Длина пароля не соотвтствует требованиям!")
        else _password = password
    }
    fun getEmail(): String {
        return _email.uppercase(Locale.getDefault())
    }
}