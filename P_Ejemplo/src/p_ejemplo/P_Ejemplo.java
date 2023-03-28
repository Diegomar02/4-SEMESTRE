
#include <dos.h>
#include "stdafx.h"

int main() {
    short resultado;
    _asm{
        mov ax,2;
        mov bx,4;
        add ax,bx;
        mov resltado,ax;
    }
    printf("Resultado = %d",resultado);
    return 0;

}