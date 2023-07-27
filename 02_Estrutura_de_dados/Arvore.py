class NoArvore:
    def __init__(self, valor):
        self.valor = valor
        self.esquerda = None
        self.direita = None


class ArvoreBinaria:
    def __init__(self):
        self.raiz = None

    def inserir(self, valor):
        if self.raiz is None:
            self.raiz = NoArvore(valor)
        else:
            self._inserir_recursivamente(valor, self.raiz)

    def _inserir_recursivamente(self, valor, no_atual):
        if valor < no_atual.valor:
            if no_atual.esquerda is None:
                no_atual.esquerda = NoArvore(valor)
            else:
                self._inserir_recursivamente(valor, no_atual.esquerda)
        else:
            if no_atual.direita is None:
                no_atual.direita = NoArvore(valor)
            else:
                self._inserir_recursivamente(valor, no_atual.direita)

    def buscar(self, valor):
        return self._buscar_recursivamente(valor, self.raiz)

    def _buscar_recursivamente(self, valor, no_atual):
        if no_atual is None or no_atual.valor == valor:
            return no_atual
        if valor < no_atual.valor:
            return self._buscar_recursivamente(valor, no_atual.esquerda)
        else:
            return self._buscar_recursivamente(valor, no_atual.direita)

    def imprimir_em_ordem(self):
        self._imprimir_em_ordem_recursivamente(self.raiz)

    def _imprimir_em_ordem_recursivamente(self, no_atual):
        if no_atual:
            self._imprimir_em_ordem_recursivamente(no_atual.esquerda)
            print(no_atual.valor, end=" ")
            self._imprimir_em_ordem_recursivamente(no_atual.direita)


arvore = ArvoreBinaria()
arvore.inserir(50)
arvore.inserir(30)
arvore.inserir(70)
arvore.inserir(20)
arvore.inserir(40)
arvore.inserir(60)
arvore.inserir(80)

arvore.imprimir_em_ordem()

print("\nBuscando valor 40 na árvore...")
no_encontrado = arvore.buscar(40)
if no_encontrado:
    print("Valor 40 encontrado na árvore.")
else:
    print("Valor 40 não encontrado na árvore.")
