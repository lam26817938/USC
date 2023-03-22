li $a0, 5
li $a1, 2
jal procedure
move $a0, $v0
li $v0,1
syscall
j bye

procedure:
addi $sp,$sp,-8 # push $s0,$t0,$t1 on stack
sw $t0, 0($sp)
sw $t1, 4($sp)

add $t1,$a0,$a1
addi $t0, $a0, -2
add $t1,$t1,$t0

add $v0, $t1, $zero # result

lw $t0, 0($sp) # restore $s0
lw $t1, 4($sp)
addi $sp, $sp, 8
jr $ra # return
bye:
