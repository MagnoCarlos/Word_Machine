# Word_Machine

A word machine is a system that performs a sequence of simple operations on a stack of integers. Initially the stack is empty.
The sequence of operations is given as a string. Operations are separated by single spaces. The following operations may be specified:

- An integer X(fom 0 to 2^20 -1): the machine pushes X onto the stack;
- "POP": the machine removes the topmost number from the stack;
- "DUP": the machine pushes a duplicate of the topmost number onto the stack;
- "-": the machine pops the two topmost elements from the stack, subtracts the second one from the first(topmost) one and pushes the difference onto the stack;
- "+": the machine pops the two topmost elements from the stack, adds them together and pushes the difference onto the stack;
