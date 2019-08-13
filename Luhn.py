values = input("Enter an account Number ")
digits = [int(i) for i in values]
index  = 0 

def luhnCheck(digits, index):
    for i in digits: 
        if index % 2 != 0 :
                if ( digits[index] * 2) > 9 :
                        num = int(  ( digits[index] * 2) / 10 )
                        num += int(( digits[index] * 2) % 10)
                        digits[index] = num
                else : 
                        digits[index] = digits[index] * 2
        index += 1

    sum = 0
    result = {}
    for i in digits: 
        sum += i

    if(sum % 10 == 0):
        result = {"Account Number" : [{
            "Number " : digits,
            "Status" : "Valid" }] }
    else : 
        result = {"status" : [{
            "Number " : digits,
            "Status" : "Invalid" }] }

    return result



print(luhnCheck(digits, index))


