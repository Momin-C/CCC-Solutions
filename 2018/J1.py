lst = []
for i in range (4):
    num = int(input())
    lst.append(num)
if lst[0] == 8 or lst[0] == 9 and lst[3] ==8 or lst[3] ==9 and lst[1] == lst[2]:
    print ("ignore")
else:
    print ("answer")
