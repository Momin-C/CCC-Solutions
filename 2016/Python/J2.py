lst = []
for i in range(4):
    lst.append([int(x) for x in input().split()])

if sum(lst[0]) == sum(lst[1]) == sum(lst[2]) == sum(lst[3]) == (lst[0][0] + lst[1][0] + lst[2][0] + lst[3][0]) == (lst[0][1] + lst[1][1] + lst[2][1] + lst[3][1]) == (lst[0][2] + lst[1][2] + lst[2][2] + lst[3][2]) == (lst[0][3] + lst[1][3] + lst[2][3] + lst[3][3]):
    print ("magic")
else:
    print("not magic")
