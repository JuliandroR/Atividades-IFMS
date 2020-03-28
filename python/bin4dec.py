entrada = input("A sequência em binário, please")

a = int(entrada[:7], 2)
b = int(entrada[8:15], 2)
c = int(entrada[16:23], 2)
d = int(entrada[24:31], 2)


print("A sequẽncia informada convertida é: {} . {} . {} . {}".format(a, b, c, d))