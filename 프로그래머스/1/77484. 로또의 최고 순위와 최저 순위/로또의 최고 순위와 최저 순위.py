def solution(lottos, win_nums):
    rank = {
        6: 1,
        5: 2,
        4: 3,
        3: 4,
        2: 5
    }
    
    max = lottos.count(0)
    min = 0
    
    for i in win_nums:
        min += lottos.count(i)

    max += min
    
    return [rank.get(max, 6), rank.get(min, 6)]