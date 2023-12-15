package com.example.quickfixx.navigation

sealed class Screens(val route: String) {
    object WelcomePageScreen: Screens(route = "welcome_page_screen")
    object LoginScreen: Screens(route = "login_screen")
    object SignUpScreen: Screens(route = "signup_screen")
    object OTPScreen1: Screens(route = "OTP_screen1")
    object OTPScreen2: Screens(route = "OTP_screen2")
    object HomePage: Screens(route = "Home_Page")
    object ElectricianData: Screens(route = "Electrician Data")
    object Navtest: Screens(route = "Navtest")
}
