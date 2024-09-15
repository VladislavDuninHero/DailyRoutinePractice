package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
//
//
//
//Example 1:
//
//Input: g = [1,2,3], s = [1,1]
//Output: 1
//Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
//And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
//You need to output 1.

public class AssignCookies implements AlgosActionDispatcher {
    @Override
    public void execute() {
        int[] sites = {494, 324, 293, 199, 164, 32, 428, 155, 229, 452, 99, 433, 189, 47, 15, 37, 199, 81, 16, 110, 318, 253, 79, 31, 92, 337, 251, 448, 463, 178, 418, 399, 466, 284, 311, 403, 337, 89, 322, 405, 507, 367, 278, 173, 366, 399, 145, 125, 444, 505, 38, 181, 349, 194, 253, 521, 86, 353, 493, 514, 385, 273, 128, 526, 449, 420, 478, 184, 361, 444, 392, 359, 463, 395, 275, 436, 378, 363, 242, 396, 32, 140, 321, 137, 207, 130, 179, 185, 402, 160, 332, 57, 34, 80, 99, 497, 479, 317, 25, 173, 64, 314, 276, 504, 354, 430, 261, 247, 40, 266, 55, 301, 243, 184, 181, 313, 102, 487, 132, 478, 185, 223, 117, 141, 333, 353, 403, 184, 209, 188, 426, 8, 297, 314, 503, 143, 195, 513, 279, 54, 399, 17, 201, 281, 346, 122, 141, 183, 369, 330, 469, 56, 292, 65, 447, 120, 414, 279, 515};
        int[] cookies = {383, 384, 347, 280, 433, 481, 462, 56, 487, 9, 162, 245, 485, 90, 380, 257, 364, 383, 451, 146, 48, 6, 366, 333, 490, 319, 438, 147, 212, 156, 296, 298, 241, 239, 36, 13, 187, 475, 154, 89, 399, 301, 175, 460, 143, 209, 237, 49, 5, 341, 115, 427, 92, 49, 304, 401, 283, 277, 251, 464, 171, 217, 369, 244, 495, 295, 422, 408, 20, 319, 113, 488, 27, 452, 302, 203, 373, 304, 160, 521, 92, 378, 317, 491, 232, 520, 182, 483, 270, 423, 298, 433, 264, 226, 283, 389, 23, 323, 364, 343, 60, 351, 282, 44, 306, 436, 273, 19, 330, 217, 89, 163, 445, 291, 439, 506, 107, 228, 436, 438, 16, 133, 197, 42, 145, 450, 100, 341, 98, 248, 94, 10, 30, 332, 518, 315, 111, 67, 85, 131, 296, 489, 32, 54, 249, 127, 211, 177, 328, 216, 511, 177, 185, 463, 386, 163, 43, 245, 435, 163, 7};

        int сontentChildren = findContentChildren(sites, cookies);
        System.out.println(сontentChildren);
    }

    //Runtime: beats 5% of other solutions runtime.
    //Memory: beats 8% of other solutions memory.
    private int findContentChildren(int[] sites, int[] cookies) {
        int countOfChildren = 0;

        Arrays.sort(sites);
        Arrays.sort(cookies);

        for (int i = 0; i < sites.length; i++) {
            for (int j = 0; j < cookies.length; j++) {
                if (cookies[j] >= sites[i]) {
                    sites[i] = 0;
                    cookies[j] = 0;
                    countOfChildren++;
                    break;
                }
            }
        }

        return countOfChildren;
    }
}
