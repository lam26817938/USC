#Lian Liao Project4
.data 
a: .float 0.1
b: .float 0.2
c: .float 0.3
d : .float 0.4
str1: .asciiz "Enter 4 integers for a,b,c,d respectively:\n"
F: .asciiz "f= "
line: .asciiz "\n"
G: .asciiz "g= "
.text 
# get A,B,C,D
li $v0, 4
la $a0, str1       #promt
syscall

li $v0, 5
syscall
move $s0,$v0       #s0=A
li $v0, 5
syscall
move $s1,$v0        #s1=B
li $v0, 5
syscall
move $s2,$v0        #s2=C
li $v0, 5
syscall
move $s3,$v0        #s3=D

#f
add $a0,$zero,$s0
add $a1,$zero,$s0
jal multiplication
add $a0,$zero,$v0
add $a1,$zero,$s0
jal multiplication
add $a0,$zero,$v0
add $a1,$zero,$s0
jal multiplication
move $t2,$v0      # A^4

add $a0,$zero,$s1
add $a1,$zero,$s1
jal multiplication
move $t5,$v0        #B^2

add $a0,$zero,$v0
add $a1,$zero,$s1
jal multiplication
move $t3,$v0       # B^3

add $a0,$zero,$s2
add $a1,$zero,$s2
jal multiplication
move $t4,$v0      # C^2

lwc1 $f12,a
add $a1,$zero,$t2
jal multiplication
mov.s $f2,$f1      #0.1*A^4

lwc1 $f12,b
add $a1,$zero,$t3
jal multiplication
mov.s $f3,$f1     #0.2*B^3

lwc1 $f12,c
add $a1,$zero,$t4
jal multiplication
mov.s $f4,$f1       #0.3*C^2

lwc1 $f12,d
add $a1,$zero,$s3
jal multiplication
mov.s $f5,$f1      #0.4*D

sub.s $f12,$f12,$f12
sub.s $f12,$f2,$f3    #0.1*A^4-0.2*B^3
add.s $f12,$f12,$f4   #0.1*A^4-0.2*B^3+0.3*C^2
sub.s $f12,$f12,$f5   #0.1*A^4-0.2*B^3+0.3*C^2-0.4*D

la $a0,F     #print f
li $v0,4
syscall 

li $v0,2
syscall 

la $a0,line     #print line
li $v0,4
syscall 

la $a0,G     #print g
li $v0,4
syscall 

#g
add $a0,$zero,$s3
add $a1,$zero,$s3
jal multiplication
add $a0,$zero,$v0
add $a1,$zero,$s3
jal multiplication
move $t6,$v0      #D^3

add $a0,$zero,$t5
add $a1,$zero,$s0
jal multiplication
move $t2,$v0     #AB^2

add $a0,$zero,$t4
add $a1,$zero,$t6
jal multiplication
move $t3,$v0     #C^2D^3

lwc1 $f12,a
add $a1,$zero,$t2
jal multiplication
mov.s $f2,$f1     #0.1* AB^2

lwc1 $f12,b
add $a1,$zero,$t3
jal multiplication
mov.s $f3,$f1     #0.2*C^2D^3

sub.s $f12,$f12,$f12   
add.s $f12,$f2,$f3    #=g

li $v0,2      #print g
syscall 

#End
li $v0, 10
syscall

#Multiplication procedures
multiplication:
add $t0,$zero,$zero     #i
add $t1,$zero,$zero   #result
sub.s $f1,$f1,$f1      #float result
loop:
beq $t0,$a1,return
addi $t0,$t0,1
add $t1,$t1,$a0      #int
add.s $f1,$f1,$f12    #float
j loop
return: 
move $v0,$t1
jr $ra 
