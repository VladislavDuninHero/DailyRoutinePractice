package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String label = "ababcbacadefegdehijhklij";

        List<Integer> labelsLength = partitionLabels(label);

        System.out.println(labelsLength);
    }

    private List<Integer> partitionLabels(String s) {
        String[] split = s.split("");

        Map<String, List<Integer>> labels = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            if (!labels.containsKey(split[i])) {
                labels.put(split[i], List.of(s.indexOf(split[i]), s.lastIndexOf(split[i])));
            }
        }

        System.out.println(labels);

        List<List<Integer>> mergedLabels = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : labels.entrySet()) {

            int start = entry.getValue().get(0);
            int end = entry.getValue().get(1);

            for (List<Integer> value : labels.values()) {
                if (value.get(0) > start && value.get(1) < end) {
                    start = value.get(0);
                    end = value.get(1);
                }
            }


            if (!mergedLabels.contains(List.of(start, end))) {
                mergedLabels.add(List.of(start, end));
            }
        }

        System.out.println(mergedLabels);

        return null;
    }
}
