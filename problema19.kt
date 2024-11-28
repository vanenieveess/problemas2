#Calcula el número de caminos posibles
#en una cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo.

import math

def numero_de_caminos(N):
    # Calculamos el número de combinaciones C(2N, N)
    return math.comb(2 * N, N)

# Ejemplo de uso
N = int(input("Ingresa el valor de N para la cuadrícula NxN: "))
caminos = numero_de_caminos(N)
print(f"El número de caminos posibles en una cuadrícula de {N}x{N} es: {caminos}")

