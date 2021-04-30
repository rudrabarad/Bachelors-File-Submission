# while loop
count = 0
while (count < 3):
    count = count + 1
    print("in loop")

l = ["Rudra", "Barad"]
for i in l:
    print(i)

# Iterating over a tuple (immutable)
arr = ("Curio", "Rimor")
for i in arr:
    print(i)

# Iterating over a String
str = "RUDRA"
for i in str:
    print(i)

# Iterating over dictionary
d = dict()
d['xyz'] = 123
d['abc'] = 345
for i in d:
    print("%s  %d" % (i, d[i]))

print("\nID - 18DCS007")
print("NAME - RUDRA BARAD")