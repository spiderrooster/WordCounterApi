/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class WordCounter {public static class __CLR4_4_1qql2zc5p1g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0061\u0074\u0061\u005c\u005c\u0063\u006f\u0064\u0065\u005c\u005c\u0057\u006f\u0072\u0064\u0043\u006f\u0075\u006e\u0074\u0065\u0072\u0041\u0070\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652137747612L,8589935092L,102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger(WordCounter.class);
    private int letterCount = 0;
    private int wordCount = 0;
    private double average = 0.0;
    private final Map<Integer, Integer> lengthsOfWords = new HashMap<>();

    public int getLetterCount() {try{__CLR4_4_1qql2zc5p1g.R.inc(26);
        __CLR4_4_1qql2zc5p1g.R.inc(27);return letterCount;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    public int getWordCount() {try{__CLR4_4_1qql2zc5p1g.R.inc(28);
        __CLR4_4_1qql2zc5p1g.R.inc(29);return wordCount;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    public double getAverage() {try{__CLR4_4_1qql2zc5p1g.R.inc(30);
        __CLR4_4_1qql2zc5p1g.R.inc(31);return average;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    public Map<Integer, Integer> getLengthsOfWords() {try{__CLR4_4_1qql2zc5p1g.R.inc(32);
        __CLR4_4_1qql2zc5p1g.R.inc(33);return lengthsOfWords;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    public void readInputStream(InputStream inputStream) throws IOException {try{__CLR4_4_1qql2zc5p1g.R.inc(34);
        __CLR4_4_1qql2zc5p1g.R.inc(35);reset();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1qql2zc5p1g.R.inc(36);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1qql2zc5p1g.R.inc(37);}};BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            __CLR4_4_1qql2zc5p1g.R.inc(38);while ((((reader.ready())&&(__CLR4_4_1qql2zc5p1g.R.iget(39)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(40)==0&false))) {{
                __CLR4_4_1qql2zc5p1g.R.inc(41);String trimmedLine = trimString(reader.readLine());
                __CLR4_4_1qql2zc5p1g.R.inc(42);List<String> split = splitString(trimmedLine, " ");
                __CLR4_4_1qql2zc5p1g.R.inc(43);processSplitElements(split);
            }
        }} catch (IOException e) {
            __CLR4_4_1qql2zc5p1g.R.inc(44);LOGGER.error("Unable to create BufferedReader", e);
            __CLR4_4_1qql2zc5p1g.R.inc(45);throw new IOException(e);
        }
        __CLR4_4_1qql2zc5p1g.R.inc(46);average = averageLength(letterCount, wordCount);
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    private void processSplitElements(List<String> split) {try{__CLR4_4_1qql2zc5p1g.R.inc(47);
        __CLR4_4_1qql2zc5p1g.R.inc(48);for (String element : split) {{
            __CLR4_4_1qql2zc5p1g.R.inc(49);int elementLength = element.length();
            __CLR4_4_1qql2zc5p1g.R.inc(50);if ((((elementLength > 0)&&(__CLR4_4_1qql2zc5p1g.R.iget(51)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(52)==0&false))) {{
                __CLR4_4_1qql2zc5p1g.R.inc(53);wordCount++;
                __CLR4_4_1qql2zc5p1g.R.inc(54);letterCount += elementLength;
                __CLR4_4_1qql2zc5p1g.R.inc(55);lengthsOfWords.put(elementLength, (lengthsOfWords.getOrDefault(elementLength, 0) + 1));
            }
        }}
    }}finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}


    private int maxLength(List<Integer> listToMax) {try{__CLR4_4_1qql2zc5p1g.R.inc(56);
        __CLR4_4_1qql2zc5p1g.R.inc(57);return listToMax.stream().mapToInt(__CLR4_4_1qql2zc5p1g.lambdaInc(58,l -> l,59)).max().orElse(0);
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    private String trimString(String toTrim) {try{__CLR4_4_1qql2zc5p1g.R.inc(60);
        __CLR4_4_1qql2zc5p1g.R.inc(61);toTrim = toTrim.replaceAll("\\.", " ");
        __CLR4_4_1qql2zc5p1g.R.inc(62);toTrim = toTrim.replaceAll("\\s+", " ");
        __CLR4_4_1qql2zc5p1g.R.inc(63);return toTrim;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    private List<String> splitString(String toSplit, String regex) {try{__CLR4_4_1qql2zc5p1g.R.inc(64);
        __CLR4_4_1qql2zc5p1g.R.inc(65);return Arrays.asList(toSplit.split(regex));
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    private double averageLength(int sum, int total) {try{__CLR4_4_1qql2zc5p1g.R.inc(66);
        __CLR4_4_1qql2zc5p1g.R.inc(67);return sum / (double) total;
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    private void reset() {try{__CLR4_4_1qql2zc5p1g.R.inc(68);
        __CLR4_4_1qql2zc5p1g.R.inc(69);letterCount = 0;
        __CLR4_4_1qql2zc5p1g.R.inc(70);wordCount = 0;
        __CLR4_4_1qql2zc5p1g.R.inc(71);average = 0.0;
        __CLR4_4_1qql2zc5p1g.R.inc(72);lengthsOfWords.clear();
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}

    public void printInfo() {try{__CLR4_4_1qql2zc5p1g.R.inc(73);
        __CLR4_4_1qql2zc5p1g.R.inc(74);LOGGER.info("Word Count = {}", getWordCount());
        __CLR4_4_1qql2zc5p1g.R.inc(75);LOGGER.info("Letter Count {}", getLetterCount());
        __CLR4_4_1qql2zc5p1g.R.inc(76);LOGGER.info("Average word length {}", String.format("%.03f", getAverage()));

        __CLR4_4_1qql2zc5p1g.R.inc(77);for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {{
            __CLR4_4_1qql2zc5p1g.R.inc(78);LOGGER.info("Number of words of length {} is {}", entry.getKey(), entry.getValue());
        }

        }__CLR4_4_1qql2zc5p1g.R.inc(79);final Map<Integer, Integer> maxFrequencyMap = new HashMap<>();
        __CLR4_4_1qql2zc5p1g.R.inc(80);int maxFrequency = maxLength(new ArrayList<>(getLengthsOfWords().values()));
        __CLR4_4_1qql2zc5p1g.R.inc(81);for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {{
            __CLR4_4_1qql2zc5p1g.R.inc(82);if ((((entry.getValue() == maxFrequency)&&(__CLR4_4_1qql2zc5p1g.R.iget(83)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(84)==0&false))) {{
                __CLR4_4_1qql2zc5p1g.R.inc(85);maxFrequencyMap.put(entry.getKey(), entry.getValue());
            }
        }}

        }__CLR4_4_1qql2zc5p1g.R.inc(86);StringBuilder frequencyBuilder = new StringBuilder();
        __CLR4_4_1qql2zc5p1g.R.inc(87);Iterator<Map.Entry<Integer, Integer>> mapIterator = maxFrequencyMap.entrySet().iterator();
        __CLR4_4_1qql2zc5p1g.R.inc(88);if ((((maxFrequencyMap.size() == 1)&&(__CLR4_4_1qql2zc5p1g.R.iget(89)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(90)==0&false))) {{
            __CLR4_4_1qql2zc5p1g.R.inc(91);frequencyBuilder.append("The most frequently occurring word length is ")
                    .append(maxFrequency)
                    .append(" for word lengths of ").append(new ArrayList<>(maxFrequencyMap.values()).get(0));
        } }else {{
            __CLR4_4_1qql2zc5p1g.R.inc(92);frequencyBuilder.append("The most frequently occurring word length is ")
                    .append(maxFrequency)
                    .append(" for word lengths of ");
            __CLR4_4_1qql2zc5p1g.R.inc(93);while ((((mapIterator.hasNext())&&(__CLR4_4_1qql2zc5p1g.R.iget(94)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(95)==0&false))) {{
                __CLR4_4_1qql2zc5p1g.R.inc(96);frequencyBuilder.append(mapIterator.next().getKey());
                __CLR4_4_1qql2zc5p1g.R.inc(97);if ((((mapIterator.hasNext())&&(__CLR4_4_1qql2zc5p1g.R.iget(98)!=0|true))||(__CLR4_4_1qql2zc5p1g.R.iget(99)==0&false))) {{
                    __CLR4_4_1qql2zc5p1g.R.inc(100);frequencyBuilder.append(" & ");
                }
            }}
        }}
        }__CLR4_4_1qql2zc5p1g.R.inc(101);LOGGER.info(frequencyBuilder.toString());
    }finally{__CLR4_4_1qql2zc5p1g.R.flushNeeded();}}
}
