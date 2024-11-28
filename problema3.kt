#Escribe una función que determine si un número dado pertenece a la serie de
# Fibonacci. Si pertenece, devuelve su posición.

def pertenece_a_fibonacci(n):
    a, b = 0, 1
    pos = 1

    while a < n:
        a, b = b, a + b
        pos += 1

    if a == n:
        return f"El número {n} corresponde a la secuencia de Fibonacci y está en la posición {pos}."
    else:
        return f"El número {n} no correspoonde a la secuencia de Fibonacci."

n = int(input("Introduce un número para verificar si pertenece a la secuencia de Fibonacci: "))

print(pertenece_a_fibonacci(n))
