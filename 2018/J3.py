lst = []
distance1 = []
distance2 = []
diff = 0
distances = input().split()
for i in range (len(distances)):
    distances[i] = int(distances[i])

for i in range (5):
    diff = sum(distances[:i])
    distance1.append(diff)
print (distance1)
distance2.append(distances[0])
for i in range(5):
    diff = sum(distances[:i])
    distance2.append(diff)
print (distance2)
