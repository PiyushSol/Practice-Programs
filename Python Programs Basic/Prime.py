num = int(input("Enter a Number :"))
flag= True
for i in range(2,num,1):
    if num % i ==0 :
        flag= False
    else:
        flag= True

if flag == False:
       print("Number is not Prime")
else:
        print("Number is Prime")
