d1,d2,d3,d4,d5 = [],[],[],[],[]
"""
d = input().split()
for i in range (len(d)):
    d[i] = int(d[i])"""
d = [3,10,12,5]
for i in range (5):
    d1.append(sum(d[:i]))
    d2.append(sum(d[1:i]))
    d3.append(sum(d[2:i]))
    d4.append(sum(d[3:i]))
    d5.append(sum(d[4:i]))

d2[0] = d[0]

d3[1] = sum(d[1:2])
d3[0] = sum(d[:2])

d4[2] = sum(d[2:3])
d4[1] = sum(d[1:3])
d4[0] = sum(d[:3])

d5[3] = sum(d[3:4])
d5[2] = sum(d[2:4])
d5[1] = sum(d[1:4])
d5[0] = sum(d[:4])

for a,b,c,d,e in d1,d2,d3,d4,d5:
    print (a,b,c,d,e)
