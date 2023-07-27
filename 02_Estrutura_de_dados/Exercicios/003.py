def adicionar_pedido(fila, pedido):
    fila.append(pedido)
    print(f"Pedido '{pedido}' adicionado à fila!")

def atender_pedido(fila):
    if not fila:
        print("A fila de pedidos está vazia.")
    else:
        pedido_atendido = fila.pop(0)
        print(f"Pedido '{pedido_atendido}' atendido!")

def visualizar_fila(fila):
    if not fila:
        print("A fila de pedidos está vazia.")
    else:
        print("Pedidos na fila:")
        for i, pedido in enumerate(fila):
            print(f"{i + 1}. {pedido}")

def main():
    fila_pedidos = []

    while True:
        print("\nMenu:")
        print("1. Adicionar pedido")
        print("2. Atender pedido")
        print("3. Visualizar fila de pedidos")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            pedido = input("Digite o nome do pedido: ")
            adicionar_pedido(fila_pedidos, pedido)
        elif escolha == 2:
            atender_pedido(fila_pedidos)
        elif escolha == 3:
            visualizar_fila(fila_pedidos)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
