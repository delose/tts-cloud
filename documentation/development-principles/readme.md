# Software Development Principles

## uh oh, here comes the REALLY biased part

### WARNING: if you are not familiar with concepts in Java and Spring, please don't proceed

### Shared Code
- shared components are expected to be easily extensible, flexible, maintainable, and easy to use

### DOs for Class Utilization
- strongly typed components that be used by developers in the code, through class composition
- implementation of strongly typed interfaces that are utilized by common component
- implementation and provision of Optional strongly typed interfaces that can override the behaviour of or entirely replace common components

## DON'Ts for implementation approaches for common components
- provision of abstract "base lasses" in a separately build and versioned component to achieve code re-use
- use of static methods in common components that may be mocked or have their behavious altered in test

*** 
