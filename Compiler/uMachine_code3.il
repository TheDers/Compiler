MOV SP D0
RD 6(d0)
RD 7(d0)
PUSH #6
PUSH #3
DIVS
PUSH #2
DIVS
PUSH #1
DIVS
PUSH #1
ADDS
POP 2(d0)
PUSH #10
PUSH #11
MODS
PUSH #12
MODS
PUSH #13
MODS
PUSH #14
MODS
PUSH #15
MODS
PUSH #16
MODS
POP 4(d0)
PUSH #6
NEGS
POP 5(d0)
PUSH 0(d0)
WRTS
PUSH 2(d0)
WRTS
PUSH 4(d0)
WRTS
PUSH 5(d0)
WRTS
PUSH 6(d0)
PUSH 6(d0)
MULS
PUSH 6(d0)
MULS
PUSH 6(d0)
MULS
PUSH 6(d0)
MULS
PUSH 6(d0)
MULS
PUSH 7(d0)
MULS
PUSH 7(d0)
MULS
PUSH 7(d0)
MULS
PUSH 7(d0)
MULS
PUSH 7(d0)
MULS
PUSH #2
MULS
WRTS
PUSH 6(d0)
WRTS
HLT
