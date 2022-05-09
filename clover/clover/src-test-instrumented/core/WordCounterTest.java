/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class WordCounterTest
{static class __CLR4_4_14n4nl2zc5p5y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0061\u0074\u0061\u005c\u005c\u0063\u006f\u0064\u0065\u005c\u005c\u0057\u006f\u0072\u0064\u0043\u006f\u0075\u006e\u0074\u0065\u0072\u0041\u0070\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652137748055L,8589935092L,266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final List<LogEvent> capturedEvents = new ArrayList<>();
    @Mock
    private       Appender       mockAppender;
    private       Logger         logger;

    private WordCounter wcts = new WordCounter();

    @Before
    public void setup()
    {try{__CLR4_4_14n4nl2zc5p5y.R.inc(167);
        __CLR4_4_14n4nl2zc5p5y.R.inc(168);wcts = new WordCounter();

        //Given
        //Custom log Appender to get log messages for Log4j2
        __CLR4_4_14n4nl2zc5p5y.R.inc(169);when( mockAppender.getName() ).thenReturn( "MockAppender" );
        __CLR4_4_14n4nl2zc5p5y.R.inc(170);when( mockAppender.isStarted() ).thenReturn( true );

        __CLR4_4_14n4nl2zc5p5y.R.inc(171);doAnswer( invocation -> {__CLR4_4_14n4nl2zc5p5y.R.inc(172);
            __CLR4_4_14n4nl2zc5p5y.R.inc(173);LogEvent logEvent = invocation.getArgumentAt( 0, LogEvent.class );
            __CLR4_4_14n4nl2zc5p5y.R.inc(174);capturedEvents.add( logEvent.toImmutable() );
            __CLR4_4_14n4nl2zc5p5y.R.inc(175);return null;
        } ).when( mockAppender ).append( any() );

        __CLR4_4_14n4nl2zc5p5y.R.inc(176);logger = ( Logger ) LogManager.getLogger( WordCounter.class );
        __CLR4_4_14n4nl2zc5p5y.R.inc(177);logger.addAppender( mockAppender );
        __CLR4_4_14n4nl2zc5p5y.R.inc(178);logger.setLevel( Level.ALL );
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}


    @After
    public void tearDown()
    {try{__CLR4_4_14n4nl2zc5p5y.R.inc(179);
        // the appender we added will sit in the singleton logger forever
        // slowing future things down - so remove it
        __CLR4_4_14n4nl2zc5p5y.R.inc(180);logger.removeAppender( mockAppender );
        __CLR4_4_14n4nl2zc5p5y.R.inc(181);capturedEvents.clear();
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}


    @Test
    public void synalogikStringTest()
        throws IOException
    {__CLR4_4_14n4nl2zc5p5y.R.globalSliceStart(getClass().getName(),182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17j9jqh52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n4nl2zc5p5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n4nl2zc5p5y.R.globalSliceEnd(getClass().getName(),"core.WordCounterTest.synalogikStringTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17j9jqh52() throws IOException{try{__CLR4_4_14n4nl2zc5p5y.R.inc(182);
        //Given
        __CLR4_4_14n4nl2zc5p5y.R.inc(183);String      initialString = "Hello world & good morning. The date is 18/05/2016";
        __CLR4_4_14n4nl2zc5p5y.R.inc(184);InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        __CLR4_4_14n4nl2zc5p5y.R.inc(185);Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 1}, {2, 1}, {3, 1}, {4, 2}, {5, 2}, {7, 1}, {10, 1}
        } ).collect( Collectors.toMap( __CLR4_4_14n4nl2zc5p5y.lambdaInc(186,data -> data[0],187), __CLR4_4_14n4nl2zc5p5y.lambdaInc(188,data -> data[1],189) ) );

        //When
        __CLR4_4_14n4nl2zc5p5y.R.inc(190);wcts.readInputStream( testStream );
        __CLR4_4_14n4nl2zc5p5y.R.inc(191);wcts.printInfo();

        //Then
        __CLR4_4_14n4nl2zc5p5y.R.inc(192);assertThat( wcts.getAverage() ).isEqualTo( 4.555555555555555 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(193);assertThat( wcts.getWordCount() ).isEqualTo( 9 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(194);assertThat( wcts.getLetterCount() ).isEqualTo( 41 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(195);assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
        __CLR4_4_14n4nl2zc5p5y.R.inc(196);Assertions.assertThat( verifyLogMessages( "Word Count = 9",
                                                  "Letter Count 41",
                                                  "Average word length 4.556",
                                                  "Number of words of length 1 is 1",
                                                  "Number of words of length 2 is 1",
                                                  "Number of words of length 3 is 1",
                                                  "Number of words of length 4 is 2",
                                                  "Number of words of length 5 is 2",
                                                  "Number of words of length 7 is 1",
                                                  "Number of words of length 10 is 1",
                                                  "The most frequently occurring word length is 2 for word lengths of 4 & 5" ) ).isTrue();
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}


    @Test
    public void tesThreeLargeOneSmallSizeStringTest()
        throws IOException
    {__CLR4_4_14n4nl2zc5p5y.R.globalSliceStart(getClass().getName(),197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pilcvf5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n4nl2zc5p5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n4nl2zc5p5y.R.globalSliceEnd(getClass().getName(),"core.WordCounterTest.tesThreeLargeOneSmallSizeStringTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pilcvf5h() throws IOException{try{__CLR4_4_14n4nl2zc5p5y.R.inc(197);
        //Given
        __CLR4_4_14n4nl2zc5p5y.R.inc(198);String      initialString = "testing testing testing small";
        __CLR4_4_14n4nl2zc5p5y.R.inc(199);InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        __CLR4_4_14n4nl2zc5p5y.R.inc(200);Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {5, 1}, {7, 3}
        } ).collect( Collectors.toMap( __CLR4_4_14n4nl2zc5p5y.lambdaInc(201,data -> data[0],202), __CLR4_4_14n4nl2zc5p5y.lambdaInc(203,data -> data[1],204) ) );

        //When
        __CLR4_4_14n4nl2zc5p5y.R.inc(205);wcts.readInputStream( testStream );
        __CLR4_4_14n4nl2zc5p5y.R.inc(206);wcts.printInfo();

        //Then
        __CLR4_4_14n4nl2zc5p5y.R.inc(207);assertThat( wcts.getAverage() ).isEqualTo( 6.5 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(208);assertThat( wcts.getWordCount() ).isEqualTo( 4 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(209);assertThat( wcts.getLetterCount() ).isEqualTo( 26 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(210);assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
        __CLR4_4_14n4nl2zc5p5y.R.inc(211);Assertions.assertThat( verifyLogMessages( "Word Count = 4",
                                                  "Letter Count 26",
                                                  "Average word length 6.500",
                                                  "Number of words of length 5 is 1",
                                                  "Number of words of length 7 is 3",
                                                  "The most frequently occurring word length is 3 for word lengths of 3" ) ).isTrue();
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}

    @Test
    public void allWordsSameSizeStringTest()
        throws IOException
    {__CLR4_4_14n4nl2zc5p5y.R.globalSliceStart(getClass().getName(),212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6pyvt5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n4nl2zc5p5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n4nl2zc5p5y.R.globalSliceEnd(getClass().getName(),"core.WordCounterTest.allWordsSameSizeStringTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6pyvt5w() throws IOException{try{__CLR4_4_14n4nl2zc5p5y.R.inc(212);
        //Given
        __CLR4_4_14n4nl2zc5p5y.R.inc(213);String      initialString = "12345 12345 12345 12345 12345 12345";
        __CLR4_4_14n4nl2zc5p5y.R.inc(214);InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        __CLR4_4_14n4nl2zc5p5y.R.inc(215);Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {5, 6}
        } ).collect( Collectors.toMap( __CLR4_4_14n4nl2zc5p5y.lambdaInc(216,data -> data[0],217), __CLR4_4_14n4nl2zc5p5y.lambdaInc(218,data -> data[1],219) ) );

        //When
        __CLR4_4_14n4nl2zc5p5y.R.inc(220);wcts.readInputStream( testStream );
        __CLR4_4_14n4nl2zc5p5y.R.inc(221);wcts.printInfo();

        //Then
        __CLR4_4_14n4nl2zc5p5y.R.inc(222);assertThat( wcts.getAverage() ).isEqualTo( 5 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(223);assertThat( wcts.getWordCount() ).isEqualTo( 6 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(224);assertThat( wcts.getLetterCount() ).isEqualTo( 30 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(225);assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
        __CLR4_4_14n4nl2zc5p5y.R.inc(226);Assertions.assertThat( verifyLogMessages( "Word Count = 6",
                                                  "Letter Count 30",
                                                  "Average word length 5.000",
                                                  "Number of words of length 5 is 6",
                                                  "The most frequently occurring word length is 6 for word lengths of 6" ) ).isTrue();
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}

    @Test
    public void allWordsDifferentSizeStringTest()
        throws IOException
    {__CLR4_4_14n4nl2zc5p5y.R.globalSliceStart(getClass().getName(),227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193x58c6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n4nl2zc5p5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n4nl2zc5p5y.R.globalSliceEnd(getClass().getName(),"core.WordCounterTest.allWordsDifferentSizeStringTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193x58c6b() throws IOException{try{__CLR4_4_14n4nl2zc5p5y.R.inc(227);
        //Given
        __CLR4_4_14n4nl2zc5p5y.R.inc(228);String      initialString = "1 12 123 1234 12345 123456";
        __CLR4_4_14n4nl2zc5p5y.R.inc(229);InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        __CLR4_4_14n4nl2zc5p5y.R.inc(230);Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}
        } ).collect( Collectors.toMap( __CLR4_4_14n4nl2zc5p5y.lambdaInc(231,data -> data[0],232), __CLR4_4_14n4nl2zc5p5y.lambdaInc(233,data -> data[1],234) ) );

        //When
        __CLR4_4_14n4nl2zc5p5y.R.inc(235);wcts.readInputStream( testStream );
        __CLR4_4_14n4nl2zc5p5y.R.inc(236);wcts.printInfo();

        //Then
        __CLR4_4_14n4nl2zc5p5y.R.inc(237);assertThat( wcts.getAverage() ).isEqualTo( 3.5 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(238);assertThat( wcts.getWordCount() ).isEqualTo( 6 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(239);assertThat( wcts.getLetterCount() ).isEqualTo( 21 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(240);assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
        __CLR4_4_14n4nl2zc5p5y.R.inc(241);Assertions.assertThat( verifyLogMessages( "Word Count = 6",
                                                  "Letter Count 21",
                                                  "Average word length 3.500",
                                                  "Number of words of length 1 is 1",
                                                  "Number of words of length 2 is 1",
                                                  "Number of words of length 3 is 1",
                                                  "Number of words of length 4 is 1",
                                                  "Number of words of length 5 is 1",
                                                  "Number of words of length 6 is 1",
                                                  "The most frequently occurring word length is 1 for word lengths of 1 & 2 & 3 & 4 & 5 & 6" ) ).isTrue();

    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}

    @Test
    public void bibleTest()
        throws IOException
    {__CLR4_4_14n4nl2zc5p5y.R.globalSliceStart(getClass().getName(),242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqwzkj6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n4nl2zc5p5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n4nl2zc5p5y.R.globalSliceEnd(getClass().getName(),"core.WordCounterTest.bibleTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqwzkj6q() throws IOException{try{__CLR4_4_14n4nl2zc5p5y.R.inc(242);
        //Given
        __CLR4_4_14n4nl2zc5p5y.R.inc(243);InputStream testStream = this.getClass()
            .getClassLoader().getResourceAsStream( "test-files/bible_daily.txt" );
        __CLR4_4_14n4nl2zc5p5y.R.inc(244);Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 18563}, {2, 126810}, {3, 213311}, {4, 165112}, {5, 102877}, {6, 53903},
            {7, 47726}, {8, 27614}, {9, 19303}, {10, 9680}, {11, 4834}, {12, 2236},
            {13, 1129}, {14, 598}, {15, 140}, {16, 41}, {17, 14}, {18, 2}
        } ).collect( Collectors.toMap( __CLR4_4_14n4nl2zc5p5y.lambdaInc(245,data -> data[0],246), __CLR4_4_14n4nl2zc5p5y.lambdaInc(247,data -> data[1],248) ) );

        //When
        __CLR4_4_14n4nl2zc5p5y.R.inc(249);wcts.readInputStream( testStream );
        __CLR4_4_14n4nl2zc5p5y.R.inc(250);wcts.printInfo();

        //Then
        __CLR4_4_14n4nl2zc5p5y.R.inc(251);assertThat( wcts.getAverage() ).isEqualTo( 4.209601293877134 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(252);assertThat( wcts.getWordCount() ).isEqualTo( 793893 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(253);assertThat( wcts.getLetterCount() ).isEqualTo( 3341973 );
        __CLR4_4_14n4nl2zc5p5y.R.inc(254);assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
        __CLR4_4_14n4nl2zc5p5y.R.inc(255);Assertions.assertThat( verifyLogMessages( "Word Count = 793893",
                                                  "Letter Count 3341973",
                                                  "Average word length 4.210",
                                                  "Number of words of length 1 is 18563",
                                                  "Number of words of length 2 is 126810",
                                                  "Number of words of length 3 is 213311",
                                                  "Number of words of length 4 is 165112",
                                                  "Number of words of length 5 is 102877",
                                                  "Number of words of length 6 is 53903",
                                                  "Number of words of length 7 is 47726",
                                                  "Number of words of length 8 is 27614",
                                                  "Number of words of length 9 is 19303",
                                                  "Number of words of length 10 is 9680",
                                                  "Number of words of length 11 is 4834",
                                                  "Number of words of length 12 is 2236",
                                                  "Number of words of length 13 is 1129",
                                                  "Number of words of length 14 is 598",
                                                  "Number of words of length 15 is 140",
                                                  "Number of words of length 16 is 41",
                                                  "Number of words of length 17 is 14",
                                                  "Number of words of length 18 is 2",
                                                  "The most frequently occurring word length is 213311 for word lengths of 213311" ) ).isTrue();
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}

    private boolean verifyLogMessages( String... wantedMessages )
    {try{__CLR4_4_14n4nl2zc5p5y.R.inc(256);
        __CLR4_4_14n4nl2zc5p5y.R.inc(257);Stream<String> renderedMessageStream = capturedEvents.stream().map( x -> {__CLR4_4_14n4nl2zc5p5y.R.inc(258);return x.getMessage().getFormattedMessage();} );
        __CLR4_4_14n4nl2zc5p5y.R.inc(259);List<String>   renderedMessages      = renderedMessageStream.collect( Collectors.toList() );

        __CLR4_4_14n4nl2zc5p5y.R.inc(260);boolean verified = true;
        __CLR4_4_14n4nl2zc5p5y.R.inc(261);for ( String wantedMessage : wantedMessages )
        {{
            __CLR4_4_14n4nl2zc5p5y.R.inc(262);verified &= renderedMessages.stream().anyMatch( __CLR4_4_14n4nl2zc5p5y.lambdaInc(263,s -> s.contains( wantedMessage ),264) );
        }

        }__CLR4_4_14n4nl2zc5p5y.R.inc(265);return verified;
    }finally{__CLR4_4_14n4nl2zc5p5y.R.flushNeeded();}}
}
