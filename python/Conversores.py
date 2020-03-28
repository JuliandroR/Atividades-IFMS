import os

entrada = int(0)

while(entrada != 5):
    print("Qual opção deseja realizar?")
    print("1 - Para converter BINÁRIO para DECIMAL")
    print("2 - Para converter DECIMAL para BINÁRIO")
    print("3 - Para converter BINÁRIO para HEXADECIMAL")
    print("4- Para converter HEXADECIMAL para BINÁRIO")
    print("5 - Para fechar o código")
    entrada = int(input())

    if(entrada == 1):
        os.system('cls' if os.name == 'nt' else 'clear')
        
        entrada = input("A sequência em binário com 32 caracteres")
        a = int(entrada[:7], 2)
        b = int(entrada[8:15], 2)
        c = int(entrada[16:23], 2)
        d = int(entrada[24:31], 2)
        print("A sequẽncia informada convertida é: {} . {} . {} . {}".format(a, b, c, d))
    
    elif(entrada == 2):
        os.system('cls' if os.name == 'nt' else 'clear')
        entrada = input("Insira a sequência em decimal com ponto:")
        e = entrada.split(".")
        cont = len(e)
        i = int(0)
        result = str("")
        while i < cont:
            e[i] = bin(int(e[i]))[2:]  
            result += e[i]
            i+=1
        print("A sequẽncia informada em binário é: {}".format(result))

    elif(entrada == 3):
        os.system('cls' if os.name == 'nt' else 'clear')
        entrada = input("A sequência em binário, com 128 caracteres")
        
        a = int(entrada[:15], 2)
        b = int(entrada[16:31], 2)
        c = int(entrada[31:47], 2)
        d = int(entrada[48:63], 2)
        e = int(entrada[64:79], 2)
        f = int(entrada[80:95], 2)
        g = int(entrada[96:111], 2)
        h = int(entrada[112:127], 2)
        print("Tranformando o informado para hexadecimal fica assim: {} : {} : {} : {} : {} : {} : {} : {}".format(hex(a)[2:],hex(b)[2:],hex(c)[2:],hex(d)[2:],hex(e)[2:],hex(f)[2:],hex(g)[2:],hex(h)[2:]))

    elif(entrada == 4):
        os.system('cls' if os.name == 'nt' else 'clear')
        entrada = input("Insira a sequência hexadecimal com dois pontos:")
        e = entrada.split(":")
        cont = len(e)
        i = int(0)
        result = str("")
        
        while i < cont:
            e[i] = bin(int(e[i],16))[2:]  
            result += e[i]
            i+=1
        print("A sequẽncia informada em binário é: {}".format(result))