class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def insert_node(root, value):
    if not root:
        return Node(value)

    if value < root.value:
        root.left = insert_node(root.left, value)
    else:
        root.right = insert_node(root.right, value)

    return root

def search_node(root, value):
    if not root or root.value == value:
        return root

    if value < root.value:
        return search_node(root.left, value)
    else:
        return search_node(root.right, value)

def find_min_node(root):
    while root.left:
        root = root.left
    return root

def remove_node(root, value):
    if not root:
        return root

    if value < root.value:
        root.left = remove_node(root.left, value)
    elif value > root.value:
        root.right = remove_node(root.right, value)
    else:
        if not root.left:
            return root.right
        elif not root.right:
            return root.left

        temp = find_min_node(root.right)
        root.value = temp.value
        root.right = remove_node(root.right, temp.value)

    return root

def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.value, end=" ")
        inorder_traversal(root.right)

def main():
    root = None

    while True:
        print("\nMenu:")
        print("1. Inserir nó")
        print("2. Buscar nó")
        print("3. Remover nó")
        print("4. Visualizar árvore (percurso em ordem)")
        print("5. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            value = int(input("Digite o valor do nó: "))
            root = insert_node(root, value)
            print("Nó inserido com sucesso!")
        elif escolha == 2:
            value = int(input("Digite o valor do nó a ser buscado: "))
            node = search_node(root, value)
            if node:
                print("Nó encontrado!")
            else:
                print("Nó não encontrado.")
        elif escolha == 3:
            value = int(input("Digite o valor do nó a ser removido: "))
            root = remove_node(root, value)
            print("Nó removido com sucesso!")
        elif escolha == 4:
            print("Árvore (percurso em ordem):")
            inorder_traversal(root)
            print()
        elif escolha == 5:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
