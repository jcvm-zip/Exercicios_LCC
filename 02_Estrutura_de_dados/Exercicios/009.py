class Contato:
    def __init__(self, nome, telefone):
        self.nome = nome
        self.telefone = telefone
        self.esquerda = None
        self.direita = None

def adicionar_contato(raiz, nome, telefone):
    if not raiz:
        return Contato(nome, telefone)

    if nome < raiz.nome:
        raiz.esquerda = adicionar_contato(raiz.esquerda, nome, telefone)
    elif nome > raiz.nome:
        raiz.direita = adicionar_contato(raiz.direita, nome, telefone)

    return raiz

def buscar_contato(raiz, nome):
    if not raiz or raiz.nome == nome:
        return raiz

    if nome < raiz.nome:
        return buscar_contato(raiz.esquerda, nome)
    else:
        return buscar_contato(raiz.direita, nome)

def encontrar_minimo(raiz):
    while raiz.esquerda:
        raiz = raiz.esquerda
    return raiz

def remover_contato(raiz, nome):
    if not raiz:
        return raiz

    if nome < raiz.nome:
        raiz.esquerda = remover_contato(raiz.esquerda, nome)
    elif nome > raiz.nome:
        raiz.direita = remover_contato(raiz.direita, nome)
    else:
        if not raiz.esquerda:
            return raiz.direita
        elif not raiz.direita:
            return raiz.esquerda

        temp = encontrar_minimo(raiz.direita)
        raiz.nome = temp.nome
        raiz.telefone = temp.telefone
        raiz.direita = remover_contato(raiz.direita, temp.nome)

    return raiz

def exibir_contatos_em_ordem(raiz):
    if raiz:
        exibir_contatos_em_ordem(raiz.esquerda)
        print(f"Nome: {raiz.nome}, Telefone: {raiz.telefone}")
        exibir_contatos_em_ordem(raiz.direita)

def main():
    raiz = None

    while True:
        print("\nMenu:")
        print("1. Adicionar contato")
        print("2. Buscar contato")
        print("3. Remover contato")
        print("4. Visualizar todos os contatos")
        print("5. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            nome = input("Digite o nome do contato: ")
            telefone = input("Digite o telefone do contato: ")
            raiz = adicionar_contato(raiz, nome, telefone)
            print("Contato adicionado com sucesso!")
        elif escolha == 2:
            nome = input("Digite o nome do contato a ser buscado: ")
            contato = buscar_contato(raiz, nome)
            if contato:
                print(f"Contato encontrado! Nome: {contato.nome}, Telefone: {contato.telefone}")
            else:
                print("Contato não encontrado.")
        elif escolha == 3:
            nome = input("Digite o nome do contato a ser removido: ")
            raiz = remover_contato(raiz, nome)
            print("Contato removido com sucesso!")
        elif escolha == 4:
            print("Contatos:")
            exibir_contatos_em_ordem(raiz)
        elif escolha == 5:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
