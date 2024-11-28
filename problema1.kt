#Implementa una función que calcule los primeros N
# números de la serie de Fibonacci en orden inverso

def fibonacci_invertido(n):
    fibonacci = []

    a, b = 0, 1
    for _ in range(n):
        fibonacci.append(a)
        a, b = b, a + b

    for i in range(n - 1, -1, -1):
        print(fibonacci[i], end=" ")


n = int(input("Introduce el número de términos: "))

print(f"Los {n} números seleccionados de Fibonacci en orden inverso son:")

fibonacci_invertido(n)
