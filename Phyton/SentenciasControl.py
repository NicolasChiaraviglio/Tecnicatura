#IF/ELSE

condicion = True
if condicion == True:
    print("Condicion Verdadera")
elif condicion == False:
    print("Condicion Falsa")
else:
    print("Condicion sin especifir")

#Convercion de numero a texto

num = int(input("Digite un numero en el rango del 1 al 3: "))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero 2"
elif num == 3:
    numTexto = "Numero 3"
else:
    numTexto = "Has ingresado un numero fuera de rango"
print(f"El numero ingresado es: {num} - {numTexto}")

#EJERCICIO: ESCRIBIR EXPRECION ALGORITMICA

a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
c = float(input("Digite el valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f"El resultado es: {resultado}")

#OPERADOR TERNARIO

condicion = False
print("Condicion Verdadera") if condicion else print ("Condicion Falsa")#no se debe utilizar elif#no se aconseja en codigos largos complejos












