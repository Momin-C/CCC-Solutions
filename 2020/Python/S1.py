lines = int(input())

lst = []
speedList = []
for i in range(lines):
    observation = input().split()
    observation[0] = int(observation[0])
    observation[1] = int(observation[1])
    lst.append(observation)
lst = sorted(lst)

for i in range(1,lines):
    time = abs(lst[i][0] - lst[i-1][0])
    distance = abs(lst[i][1] - lst[i-1][1])
    speed = distance/time
    speedList.append(speed)
print(max(speedList))
