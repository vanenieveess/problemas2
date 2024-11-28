#Representa gráficamente un polinomio P(x) y marca
# en la gráfica las raíces reales calculadas.

import numpy as np
import matplotlib.pyplot as plt

def P(x):
    return x**3 - 4*x**2 + 6*x - 4

coeficientes = [1, -4, 6, -4]
raices = np.roots(coeficientes)

raices_reales = [r.real for r in raices if np.isreal(r)]

x = np.linspace(-2, 4, 400)

plt.plot(x, P(x), label="P(x) = x³ - 4x² + 6x - 4", color='blue')

for raiz in raices_reales:
    plt.scatter(raiz, 0, color='red', zorder=5)  # Marcar la raíz en el eje x

plt.xlabel("x")
plt.ylabel("P(x)")
plt.title("Gráfica de P(x) y sus raíces reales")

plt.grid(True)

plt.legend()

plt.show()

