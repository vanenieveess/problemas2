# Dibuja la superposición de dos ondas.

import numpy as np
import matplotlib.pyplot as plt

def onda1(x, A1=1, k1=2*np.pi, phi1=0):
    return A1 * np.sin(k1 * x + phi1)

def onda2(x, A2=1, k2=2*np.pi, phi2=np.pi/2):
    return A2 * np.sin(k2 * x + phi2)

x = np.linspace(0, 2 * np.pi, 500)

y1 = onda1(x)
y2 = onda2(x)

y_total = y1 + y2

plt.plot(x, y1, label="Onda 1", color='blue', linestyle='--')
plt.plot(x, y2, label="Onda 2", color='green', linestyle='--')
plt.plot(x, y_total, label="Superposición", color='red', linewidth=2)

plt.xlabel("x")
plt.ylabel("Amplitud")
plt.title("Superposición de dos ondas senoidales")

plt.legend()

plt.grid(True)
plt.show()
