d1,d2,d3,d4,d5 = [],[],[],[],[]
d = [3,10,12,5]

"""
d = input().split()
for i in range (len(d)):
    d[i] = int(d[i])"""

for i in range (5):
    d1.append(sum(d[:i]))
    d2.append(sum(d[1:i]))
    d3.append(sum(d[2:i]))
    d4.append(sum(d[3:i]))
    d5.append(sum(d[4:i]))

for i in range (3,-1,-1):
    d5[i] = sum(d[i:4])
    if i<=2:
        d4[i] = sum(d[i:3])
    if i<=1:
        d3[i] = sum(d[i:2])
    d2[0] = d[0]

for a,b,c,d,e in d1,d2,d3,d4,d5:
    print (a,b,c,d,e)
