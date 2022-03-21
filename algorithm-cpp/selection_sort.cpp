#include<iostream>
#include<vector>
using namespace std;

void selectionSort(vector<int> &vec);
void swap(vector<int> &vec, int i, int j);

int main()
{
    vector<int> vec = {5, 3, 7, 2, 9};
    selectionSort(vec);
    for (int i=0; i<vec.size(); i++) {
        cout << vec[i] << " ";
    }
    cout << endl;
}

void selectionSort(vector<int> &vec)
{
    for (int i=0; i<vec.size()-1; i++) {
        int minIndex = i;
        for (int j=i+1; j<vec.size(); j++) {
            if (vec[j] < vec[minIndex]) {
                minIndex = j;
            }
        }
        swap(vec, i, minIndex);
    }
}

void swap(vector<int> &vec, int i, int j)
{
    if (i == j) 
    {
        return;
    }
    int temp = vec[i];
    vec[i] = vec[j];
    vec[j] = temp;
}