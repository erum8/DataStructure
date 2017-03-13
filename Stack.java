public class Stack{
private int maxsize;
private long[] StackArray;
private int top;
public Stack(int s)
maxsize=s;
stackArray=new long[maxsize];
top=-1;
}
public void push(long i){
StackArray[++top]=i;
}
public long pop(){
return StackArray[top--1];
}
public long peek(){
return StackArray[top];
}
public bolean is empty(){
return (top==-1);
public bolean isfull(){
return(top==maxsize-1);
}
public static void main(string[]args){
Stack theStack=new Stack(20);
theStack.push(20);
theStack.push(30);
theStack.push(40);
theStack.push(50);
theStack.push(60);
while(!theStack.isempty()){
long value=theStack.pop();
system.out.print(value);
system.out.print(" ");
}
system.out.println(" ");
}
}
