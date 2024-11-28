#Implementa una función que
# calcule la derivada de una función en un punto usando diferencias finitas.

def derivada_aproximada(func, x, h=0.0001):
    """
    Calcula la derivada de una función en un punto usando el método de diferencias finitas hacia adelante.

    :param func: La función que queremos derivar.
    :param x: El punto en el que queremos calcular la derivada.
    :param h: Un valor pequeño (por defecto 0.0001) que se utiliza para aproximar la derivada.
    :return: La derivada aproximada de la función en el punto x.
    """

    return (func(x + h) - func(x)) / h

def f(x):
    return 3 * x ** 2 + 2 * x

x = 1
derivada = derivada_aproximada(f, x)

print(f"La derivada aproximada de f(x) en x = {x} es: {derivada}")
