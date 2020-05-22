g1 = input()
g2 = input()
g3 = input()
g4 = input()
g5 = input()
g6 = input()

lst = [g1,g2,g3,g4,g5,g6]

if lst.count("W") == 5 or lst.count("W") == 6:
    print (1)
elif lst.count("W") == 3 or lst.count("W") == 4:
    print (2)
elif lst.count("W") == 1 or lst.count("W") == 2:
    print (3)
else:
    print(-1)
