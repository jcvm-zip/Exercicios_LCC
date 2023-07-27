int main() {
    int valor1, valor2, valor3;

    printf("\nDigite tres valores: ");
    scanf("\n%d%d%d", &valor1, &valor2, &valor3);

    if(valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1)
    {
        printf("Os 3 lados formam um triangulo!\n");
    }
    else
        printf("Os 3 lados NAO formam um trinagulo!\n");
}
