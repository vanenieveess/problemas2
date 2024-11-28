# Genera una gráfica de barras donde el eje X
# representa los índices de la serie de Fibonacci y el eje Y la suma
# acumulada de los términos hasta ese indice.

import matplotlib.pyplot as plt

def fibonacci(n):
    fib = [0, 1]
    for i in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib

def fibonacci_acumulado(n):
    fib = fibonacci(n)
    acumulado = [sum(fib[:i+1]) for i in range(n)]  # Calculamos la suma acumulada
    return acumulado

n = int(input("Ingresa el número de términos de Fibonacci para graficar: "))

acumulado = fibonacci_acumulado(n)

plt.bar(range(n), acumulado, color='skyblue')

plt.xlabel("Índice")
plt.ylabel("Suma acumulada")
plt.title("Gráfica acumulativa de la serie Fibonacci")

plt.show()
