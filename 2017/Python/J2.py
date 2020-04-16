N = int(input())
K = int(input())

"""
#SOLUTION 1
lst = []
for i in range (K+1):
    lst.append(N*10**i)
    print (lst)
print (sum(lst))
"""

print (sum([N*10**i for i in range (K+1)])) #SOLUTION 2
