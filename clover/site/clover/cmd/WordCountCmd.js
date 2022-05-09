var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":0,"methods":[{"el":27,"sc":5,"sl":24},{"el":32,"sc":5,"sl":29},{"el":61,"sc":5,"sl":34},{"el":69,"sc":5,"sl":63}],"name":"WordCountCmd","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":34}],"name":"fileExistIsRegularFileTest","pass":true,"statements":[{"sl":37},{"sl":39},{"sl":41},{"sl":42},{"sl":43}]},"test_4":{"methods":[{"sl":34}],"name":"fileDoesntExistTest","pass":true,"statements":[{"sl":37},{"sl":52},{"sl":54}]},"test_5":{"methods":[{"sl":34}],"name":"fileExistIsDirectoryTest","pass":true,"statements":[{"sl":37},{"sl":52},{"sl":56},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5, 2, 4], [], [], [5, 2, 4], [], [2], [], [2], [2], [2], [], [], [], [], [], [], [], [], [5, 4], [], [4], [], [5], [], [5], [], [], [], [], [], [], [], [], [], [], [], []]
