/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @File: main
* @Descripcion:
*/

#include "A.h"
#include "B.h"
int main(){
  
  A *a = new A();
  a->foo();

  A *ab = new B();
  ab->foo();
  ab->goo();

  A *a2b = new B();
  a2b->foo();
  return 0;
}

