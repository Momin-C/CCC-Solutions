begin = input().split(":")
begin[0] = int(begin[0])
begin[1] = int(begin[1])
for i in range(6):
    if 7<=begin[0]<10 or 15<=begin[0]<19:
        if begin[1] == 40:
            begin[0]+=1
            begin[1] = 20
        elif begin[1] == 20:
            begin[0]+=1
            begin[1] = 0
        else:
            begin[1]+=40
    else:
        if begin[1] == 40:
            begin[0]+=1
            begin[1] = 0
        else:
            begin[1]+=20
print (begin[0],":",begin[1])
