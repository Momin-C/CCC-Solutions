start = input().split()
end = input().split()
t = int(input())

startX = int(start[0])
startY = int(start[1])
endX = int(end[0])
endY = int(end[1])

d = abs(endX - startX) + abs(endY - startY)

if (t-d)%2==0 and t-d>=0:
    print ("Y")
else:
    print ("N")
