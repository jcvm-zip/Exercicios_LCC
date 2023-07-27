class Grafo:
    def __init__(self):
        self.grafo = {}

    def adicionar_vertice(self, vertice):
        self.grafo[vertice] = []

    def adicionar_aresta(self, origem, destino):
        self.grafo[origem].append(destino)

    def imprimir_grafo(self):
        for vertice in self.grafo:
            print(vertice, "->", self.grafo[vertice])

grafo = Grafo()

grafo.adicionar_vertice("A")
grafo.adicionar_vertice("B")
grafo.adicionar_vertice("C")
grafo.adicionar_vertice("D")

grafo.adicionar_aresta("A", "B")
grafo.adicionar_aresta("B", "C")
grafo.adicionar_aresta("C", "D")
grafo.adicionar_aresta("D", "A")

grafo.imprimir_grafo()
