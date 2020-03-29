P = int(input())
N = int(input())
R = int(input())
D,I = 0,0
while I<=P:
    I = I + N*R**D
    D+=1
print (D-1)
