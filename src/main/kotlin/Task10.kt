

fun task10(): String {

    return """
         OUTPUT "Write your new account with your email address"
         INPUT email
         OUTPUT "Write your Passwords with 6 characters "
         INPUT pass 
         OUTPUT "Write your Passwords again "
         INPUT pass2 
            IF pass different pass 2 THEN
                OUTPUT "The Passwords are not the same.Try Create you account again, Thanks "   
            ELSE  
            INPUT email
            INPUT pass
            OUTPUT "You created your account with success"
    """
}
