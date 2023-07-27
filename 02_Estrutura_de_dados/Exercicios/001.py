def adicionar_tarefa(lista, tarefa):
    lista.append(tarefa)
    print("Tarefa adicionada com sucesso!")

def visualizar_tarefas(lista):
    if not lista:
        print("A lista de tarefas está vazia.")
    else:
        print("Tarefas:")
        for i, tarefa in enumerate(lista):
            print(f"{i + 1}. {tarefa}")

def remover_tarefa(lista, indice):
    if not lista:
        print("A lista de tarefas está vazia.")
    elif indice < 0 or indice >= len(lista):
        print("Índice inválido.")
    else:
        tarefa_removida = lista.pop(indice)
        print(f"Tarefa '{tarefa_removida}' removida com sucesso!")

def main():
    lista_tarefas = []

    while True:
        print("\nMenu:")
        print("1. Adicionar tarefa")
        print("2. Visualizar tarefas")
        print("3. Remover tarefa")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            tarefa = input("Digite a tarefa a ser adicionada: ")
            adicionar_tarefa(lista_tarefas, tarefa)
        elif escolha == 2:
            visualizar_tarefas(lista_tarefas)
        elif escolha == 3:
            indice = int(input("Digite o índice da tarefa a ser removida: "))
            remover_tarefa(lista_tarefas, indice)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
