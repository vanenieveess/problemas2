#Diseña una función para calcular la integral
# definida de una función en un intervalo utilizando el método del trapecio.

def metodo_trapecio(func, a, b, n):
    h = (b - a) / n

    suma = (func(a) + func(b)) / 2

    for i in range(1, n):
        x_i = a + i * h
        suma += func(x_i)

    integral = h * suma
    return integral

def f(x):
    return x ** 2

a = 0
b = 1
n = 1000

resultado = metodo_trapecio(f, a, b, n)

print(f"La aproximación de la integral de f(x) en [{a}, {b}] es: {resultado}")