entrada = input("Insira a sequência em decimal:")

e = entrada.split(".")
cont = len(e)

i = int(0)
result = str("")

while i < cont:
    e[i] = bin(int(e[i]))[2:]  
    result += e[i]
    i+=1
print("A sequẽncia informada em binário é: {}".format(result))