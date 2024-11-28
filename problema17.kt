#Escribe un programa para determinar si dos
#números dados son amigables (la suma de los divisores de uno es igual al
#otro y viceversa)

def suma_divisores(n):
    suma = 1  # Comenzamos con 1, porque 1 es divisor de todos los números.
    for i in range(2, int(n ** 0.5) + 1):  # Solo iteramos hasta la raíz cuadrada de n
        if n % i == 0:
            suma += i
            if i != n // i:
                suma += n // i
    return suma

def son_amigables(num1, num2):
    # Calculamos la suma de los divisores de num1 y num2
    if suma_divisores(num1) == num2 and suma_divisores(num2) == num1:
        return True
    return False

# Ejemplo de uso
num1 = int(input("Ingresa el primer número: "))
num2 = int(input("Ingresa el segundo número: "))

if son_amigables(num1, num2):
    print(f"{num1} y {num2} son números amigables.")
else:
    print(f"{num1} y {num2} no son números amigables.")
