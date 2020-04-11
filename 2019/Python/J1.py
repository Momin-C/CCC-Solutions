A3 = int(input())
A2 = int(input())
A1 = int(input())

B3 = int(input())
B2 = int(input())
B1 = int(input())

if (A3*3 + A2*2 + A1*1) > (B3*3 + B2*2 + B1*1):
    print ("A")
elif (A3*3 + A2*2 + A1*1) < (B3*3 + B2*2 + B1*1):
    print ("B")
else:
    print ("T")
