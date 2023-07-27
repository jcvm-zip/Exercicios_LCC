def acessar_pagina(historico, pagina):
    historico.append(pagina)
    print(f"Página '{pagina}' acessada!")

def voltar_pagina(historico):
    if not historico:
        print("O histórico está vazio.")
    else:
        pagina_voltada = historico.pop()
        print(f"Voltando para a página '{pagina_voltada}'.")

def visualizar_historico(historico):
    if not historico:
        print("O histórico está vazio.")
    else:
        print("Histórico de páginas acessadas:")
        for i, pagina in enumerate(historico[::-1]):
            print(f"{i + 1}. {pagina}")

def main():
    historico_paginas = []

    while True:
        print("\nMenu:")
        print("1. Acessar página")
        print("2. Voltar página")
        print("3. Visualizar histórico de páginas acessadas")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            pagina = input("Digite o nome da página: ")
            acessar_pagina(historico_paginas, pagina)
        elif escolha == 2:
            voltar_pagina(historico_paginas)
        elif escolha == 3:
            visualizar_historico(historico_paginas)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
