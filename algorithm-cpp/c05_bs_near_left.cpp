#include<iostream>
#include<vector>
using namespace std;
// 在已排序的数组arr上, 找满足>=target的最左位置

int nearestLeftIndex(vector<int> &arr, int target)
{
    int left = 0;
    int right = arr.size() - 1;
    int ans = -1;
    while (left <= right)
    {
        int mid = left + ((right - left) >> 1);
        if (arr[mid] >= target)
        {
            ans = mid;
            right = mid - 1;
        } else 
        {
            left = mid + 1;
        }
    }

    return ans;
}


int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};

    cout << nearestLeftIndex(arr, 0) << endl;
    cout << nearestLeftIndex(arr, 1) << endl;
    cout << nearestLeftIndex(arr, 2) << endl;
    cout << nearestLeftIndex(arr, 3) << endl;
    cout << nearestLeftIndex(arr, 4) << endl;
    cout << nearestLeftIndex(arr, 5) << endl;
    cout << nearestLeftIndex(arr, 6) << endl;

}
