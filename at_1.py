z=int(input("insira o valor "))

x=0
y=1


while True:
    x,y=y,x+y
    if y==z:
        print("numero pertence a sequencia")
        break
        
    elif y>z:
        print("numero não pertence a sequencia")
        break