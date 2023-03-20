#       CWE-287	Improper Authentication

def login(username, password):
    if username == "admin" and password == "password":
        print("Login successful")
    else:
        print("Invalid username or password")


username = input("Enter your username: ")
password = input("Enter your password: ")      # There is no check for the strength of the password or any other security measure
login(username, password)
