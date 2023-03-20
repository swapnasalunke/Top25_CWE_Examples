class User:
    def __init__(self, user, resource):
        self.name = user
        self.permission = resource


def operation(user, resource):
    print("Unsafe Operation::", resource)


user = User("name",["read:file1", "write:file2"]);
operation(user, "write:file1");
