lst = []
word = input()
for i in range(len(word)):
    for x in range(len(word)-1,-1,-1):
        if word[i:x+1]!= "" and word[i:x+1] == word[i:x+1][::-1]:
            lst.append(len(word[i:x+1]))
            break
print(max(lst))
