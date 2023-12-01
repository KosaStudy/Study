import sys


# 파이썬의 경우 스택 자료형을 따로 지원하지는 않음-> 리스트로 구현
class Stack:
    def __init__(self):
        self.stack = []

    def push(self, num):
        self.stack.append(num)

    def pop(self):
        if not self.empty():
            top = self.stack.pop(-1)
            return top
        else:
            # print("Stack is Empty")
            return -1

    def size(self):
        return len(self.stack)

    def empty(self):
        return int(len(self.stack) == 0)  # if len =0 return 1
        # return 0 if stack else 1

    def top(self):
        if not self.empty():
            return self.stack[-1]  # return last value
        else:
            return -1


def main():
    stack = Stack()

    calc_num = int(sys.stdin.readline().rstrip())  # input()을 사용하면 시간 초과..

    for i in range(calc_num):
        input_split = sys.stdin.readline().rstrip().split()
        calc_type = input_split[0]

        if calc_type == "push":
            stack.push(input_split[1])

        elif calc_type == "pop":
            print(stack.pop())

        elif calc_type == "top":
            print(stack.top())

        elif calc_type == "empty":
            print(stack.empty())

        elif calc_type == "size":
            print(stack.size())


if __name__ == "__main__":
    main()
