var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":102,"methods":[{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"IoUtils","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":19}],"name":"createInputStreamTest","pass":true,"statements":[{"sl":20}]},"test_10":{"methods":[{"sl":15}],"name":"isRegularFileTrueTest","pass":true,"statements":[{"sl":16}]},"test_11":{"methods":[{"sl":15}],"name":"isRegularFileFalseTest","pass":true,"statements":[{"sl":16}]},"test_3":{"methods":[{"sl":11}],"name":"doesExistTrueTest","pass":true,"statements":[{"sl":12}]},"test_7":{"methods":[{"sl":11}],"name":"doesExistFalseTest","pass":true,"statements":[{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3, 7], [3, 7], [], [], [11, 10], [11, 10], [], [], [0], [0], [], []]
