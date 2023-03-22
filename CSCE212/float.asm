.data
a : .float 0.0
.text
addi $s0,$s0,10
lwc1 $f0,a
loop:
bgt $s0,$zero,L1
j exit
L1:
sll $t1,$s1,2
add $t1,$t1,$s1
lwc1 $f1,0($t1)
mul.s $f0,$f0,$f1
addi,$s0,$s0,-1
j loop
exit:
