def solution(str):
    stack = []
    for i in str:
        if (i == '('):
            stack.append(i)
        elif (i == ')'):
            if (len(stack) == 0):
                return False
            else:
                stack.pop()
    if (len(stack) == 0):
        return True
    else:
        return False
