L = int(input())
dropsX,dropsY = [],[]
for counter in range (L):
    paintdrop = input().split(", ")
    dropsX.append(int(paintdrop[0]))
    dropsY.append(int(paintdrop[1]))
print (str(min(dropsX)-1) + ", " + str(min(dropsY)-1))
print (str(max(dropsX)+1) + ", " + str(max(dropsY)+1))
