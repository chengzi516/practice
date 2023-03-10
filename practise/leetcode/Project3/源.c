#define _CRT_SECURE_NO_WARNINGS 1
int removeDuplicates(int* nums, int numsSize) {


    int fast = 0, slow = 0;//fast去找，slow来存
    while (fast < numsSize) {
        if (nums[fast] == nums[slow]) {
            ++fast;//相等则寻找不重复元素
        }
        else {
            ++slow;
            nums[slow] = nums[fast];
            ++fast;

        }
    }
    return slow + 1;
}
void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int end = m + n - 1;
    int end1 = m - 1;
    int end2 = n - 1;
    while (end1 >= 0 && end2 >= 0) {
        if (nums1[end1] > nums2[end2]) {
            nums1[end] = nums1[end1];
            end1--;
            end--;
        }
        else {
            nums1[end] = nums2[end2];
            end2--;
            end--;
        }
    }
    while (end2 >= 0) {
        nums1[end] = nums2[end2];
        end2--;
        end--;
    }



}