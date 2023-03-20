#   CWE-476	NULL Pointer Dereference Solution

class NonComplaint:
    def display(self):
        print("Within Display!")


obj = NonComplaint()
obj.display()

obj = None
if obj is not None:
    print(obj.display())
else:
    print("Object is None")
