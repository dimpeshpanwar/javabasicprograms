#include<iostream>
using namespace std;
int main(){
	    int l,m,n,o;
	    int p;
	    cin>>p;
		l=0;
	    m=1;
	    cout<<l;
		cout<<" "<<m;
	    for(n=1;n<=p;n++){
		o=l+m;
		cout<<" "<<o;
		l=m;
		m=o;
		}

}
