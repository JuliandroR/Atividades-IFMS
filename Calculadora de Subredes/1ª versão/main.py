entrada = str(input("Insira o Ip desejado"))

convert = entrada.split(".")

cont = len(convert)

if (int(convert[0]) >  0 and int(convert[0]) < 127):
    if((int(convert[1])>-1 and int(convert[1])<256) and (int(convert[2])>-1 and int(convert[2])<256) and (int(convert[3])>-1 and int(convert[3])<255)):
        print("Ip Válido")
        print("Classe A")
        print("Máscara de rede padrão: 255.0.0.0")
        print("Endereço de Rede: {}.0.0.0".format(convert[0]))
        print("Primeiro Host: {}.0.0.1".format(convert[0]))
        print("Último Host: {}.255.255.254".format(convert[0]))
        print("Broadcast: {}.255.255.255".format(convert[0]))
        if((int(convert[1] == 0) and (int(convert[2]) == 0) and (int(convert[3]) == 1))):
            print("Ip reservado para LAN")
        else:
            print("Ip não reservado para LAN")
    else:
        print("Ip Inválido")

elif (int(convert[0]) >  127 and int(convert[0]) < 192):
    if((int(convert[1])>-1 and int(convert[1])<255) and (int(convert[2])>-1 and int(convert[2])<256) and (int(convert[3])>-1 and int(convert[3])<256)):
        print("Ip Válido")
        print("Classe B")
        print("Máscara de rede padrão: 255.255.0.0")
        print("Endereço de Rede: {}.{}.0.0".format(convert[0],convert[1]))
        print("Primeiro Host: {}.{}.0.1".format(convert[0],convert[1]))
        print("Último Host: {}.{}.255.254".format(convert[0],convert[1]))
        print("Broadcast: {}.{}.255.255".format(convert[0],convert[1]))
        if((int(convert[2]) == 0) and (int(convert[3]) == 1)):
            print("Ip reservado para LAN")
        else:
            print("Ip não reservado para LAN")
    else:
        print("Ip Inválido")

elif (int(convert[0]) >  191 and int(convert[0]) < 224):
    if((int(convert[1])>-1 and int(convert[1])<256) and (int(convert[2])>-1 and int(convert[2])<255) and (int(convert[3])>-1 and int(convert[3])<256)):
        print("Ip Válido")
        print("Classe C")
        print("Máscara de rede padrão: 255.255.255.0")
        print("Endereço de Rede: {}.{}.{}.0".format(convert[0],convert[1],convert[2]))
        print("Primeiro Host: {}.{}.{}.1".format(convert[0],convert[1],convert[2]))
        print("Último Host: {}.{}.{}.254".format(convert[0],convert[1],convert[2]))
        print("Broadcast: {}.{}.{}.255".format(convert[0],convert[1],convert[2]))
        if(int(convert[3]) == 1):
            print("Ip reservado para LAN")
        else:
            print("Ip não reservado para LAN")
    else:
        print("Ip Inválido")

elif (int(convert[0]) >  223 and int(convert[0]) < 240):
    print("Classe D")
    print("Sem máscara de rede padrão, usado para tráfego de Multicast")

elif (int(convert[0]) >  239 and int(convert[0]) < 255):
    print("Classe E")
    print("Sem máscara padrão, reservado para teste")

elif(int(convert[0]) == 127):
    print("Ip de Loopback")

else:
    print("IP Inváldo")
    