#include<stdio.h>
int fib(int);
int fib(int n)
{
	if(n==1)
	return 0;
	if(n==2)
	return 1;
	return fib(n-2)+fib(n-1);
}
void main()
{
	int n,res;
	printf("enter value");
	scanf("%d",&n);
	res=fib(n);
	printf("%d",res);
}
