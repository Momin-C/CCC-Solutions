begin = input().split(":")
begin[0] = int(begin[0])
begin[1] = int(begin[1])
for i in range(6):
    if 7<=begin[0]<10 or 15<=begin[0]<19:
        if begin[1] == 40 and (begin[0] == 9 or begin[0] == 18):
            begin[0]+=1
            begin[1] = 10
        elif begin[1] == 40:
            begin[0]+=1
            begin[1] = 20
        elif begin[1] == 20:
            begin[0]+=1
            begin[1] = 0
        elif begin[1] == 0:
            begin[1]+=40
    else:
        if begin[1] == 40:
            begin[0]+=1
            begin[1] = 0
        elif begin[1] == 50:
            begin[0]+=1
            begin[1] = 10
        else:
            begin[1]+=20
if begin[0] >=24:
    begin[0] = begin[0] - (begin[0]//24)*24
begin[0] = str(begin[0])
begin[1] = str(begin[1])
if len(begin[0]) == 1:
    begin[0] = "0" + begin[0]
if len(begin[1]) == 1:
    begin[1] = begin[1] + "0"
print (begin[0] + ":" + begin[1])
