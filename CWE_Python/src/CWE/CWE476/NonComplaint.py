# 	CWE-476	NULL Pointer Dereference

class NonComplaint:
    def display(self):
        print("Within Display!")


obj = NonComplaint()
obj.display()

obj = None
print(obj.display())
