def adicionar_documento(pasta, documento):
    pasta.append(documento)
    print(f"Documento '{documento}' adicionado à pasta!")

def remover_documento(pasta):
    if not pasta:
        print("A pasta está vazia.")
    else:
        documento_removido = pasta.pop()
        print(f"Documento '{documento_removido}' removido!")

def visualizar_documentos(pasta):
    if not pasta:
        print("A pasta está vazia.")
    else:
        print("Documentos na pasta:")
        for i, documento in enumerate(pasta[::-1]):
            print(f"{i + 1}. {documento}")

def main():
    pasta_documentos = []

    while True:
        print("\nMenu:")
        print("1. Adicionar documento")
        print("2. Remover documento")
        print("3. Visualizar documentos na pasta")
        print("4. Sair")

        escolha = int(input("Digite o número da opção desejada: "))

        if escolha == 1:
            documento = input("Digite o nome do documento: ")
            adicionar_documento(pasta_documentos, documento)
        elif escolha == 2:
            remover_documento(pasta_documentos)
        elif escolha == 3:
            visualizar_documentos(pasta_documentos)
        elif escolha == 4:
            print("Saindo...")
            break
        else:
            print("Opção inválida.")

if __name__ == "__main__":
    main()
