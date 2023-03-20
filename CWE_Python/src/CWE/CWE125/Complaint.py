# CWE-125: Out-of-bounds Read

test_list = [1, 2, 3, 4]
index = int(input())

if index < len(test_list):
    print(test_list[index])
else:
    print("Invalid Index")
