class NoTrie:
    def __init__(self):
        self.filhos = {}
        self.eh_fim_da_palavra = False


class Trie:
    def __init__(self):
        self.raiz = NoTrie()

    def inserir(self, palavra):
        no_atual = self.raiz
        for char in palavra:
            if char not in no_atual.filhos:
                no_atual.filhos[char] = NoTrie()
            no_atual = no_atual.filhos[char]
        no_atual.eh_fim_da_palavra = True

    def pesquisar(self, palavra):
        no_atual = self.raiz
        for char in palavra:
            if char not in no_atual.filhos:
                return False
            no_atual = no_atual.filhos[char]
        return no_atual.eh_fim_da_palavra

    def comeca_com_prefixo(self, prefixo):
        no_atual = self.raiz
        for char in prefixo:
            if char not in no_atual.filhos:
                return False
            no_atual = no_atual.filhos[char]
        return True


trie = Trie()

trie.inserir("casa")
trie.inserir("casaco")
trie.inserir("carro")
trie.inserir("cadeira")

print(trie.pesquisar("casa"))
print(trie.pesquisar("cas"))

print(trie.comeca_com_prefixo("car"))
print(trie.comeca_com_prefixo("cau"))
