#      CWE-20: Improper Input Validation

def quantity():
    return -1           # negative value causes user account credited instead of debited


def charge(total):
    bal = 100
    return bal - total


price = 20
quantity = quantity()
total = price * quantity
print(charge(total))
