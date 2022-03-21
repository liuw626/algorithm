#include<iostream>
#include<vector>
using namespace std;

void insertionSort(vector<int> &arr);
void swap(vector<int> &arr, int i, int j);

int main()
{
    vector<int> vec = {5, 3, 7, 2, 9};
    insertionSort(vec);
    for (int i=0; i<vec.size(); i++) {
        cout << vec[i] << " ";
    }
    cout << endl;
}

void insertionSort(vector<int> &arr)
{
    for (int i=1; i<arr.size(); i++)
    {
        int index = i;
        while (index > 0 && arr[index] < arr[index-1])
        {
            swap(arr, index, index - 1);
            index--;
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