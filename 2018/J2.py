n = int(input())
parking1 = input()
parking2 = input()
lst = []
count = 0
for i in range (n):
    if parking1[i] == "C" and parking2[i] == "C":
        count +=1
print (count)
