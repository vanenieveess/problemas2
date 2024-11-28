# Grafica una función f(x) = x³-4x²+62 como y, en el mismo gráfico,
# muestra la recta tangente en un punto dado. .

import numpy as np
import matplotlib.pyplot as plt

def f(x):
    return x**3 - 4*x**2 + 62

def f_prime(x):
    return 3*x**2 - 8*x

def recta_tangente(x, x0):
    return f(x0) + f_prime(x0) * (x - x0)

y = float(input("Ingresa el valor de x (punto de la tangente): "))

x = np.linspace(-10, 10, 400)

plt.plot(x, f(x), label="f(x) = x³ - 4x² + 62", color='blue')

plt.plot(x, recta_tangente(x, y), label=f"Tangente en x = {y}", color='red', linestyle='--')

plt.scatter([y], [f(y)], color='red', zorder=5)

plt.xlabel("x")
plt.ylabel("f(x)")
plt.title("Gráfica de f(x) y su recta tangente")

plt.legend()
plt.grid(True)
plt.show()
