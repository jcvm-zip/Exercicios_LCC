class Fila:
    def __init__(self):
        self.items = []

    def esta_vazia(self):
        return len(self.items) == 0

    def enfileirar(self, item):
        self.items.append(item)

    def desenfileirar(self):
        if not self.esta_vazia():
            return self.items.pop(0)
        else:
            raise IndexError("A fila está vazia, não é possível desenfileirar.")

    def tamanho(self):
        return len(self.items)

    def frente(self):
        if not self.esta_vazia():
            return self.items[0]
        else:
            raise IndexError("A fila está vazia, não há elementos para retornar o primeiro.")

    def imprimir(self):
        print("Fila:", self.items)


fila = Fila()
print("Fila vazia?", fila.esta_vazia())

fila.enfileirar(10)
fila.enfileirar(20)
fila.enfileirar(30)
fila.enfileirar(40)

fila.imprimir()

print("Tamanho da fila:", fila.tamanho())

print("Frente da fila:", fila.frente())

fila.desenfileirar()
fila.imprimir()

print("Tamanho da fila:", fila.tamanho())
