package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Link: https://leetcode.com/problems/subdomain-visit-count/description/
//Description:
//A website domain "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com" and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
//
//A count-paired domain is a domain that has one of the two formats "rep d1.d2.d3" or "rep d1.d2" where rep is the number of visits to the domain and d1.d2.d3 is the domain itself.
//
//For example, "9001 discuss.leetcode.com" is a count-paired domain that indicates that discuss.leetcode.com was visited 9001 times.
//Given an array of count-paired domains cpdomains, return an array of the count-paired domains of each subdomain in the input. You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: cpdomains = ["9001 discuss.leetcode.com"]
//Output: ["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
//Explanation: We only have one website domain: "discuss.leetcode.com".
//As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.

public class SubdomainVisitCount implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        List<String> subdomainsVisit = subdomainVisits(cpdomains);

        System.out.println(subdomainsVisit);
    }

    //Runtime: beats 75% of other solutions.
    //Memory: beats 51% of other solutions.
    //Time complexity: O(n * m)
    private List<String> subdomainVisits(String[] cpdomains) {

        List<String> subdomainVisits = new ArrayList<>();
        Map<String, Integer> domains = new HashMap<>();

        for (String domain : cpdomains) {
            String[] splitDomain = domain.split(" ");
            int countOfVisits = Integer.parseInt(splitDomain[0]);
            int length = splitDomain[1].length();
            String domainKey = splitDomain[1];

            domains.put(domainKey, domains.getOrDefault(domainKey, 0) + countOfVisits);

            for (int i = 0; i < length; i++) {
                if (domainKey.charAt(i) == '.') {
                    String sub = domainKey.substring(i + 1, length);
                    domains.put(sub, domains.getOrDefault(sub, 0) + countOfVisits);
                }
            }
        }

        for (String key : domains.keySet()) {
            subdomainVisits.add(domains.get(key) + " " + key);
        }

        return subdomainVisits;
    }
}
