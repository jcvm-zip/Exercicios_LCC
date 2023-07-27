class Pilha:
    def __init__(self):
        self.items = []

    def esta_vazia(self):
        return len(self.items) == 0

    def empilhar(self, item):
        self.items.append(item)

    def desempilhar(self):
        if not self.esta_vazia():
            return self.items.pop()
        else:
            raise IndexError("A pilha está vazia, não é possível desempilhar.")

    def tamanho(self):
        return len(self.items)

    def topo(self):
        if not self.esta_vazia():
            return self.items[-1]
        else:
            raise IndexError("A pilha está vazia, não há elementos para retornar o topo.")

    def imprimir(self):
        print("Pilha:", self.items)


pilha = Pilha()
print("Pilha vazia?", pilha.esta_vazia())

pilha.empilhar(10)
pilha.empilhar(20)
pilha.empilhar(30)
pilha.empilhar(40)

pilha.imprimir()

print("Tamanho da pilha:", pilha.tamanho())

print("Topo da pilha:", pilha.topo())

pilha.desempilhar()
pilha.imprimir()

print("Tamanho da pilha:", pilha.tamanho())
