#include<iostream>
#include<vector>
using namespace std;

void bubbleSort(vector<int> &arr);
void swap(vector<int> &arr, int i, int j);

int main()
{
    vector<int> vec = {5, 3, 7, 2, 9};
    bubbleSort(vec);
    for (int i=0; i<vec.size(); i++) {
        cout << vec[i] << " ";
    }
    cout << endl;
}

void bubbleSort(vector<int> &arr)
{
    for (int i=0; i<arr.size(); i++)
    {
        for (int j=0; j<arr.size()-i-1; j++) {
            if (arr[j] > arr[j+1])
            {
                swap(arr, j, j+1);
            }
        }
    }
}

void swap(vector<int> &arr, int i, int j)
{
    if (i == j)
    {
        return;
    }
    arr[i] = arr[i] ^ arr[j];
    arr[j] = arr[i] ^ arr[j];
    arr[i] = arr[i] ^ arr[j];
}