#   CWE-787	Out-of-bounds Write

x = [1, 2, 3]
index = int(input())

if index in range(0,len(x)):
    x[index] = 4
    print(x)
else:
    print("Invalid Index!!")

