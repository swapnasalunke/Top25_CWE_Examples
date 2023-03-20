class User:

    def __init__(self, user, resource):
        self.name = user
        self.permission = resource

    def username(self):
        return self.name;


def operation(user, resource):
    if user.username() in resource:
        print("safe Operation::", resource)


user = User("name", ["read:file1", "write:file2"]);
operation(user, "write:file1");
