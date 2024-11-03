package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//You are given a 0-indexed integer array batteryPercentages having length n, denoting the battery percentages of n 0-indexed devices.
//
//Your task is to test each device i in order from 0 to n - 1, by performing the following test operations:
//
//If batteryPercentages[i] is greater than 0:
//Increment the count of tested devices.
//Decrease the battery percentage of all devices with indices j in the range [i + 1, n - 1] by 1, ensuring their battery percentage never goes below 0, i.e, batteryPercentages[j] = max(0, batteryPercentages[j] - 1).
//Move to the next device.
//Otherwise, move to the next device without performing any test.
//Return an integer denoting the number of devices that will be tested after performing the test operations in order.
//
//
//
//Example 1:
//
//Input: batteryPercentages = [1,1,2,1,3]
//Output: 3
//Explanation: Performing the test operations in order starting from device 0:
//At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
//At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
//At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
//At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
//At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same.
//So, the answer is 3.

public class CountTestedDevicesAfterTestOperations implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] batteryPercentages = {1, 1, 2, 1, 3};

        int countOfTestedDevices = countTestedDevices(batteryPercentages);

        System.out.println(countOfTestedDevices);
    }

    //Runtime: beats 14% of other solutions.
    //Memory: beats 44% of other solutions.
    private int countTestedDevices(int[] batteryPercentages) {
        int countOfTestedDevices = 0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                countOfTestedDevices++;
                decreaseBatteryPercentages(batteryPercentages);
            }
        }

        return countOfTestedDevices;
    }

    private void decreaseBatteryPercentages(int[] batteryPercentages) {
        for (int j = batteryPercentages.length - 1; j >= 0; j--) {
            if (batteryPercentages[j] > 0) {
                batteryPercentages[j]--;
            }
        }
    }
}