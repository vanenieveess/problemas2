#Crea una función que reciba dos números iniciales y calcule
#una serie similar a Fibonacci, pero con estos números de partida

def serie_personalizada(a, b, n):
    secuencia = [a, b]

    for _ in range(2, n):
        secuencia.append(secuencia[-1] + secuencia[-2])

    return secuencia

a = int(input("Introduce el primer dígito de la serie: "))
b = int(input("Introduce el segundo dígito de la serie: "))
n = int(input("Introduce el número de términos que deseas calcular: "))

print(serie_personalizada(a, b, n))