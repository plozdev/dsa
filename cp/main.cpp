#include <bits/stdc++.h>
using namespace std;
string solve(int n, int a[]) {
    vector <int> v;
    for (int i=0;i<n-1;i++) {
        v.push_back((int)__gcd(a[i],a[i+1]));
    }
    for (int i=0;i<v.size()-1;i++) {
        if (v[i]>v[i+1]) return "NO";
    }
    return "YES";
}
//abcdefg
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
    int t; cin>>t;
    while (t--) {
        int n; cin>>n;
        int a[n];
        for (int i=0;i<n;i++) cin>>a[i];
        cout<<solve(n,a)<<'\n';
    }
    
    return 0;
}