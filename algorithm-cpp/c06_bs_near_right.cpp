#include<iostream>
#include<vector>
using namespace std;

// 在已排序的数组arr上，找满足<=target的最右位置
int nearestRightIndex(vector<int> arr, int target)
{
    int left = 0;
    int right = arr.size() - 1;
    int ans = -1;

    while (left <= right)
    {
        int mid = left + ((right - left) >> 1);
        if (arr[mid] <= target)
        {
            ans = mid;
            left = mid + 1;
        } else 
        {
            right = mid - 1;
        }
    }

    return ans;
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};

    cout << nearestRightIndex(arr, 0) << endl;
    cout << nearestRightIndex(arr, 1) << endl;
    cout << nearestRightIndex(arr, 2) << endl;
    cout << nearestRightIndex(arr, 3) << endl;
    cout << nearestRightIndex(arr, 4) << endl;
    cout << nearestRightIndex(arr, 5) << endl;
    cout << nearestRightIndex(arr, 6) << endl;
}
