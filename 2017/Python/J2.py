N = int(input())
K = int(input())

"""
sum = 0 #SOLUTION 1
for i in range (K+1):
    sum+=(N*10**i)
print (sum)
"""

print(sum([N*10**i for i in range (K+1)])) #SOLUTION 2
