entrada = input("A sequência em binário, please")

a = int(entrada[:15], 2)
b = int(entrada[16:31], 2)
c = int(entrada[31:47], 2)
d = int(entrada[48:63], 2)
e = int(entrada[64:79], 2)
f = int(entrada[80:95], 2)
g = int(entrada[96:111], 2)
h = int(entrada[112:127], 2)

print("Tranformando o informado para hexadeciaml fica assim: {} : {} : {} : {} : {} : {} : {} : {}".format(hex(a)[2:],hex(b)[2:],hex(c)[2:],hex(d)[2:],hex(e)[2:],hex(f)[2:],hex(g)[2:],hex(h)[2:]))