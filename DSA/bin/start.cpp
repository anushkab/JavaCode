#include <iostream> //headerfile
#include <cstudio>
#include <vector>
//#include<bits/stdc++
using namespace std;

int arr[100];
vector<int> adj[100];//vector of ints
vector<vector<int> > jdj;
void disPlay()
{for(int j=1;j<=x;j++)
  {
  for(int =0;i<adj[0].size);i++)
  {
    cout<<adj[0][i]<<"";
  }
}
}
int main()//imperative to include
{

int n;
int m;
cin>>n;
cin>>m;
adj.resize(n);
int x;
int y;
for(int k=1;k<m+1;k++)
{
cin>>x>>y;
adj[x].push_back(y);

}
disPlay();
cout<<endl;
return 0;

/*cout<<"HEllo Worlf!"<<4<<"\n"";'
printf("%s\n %d \n","Hello World",4);
int a;
cin>>a;
return 0;*/
}
