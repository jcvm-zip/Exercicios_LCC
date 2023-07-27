from collections import deque

def adicionar_produto_estoque(estoque, produto):
    estoque.append(produto)
    print(f"Produto '{produto}' adicionado ao estoque!")

def vender_produto(estoque):
    if not estoque:
        print("O estoque está vazio.")
    else:
        produto_vendido = estoque.popleft()
        print(f"Produto '{produto_vendido}' vendido!")

def visualizar_estoque(estoque):
    if not estoque:
        print("O estoque está vazio.")
    else:
        print("Produtos no estoque:")
        for i, produto in enumerate(estoque):
            print(f"{i + 1}. {produto}")

def main():
    estoque_produtos = deque()

    while True:
        print("\nMenu:")
        print("1. Adicionar produto ao estoque")
        print("2. Vender produto")
        print("3. Visualizar estoque de produtos")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            produto = input("Digite o nome do produto: ")
            adicionar_produto_estoque(estoque_produtos, produto)
        elif escolha == 2:
            vender_produto(estoque_produtos)
        elif escolha == 3:
            visualizar_estoque(estoque_produtos)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
