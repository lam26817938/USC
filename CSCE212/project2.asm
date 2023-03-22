.data
newLine:.asciiz "\n"
colon:.asciiz ": "
prompt1:.asciiz "Please input first word: "
prompt2:.asciiz "Please input second word: "
first:.space 50
second:.space 50
statement:.asciiz "The South Carolina Gamecocks football program represents the University of."
.text

la $a0,prompt1 # Prompt the user to enter the first string.
li $v0,4
syscall

li $v0, 8 # input string
la $a0, first
addi $a1, $zero, 50
syscall

la $a0,prompt2 # Prompt the user to enter the second string.
li $v0,4
syscall

li $v0, 8 # input string
la $a0, second
addi $a1, $zero, 50
syscall

#Process first word

addi $t4,$zero,0 
la $t0,statement 
la $t1,first 

loop1: 

lb $t2,($t0) 
lb $t3,($t1) 

beq $t3,'\n',counter1
beqz $t2,print1 

move $a0,$t2 
jal toupper
move $t2,$v0
 
move $a0,$t3 
jal toupper
move $t3,$v0 

bne $t2,$t3,next_char1 
addiu $t0,$t0,1 
addiu $t1,$t1,1

j loop1 

next_char1:

la $t1,first 
addiu $t0,$t0,1 

j loop1 

counter1:

addi $t4,$t4,1 
la $t1,first 

j loop1 

print1:

la $t0,first

L1:

lb $a0,($t0)
beq $a0,'\n',exitL1

jal toupper

move $a0,$v0
li $v0,11
syscall

addiu $t0,$t0,1

j L1

exitL1:

la $a0, colon
li $v0, 4
syscall

move $a0,$t4
li $v0,1
syscall 

la $a0,newLine
li $v0,4
syscall

# Process second word

addi $t4,$zero,0 
la $t0,statement 
la $t1,second  

loop2: 

lb $t2,($t0)
lb $t3,($t1) 

beq $t3,'\n',counter2
beqz $t2,print2 

move $a0,$t2 
jal toupper
move $t2,$v0 

move $a0,$t3 
jal toupper
move $t3,$v0

bne $t2,$t3,next_char2 
addiu $t0,$t0,1 
addiu $t1,$t1,1

j loop2

next_char2:

la $t1,second 
addiu $t0,$t0,1 

j loop2 

counter2:

addi $t4,$t4,1 
la $t1,second 
j loop2 

print2:

la $t0,second

L2:

lb $a0,($t0)
beq $a0,'\n',exitL2
jal toupper

move $a0,$v0
li $v0,11
syscall

addiu $t0,$t0,1

j L2

exitL2:

la $a0, colon
li $v0, 4
syscall

move $a0,$t4
li $v0,1
syscall 

#End
li $v0, 10 
syscall

# Return the upper case character
toupper: 

move $v0,$a0
blt $a0,'a',return
#bgt $a0,'z',return
addiu $v0,$a0,-32
return: jr $ra 

