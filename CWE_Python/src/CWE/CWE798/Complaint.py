import os

username = os.getenv("userName")
password = os.getenv("password")
userNamePassword = "user=%s&password=%s" % (username, password)
