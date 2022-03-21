#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int bsExist(vector<int> &arr, int target);

int main()
{
    vector<int> arr = {7, 3, 5, 2, 9};
    sort(arr.begin(), arr.end());
    // {2, 3, 5, 7, 9};

    cout << bsExist(arr, 2) << endl;
    cout << bsExist(arr, 3) << endl;
    cout << bsExist(arr, 4) << endl;
    cout << bsExist(arr, 5) << endl;
    cout << bsExist(arr, 7) << endl;
    cout << bsExist(arr, 9) << endl;
    // int arr[5] = {7, 3, 5, 2, 9};
    // cout << sizeof(arr) / sizeof(int) << endl;
    
}

int bsExist(vector<int> &arr, int target)
{
    int left = 0;
    int right = arr.size() - 1;
    while (left <= right)
    {
        int mid = left + ((right - left) >> 1);
        if (arr[mid] == target)
        {
            return mid;
        } else if (arr[mid] > target)
        {
            right = mid - 1;
        } else if (arr[mid] < target)
        {
            left = mid + 1;
        }
    }

    return -1;
}
