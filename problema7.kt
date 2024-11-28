#Diseña una función que acepte una expresión algebraica
# (por ejemplo, 3x^2 + 2x) y calcule su derivada simbólica.

import sympy as sp


def calcular_derivada(expresion):
    # Definir la variable simbólica (en este caso, 'x')
    x = sp.symbols('x')

    # Convertir la expresión en un objeto simbólico de SymPy
    expr = sp.sympify(expresion)

    # Calcular la derivada de la expresión con respecto a 'x'
    derivada = sp.diff(expr, x)

    return derivada


# Ejemplo de uso
expresion = "3*x**2 + 2*x"
derivada = calcular_derivada(expresion)

print(f"La derivada de {expresion} es: {derivada}")