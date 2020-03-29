L = int(input())
lst = []
x = 1
for counter in range (L):
    lst1 = []
    text = input()
    while text != "":
        num = text.count(text[0])
        if num > 0:
            for counter in range (1,num):
                if text[counter] != text[counter-1]:
                    num = counter
                    break
        lst1.append(str(num) + " " + text[0])
        text = text[num:]
    lst.append(" ".join(lst1))

for counter in range (len(lst)):
    print (lst[counter])
