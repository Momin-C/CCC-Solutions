N = int(input())
K = int(input())

"""
lst = [] #SOLUTION 1
for i in range (K+1):
    lst.append(N*10**i)
print (sum(lst))
"""

print (sum([N*10**i for i in range (K+1)])) #SOLUTION 2
