L = int(input())
Num,Char = [],[]
for counter in range (L):
    text = input().split()
    Num.append(int(text[0]))
    Char.append(text[1])
for counter in range (L):
    print (Char[counter]*Num[counter])
