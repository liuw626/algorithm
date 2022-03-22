#include<iostream>
#include<vector>
using namespace std;
/**
 * 局部最小值问题: 在一个先递减后递增的数组中找到极小值点
 */
int get_less_index(vector<int> arr)
{
    int left = 0;
    int right = arr.size() - 1;
    while (left <= right)
    {
        int mid = left + ((right - left) >> 1);
        if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
        {
            return mid;
        }
        if (mid == 0 || arr[mid-1] > arr[mid])
        {
            left = mid + 1;
        } else if (mid == arr.size() - 1 || arr[mid] < arr[mid + 1])
        {
            right = mid - 1;
        }
    }
    return -1;
}


int main()
{
    vector<int> arr = {9, 8, 7, 8, 9, 10, 11};
    cout << get_less_index(arr) << endl;
}