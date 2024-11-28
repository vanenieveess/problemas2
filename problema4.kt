#Encuentra el número más cercano a un índice N en la serie
# de Fibonacci que también sea primo.

import math

def es_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

def fibonacci_primo_cercano(n):
    fib_n = fibonacci(n)
    izquierda, derecha = n - 1, n + 1

    while True:
        if es_primo(fibonacci(izquierda)):
            return fibonacci(izquierda)

        if es_primo(fibonacci(derecha)):
            return fibonacci(derecha)

        izquierda -= 1
        derecha += 1

n = int(input("Introduce el índice N para encontrar el número Fibonacci más cercano que sea primo: "))

primo_cercano = fibonacci_primo_cercano(n)
print(f"El número primo más cercano a Fibonacci({n}) es {primo_cercano}.")