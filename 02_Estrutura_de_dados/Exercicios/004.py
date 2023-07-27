def empilhar_elemento(pilha, elemento):
    pilha.append(elemento)
    print(f"Elemento '{elemento}' empilhado!")

def desempilhar_elemento(pilha):
    if not pilha:
        print("A pilha está vazia.")
    else:
        elemento_desempilhado = pilha.pop()
        print(f"Elemento '{elemento_desempilhado}' desempilhado!")

def visualizar_topo_pilha(pilha):
    if not pilha:
        print("A pilha está vazia.")
    else:
        print(f"Elemento no topo da pilha: {pilha[-1]}")

def main():
    pilha = []

    while True:
        print("\nMenu:")
        print("1. Empilhar elemento")
        print("2. Desempilhar elemento")
        print("3. Visualizar topo da pilha")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            elemento = input("Digite o elemento a ser empilhado: ")
            empilhar_elemento(pilha, elemento)
        elif escolha == 2:
            desempilhar_elemento(pilha)
        elif escolha == 3:
            visualizar_topo_pilha(pilha)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
