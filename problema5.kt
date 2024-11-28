#Pedir por teclado N y calcular el
# Factorial de N(N != 1 * 2 * 3 * ... * N)

Num = int(input("Introduce un número para calcular su factorial: "))

factorial = 1
contador = 1

while contador <= Num:
    factorial *= contador
    contador += 1

print(f"El factorial de {Num} es {factorial}.")