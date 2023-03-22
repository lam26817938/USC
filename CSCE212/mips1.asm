.data 
str1: .asciiz "ID: U85898687\nEnter 4 integers for a,b,c,d respectively:\n"
str2: .asciiz "f_ten = "
str3: .asciiz "\nf_two = "
str4: .asciiz "\ng_ten = "
str5: .asciiz "\ng_two = "
str6: .asciiz "\nh_quotient = "
str7: .asciiz "\nh_remainder = "
.text 
li $v0, 4
la $a0, str1
syscall

li $v0, 5
syscall
move $t0,$v0
li $v0, 5
syscall
move $t1,$v0
li $v0, 5
syscall
move $t2,$v0
li $v0, 5
syscall
move $t3,$v0

#8
addi $t4,$zero,0
move $s0,$t0
loop0:
addi $s4,$s0,0
addi $t5,$zero,1
addi $t4,$t4,1
blt $t4,8,loop1
j out0

loop1:
add $s0,$s0,$s4
addi $t5,$t5,1
blt $t5,$t0,loop1
j loop0

out0:

#5
addi $t4,$zero,0
move $s1,$t1
loop2:
addi $s5,$s1,0
addi $t5,$zero,1
addi $t4,$t4,1
blt $t4,5,loop3
j out1

loop3:
add $s1,$s1,$s5
addi $t5,$t5,1
blt $t5,$t1,loop3
j loop2

out1:

#88
addi $t4,$zero,0
move $s2,$t2
loop22:
addi $s6,$s2,0
addi $t5,$zero,1
addi $t4,$t4,1
blt $t4,8,loop33
j out11

loop33:
add $s2,$s2,$s6
addi $t5,$t5,1
blt $t5,$t2,loop33
j loop22

out11:

#9
addi $t4,$zero,0
move $s3,$t3
loop4:
addi $s7,$s3,0
addi $t5,$zero,1
addi $t4,$t4,1
blt $t4,9,loop5
j out2

loop5:
add $s3,$s3,$s7
addi $t5,$t5,1
blt $t5,$t3,loop5
j loop4

out2:

beq $t0,1,set
j no
set: addi $s0,$zero,1
no:
beq $t1,1,set1
j no1
set1: addi $s1,$zero,1
no1:
beq $t2,1,set2
j no2
set2: addi $s2,$zero,1
no2:
beq $t3,1,set3
j no3
set3: addi $s3,$zero,1
no3:

#fg
add $t6,$s0,$s1
add $t7,$s2,$s3

li $v0, 4
la $a0, str2
syscall
li $v0, 1
move $a0,$t6
syscall
li $v0, 4
la $a0, str3
syscall
li $v0, 35
move $a0,$t6
syscall

li $v0, 4
la $a0, str4
syscall
li $v0, 1
move $a0,$t7
syscall
li $v0, 4
la $a0, str5
syscall
li $v0, 35
move $a0,$t7
syscall

addi $t0,$zero,0
add $t1,$zero,$t6
blt $t6,$t7,bye
Q:
bge $t6,$t7,QQ
j bye
QQ:
sub $t6,$t6,$t7
addi $t0,$t0,1
add $t1,$zero,$t6
j Q
bye:

li $v0, 4
la $a0, str6
syscall

li $v0, 1
move $a0,$t0
syscall

li $v0, 4
la $a0, str7
syscall

li $v0, 1
move $a0,$t1
syscall

li $v0, 10
syscall
