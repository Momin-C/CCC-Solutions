start = input().split()
end = input().split()
t = int(input())

startX = int(start[0])
startY = int(start[1])
endX = int(end[0])
endY = int(end[1])

if ((startX - endX) + (startY - endY))%2 == t%2:
    print ("Y")
else:
    print ("N")
