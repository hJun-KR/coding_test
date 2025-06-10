import sys

while True:
    Ausar, Auset, Heru = map(int, sys.stdin.readline().split(" "))

    if (Ausar == 0 and Auset == 0 and Heru == 0):
        break
    
    max_num = max(Ausar, Auset, Heru) ** 2
    
    total = ((Ausar ** 2) + (Auset ** 2) + (Heru ** 2)) - max_num

    if total == max_num:
        print('right')
    else:
        print('wrong')