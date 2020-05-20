start = [1,2,0,0]
D = int(input())
patterns = 0

if D > 1440:
    times = D//1440
    D-= 1440*times
    patterns+= 62*times

for i in range(D):
    if start == [1,2,5,9]:
        start = [0,1,0,0]
    elif start == [0,9,5,9]:
        start = [1,0,0,0]
    elif start[2:] == [5,9]:
        start[1]+=1
        start[2] = 0
        start[3] = 0
    elif start[3] == 9:
        start[2]+=1
        start[3] = 0
    else:
        start[3]+=1
    if start[0] == 0:
        if (start[1] - start[2] == start[2] - start[3]):
            patterns+=1
    else:
        if (start[0] - start[1] == start[1] - start[2] == start[2] - start[3]):
            patterns+=1
print (patterns)
