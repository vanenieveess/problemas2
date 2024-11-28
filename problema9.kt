#Escribe un programa que encuentre el minimo
# o máximo de una función cuadrática mediante el cálculo de su derivada.

def encontrar_extremo(a, b, c):
    """
    Encuentra el mínimo o máximo de una función cuadrática de la forma ax^2 + bx + c
    utilizando la derivada.

    :param a: Coeficiente cuadrático de la función.
    :param b: Coeficiente lineal de la función.
    :param c: Término constante de la función.
    :return: El valor de x en el punto extremo y el tipo de extremo (mínimo o máximo).
    """

    x_extremo = -b / (2 * a)

    if a > 0:
        tipo_extremo = "mínimo"
    elif a < 0:
        tipo_extremo = "máximo"
    else:
        tipo_extremo = "no tiene mínimo ni máximo"  # Caso de una función lineal

    return x_extremo, tipo_extremo

a = 1
b = -4
c = 3

x_extremo, tipo_extremo = encontrar_extremo(a, b, c)

print(f"El punto extremo de la función es x = {x_extremo}, y es un {tipo_extremo}.")