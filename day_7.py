
def runOp(listNum):
    it = 0

    while it < len(listNum):

        instruction = [0] * 4
        temp = listNum[it]
        instruction[0] = temp % 100
        temp = temp // 100
        instruction[1] = temp % 10
        temp = temp // 10
        instruction[2] = temp % 10
        temp = temp // 10
        instruction[3] = temp % 10

        if instruction[0] == 99:  # BREAK
            print("System halt!")
            break
        elif instruction[0] == 1:  # ADD
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]
            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            listNum[z] = x + y
            it += 4
        elif instruction[0] == 2:  # MULTIPLY
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]

            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            listNum[z] = x * y
            it += 4
        elif instruction[0] == 3:  # TAKE INPUT AND PLACE IN INDEX
            x = listNum[it + 1]
            userInput = input("Enter Digit:")
            userInput = int(userInput)
            listNum[x] = userInput
            it += 2
        elif instruction[0] == 5:
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]
            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            if x != 0:
                it = y
            else:
                it += 3
        elif instruction[0] == 6:
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]
            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            if x == 0:
                it = y
            else:
                it += 3
        elif instruction[0] == 7:
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]
            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            if x < y:
                listNum[z] = 1
            else:
                listNum[z] = 0
            it += 4
        elif instruction[0] == 8:
            x = listNum[it + 1]
            y = listNum[it + 2]
            z = listNum[it + 3]
            if instruction[1] == 0:
                x = listNum[x]
            if instruction[2] == 0:
                y = listNum[y]
            if x == y:
                listNum[z] = 1
            else:
                listNum[z] = 0
            it += 4
        else:  # OUTPUT VALUE AT INDEX
            x = listNum[it + 1]
            print(listNum[x])
            it += 2


it = 0
while(it < 5):
    listOfNum = [3,8,1001,8,10,8,105,1,0,0,21,42,67,76,89,110,191,272,353,434,99999,3,9,102,2,9,9,1001,9,2,9,1002,9,2,9,1001,9,2,9,4,9,99,3,9,1001,9,4,9,102,4,9,9,101,3,9,9,1002,9,2,9,1001,9,4,9,4,9,99,3,9,102,5,9,9,4,9,99,3,9,1001,9,3,9,1002,9,3,9,4,9,99,3,9,102,3,9,9,101,2,9,9,1002,9,3,9,101,5,9,9,4,9,99,3,9,1001,9,2,9,4,9,3,9,102,2,9,9,4,9,3,9,1001,9,1,9,4,9,3,9,102,2,9,9,4,9,3,9,1001,9,1,9,4,9,3,9,102,2,9,9,4,9,3,9,1002,9,2,9,4,9,3,9,1002,9,2,9,4,9,3,9,1002,9,2,9,4,9,3,9,1002,9,2,9,4,9,99,3,9,102,2,9,9,4,9,3,9,101,1,9,9,4,9,3,9,101,1,9,9,4,9,3,9,102,2,9,9,4,9,3,9,1002,9,2,9,4,9,3,9,1002,9,2,9,4,9,3,9,101,2,9,9,4,9,3,9,101,1,9,9,4,9,3,9,101,2,9,9,4,9,3,9,101,2,9,9,4,9,99,3,9,102,2,9,9,4,9,3,9,102,2,9,9,4,9,3,9,1002,9,2,9,4,9,3,9,102,2,9,9,4,9,3,9,101,1,9,9,4,9,3,9,102,2,9,9,4,9,3,9,101,2,9,9,4,9,3,9,101,2,9,9,4,9,3,9,1001,9,1,9,4,9,3,9,101,2,9,9,4,9,99,3,9,102,2,9,9,4,9,3,9,1001,9,2,9,4,9,3,9,1001,9,1,9,4,9,3,9,101,1,9,9,4,9,3,9,102,2,9,9,4,9,3,9,101,2,9,9,4,9,3,9,101,2,9,9,4,9,3,9,1002,9,2,9,4,9,3,9,101,1,9,9,4,9,3,9,1002,9,2,9,4,9,99,3,9,1002,9,2,9,4,9,3,9,1001,9,1,9,4,9,3,9,1002,9,2,9,4,9,3,9,1001,9,1,9,4,9,3,9,102,2,9,9,4,9,3,9,102,2,9,9,4,9,3,9,1001,9,1,9,4,9,3,9,1001,9,2,9,4,9,3,9,1001,9,1,9,4,9,3,9,101,2,9,9,4,9,99]
    runOp(listOfNum)
    it += 1
