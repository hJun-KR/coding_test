import sys

def roundNum(num):
    return int(num+0.5)

repeat = int(sys.stdin.readline())
if (repeat > 0):
    scores = []
    persent = roundNum((15 * int(repeat)) / 100.0)
    total = 0

    for _ in range(repeat):
        score = int(sys.stdin.readline())
        scores.append(score)

    scores.sort()

    start = persent
    end = len(scores) - persent

    for i in range(start, end):
        total += scores[i]

    print(roundNum(total / (len(scores) - persent * 2)))
else:
    print(0)
