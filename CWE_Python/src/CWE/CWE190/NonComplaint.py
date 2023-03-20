#   CWE-190	Integer Overflow or Wraparound

def buffer_overflow():
    name = 'A' * 100
    print(name)


buffer_overflow()

#   If we were to try to create a string with an extremely large number of characters,
#   we could run out of memory and cause an overflow.
