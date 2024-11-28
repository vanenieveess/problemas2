#Dada una función y un punto, calcula la ecuación
# de la recta tangente en ese punto.

import sympy as sp

def recta_tangente(func, x0):
    x = sp.symbols('x')

    derivada = sp.diff(func, x)

    punto_tangente = func.subs(x, x0)
    pendiente_tangente = derivada.subs(x, x0)

    ecuacion_tangente = pendiente_tangente * (x - x0) + punto_tangente

    return ecuacion_tangente

x = sp.symbols('x')
f = x ** 2 + 2 * x + 1

x0 = 1

ec_tangente = recta_tangente(f, x0)

print(f"La ecuación de la recta tangente en x = {x0} es: {ec_tangente}")