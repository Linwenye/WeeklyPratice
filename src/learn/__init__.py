fh = open("E:\OneDrive - smail.nju.edu.cn\learning\SE3\movies.txt")
dd1 = dict()
dd2 = dict()
word = None
score = 0
for line in fh:
    if line.startswith("product/productId: "):
        word = line[18:].strip()
    elif line.startswith("review/score: "):
        score = float(line[13:])
        dd1[word] = dd1.get(word, 0)+1
        dd2[word] = (dd2.get(word, 0)*(dd1[word]-1)+score)/(dd1[word])
    else:
        continue
ls = sorted([(y, x) for x, y in dd1.items()], reverse=True)

# print top 100
time = 0
for y, x in ls:
    if time < 10000:
        print "id of the film:",x, "  review times:",y
        time = time + 1
    else:
        break
