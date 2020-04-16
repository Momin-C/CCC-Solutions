N = int(input())
K = int(input())
lst = [N]
for i in range (K):
    N*=10
    lst.append(N)
print (sum(lst))
