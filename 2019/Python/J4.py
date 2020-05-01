grid = ["1 2","3 4"]
seq = input()
for i in range (len(seq)):
    if seq[i] == "V":
        grid[0],grid[1] = grid[0][::-1],grid[1][::-1]
    elif seq[i] == "H":
        grid[0],grid[1] = grid[1],grid[0]
for i in range (2):
    print (grid[i])
