T = input()
S = input()
for counter in range (len(S)):
    S = S[1:] + S[0]
    if S in T:
        print ("yes")
        break
if S not in T:
    print ("no")
