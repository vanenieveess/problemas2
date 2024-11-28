#Implementa un algoritmo para calcular la suma de los primeros N
# términos de la serie de Fibonacci.

N = int(input("Introduce el número de términos de Fibonacci para calcular la suma: "))

a, b = 0, 1
suma_fibonacci = 0

for _ in range(N):
    suma_fibonacci += a
    a, b = b, a + b

# Mostrar el resultado
print(f"La suma de los primeros {N} términos de Fibonacci es: {suma_fibonacci}.")
