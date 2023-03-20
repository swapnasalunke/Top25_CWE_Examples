import re
#       CWE-287	Improper Authentication

def login(username, password):
    if username == "admin" and password == "R@m@_f0rtu9e$":
        print("Login successful")
    else:
        print("Invalid username or password")


username = input("Enter your username: ")
password = input("Enter your password: ")  # There is no check for the strength of the password or any other security measure

flag = 0
while True:
    if (len(password)<=8):
        flag = -1
        break
    elif not re.search("[a-z]", password):
        flag = -1
        break
    elif not re.search("[A-Z]", password):
        flag = -1
        break
    elif not re.search("[0-9]", password):
        flag = -1
        break
    elif not re.search("[_@$]" , password):
        flag = -1
        break
    elif re.search("\s" , password):
        flag = -1
        break
    else:
        flag = 0
        login(username, password)
        break

if flag == -1:
    print("Not a Valid Password ")

