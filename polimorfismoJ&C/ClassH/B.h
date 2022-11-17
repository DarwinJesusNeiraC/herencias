#ifndef B_H
#define B_H
#include "A.h"
class B: public A{
  public:
    virtual void foo(){
      cout<<"B"<<endl;
    }
    virtual void goo(){
      cout<<"goo B"<<endl;
    }
};
#endif
