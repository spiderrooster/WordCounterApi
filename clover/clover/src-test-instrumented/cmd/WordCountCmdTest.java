/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package cmd;

import core.WordCounter;
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
import picocli.CommandLine;
import util.IoUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class WordCountCmdTest
{static class __CLR4_4_13030l2zc5p47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0061\u0074\u0061\u005c\u005c\u0063\u006f\u0064\u0065\u005c\u005c\u0057\u006f\u0072\u0064\u0043\u006f\u0075\u006e\u0074\u0065\u0072\u0041\u0070\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652137748055L,8589935092L,167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final List<LogEvent> capturedEvents = new ArrayList<>();
    @Mock
    private       Appender       mockAppender;
    private       Logger         logger;

    @Mock
    private IoUtils     ioUtilsMock;
    @Mock
    private WordCounter wordCounterMock;

    private WordCountCmd wordCountCmd;

    @Before
    public void setup()
    {try{__CLR4_4_13030l2zc5p47.R.inc(108);
        //Given
        //Custom log Appender to get log messages for Log4j2
        __CLR4_4_13030l2zc5p47.R.inc(109);when( mockAppender.getName() ).thenReturn( "MockAppender" );
        __CLR4_4_13030l2zc5p47.R.inc(110);when( mockAppender.isStarted() ).thenReturn( true );

        __CLR4_4_13030l2zc5p47.R.inc(111);doAnswer( invocation -> {__CLR4_4_13030l2zc5p47.R.inc(112);
            __CLR4_4_13030l2zc5p47.R.inc(113);LogEvent logEvent = invocation.getArgumentAt( 0, LogEvent.class );
            __CLR4_4_13030l2zc5p47.R.inc(114);capturedEvents.add( logEvent.toImmutable() );
            __CLR4_4_13030l2zc5p47.R.inc(115);return null;
        } ).when( mockAppender ).append( any() );

        __CLR4_4_13030l2zc5p47.R.inc(116);logger = ( Logger ) LogManager.getLogger( WordCountCmd.class );
        __CLR4_4_13030l2zc5p47.R.inc(117);logger.addAppender( mockAppender );
        __CLR4_4_13030l2zc5p47.R.inc(118);logger.setLevel( Level.ALL );

        __CLR4_4_13030l2zc5p47.R.inc(119);wordCountCmd = new WordCountCmd();
        __CLR4_4_13030l2zc5p47.R.inc(120);wordCountCmd.setIoUtils( ioUtilsMock );
        __CLR4_4_13030l2zc5p47.R.inc(121);wordCountCmd.setWordCounter( wordCounterMock );
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}

    @After
    public void tearDown()
    {try{__CLR4_4_13030l2zc5p47.R.inc(122);
        // the appender we added will sit in the singleton logger forever
        // slowing future things down - so remove it
        __CLR4_4_13030l2zc5p47.R.inc(123);logger.removeAppender( mockAppender );
        __CLR4_4_13030l2zc5p47.R.inc(124);capturedEvents.clear();
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}

    @Test
    public void fileExistIsRegularFileTest()
        throws IOException
    {__CLR4_4_13030l2zc5p47.R.globalSliceStart(getClass().getName(),125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkfij83h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13030l2zc5p47.R.rethrow($CLV_t2$);}finally{__CLR4_4_13030l2zc5p47.R.globalSliceEnd(getClass().getName(),"cmd.WordCountCmdTest.fileExistIsRegularFileTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkfij83h() throws IOException{try{__CLR4_4_13030l2zc5p47.R.inc(125);
        //Given
        __CLR4_4_13030l2zc5p47.R.inc(126);when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( true );
        __CLR4_4_13030l2zc5p47.R.inc(127);when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( true );

        //When
        __CLR4_4_13030l2zc5p47.R.inc(128);Path     path = Paths.get( "" );
        __CLR4_4_13030l2zc5p47.R.inc(129);String[] args = new String[]{"-f", ""};
        __CLR4_4_13030l2zc5p47.R.inc(130);new CommandLine( wordCountCmd ).execute( args );

        //Then
        __CLR4_4_13030l2zc5p47.R.inc(131);verify( ioUtilsMock, times( 1 ) ).doesExist( path );
        __CLR4_4_13030l2zc5p47.R.inc(132);verify( ioUtilsMock, times( 1 ) ).isRegularFile( path );
        __CLR4_4_13030l2zc5p47.R.inc(133);verify( wordCounterMock, times( 1 ) ).readInputStream( any( InputStream.class ) );
        __CLR4_4_13030l2zc5p47.R.inc(134);verify( wordCounterMock, times( 1 ) ).printInfo();
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}


    @Test
    public void fileExistIsDirectoryTest()
        throws IOException
    {__CLR4_4_13030l2zc5p47.R.globalSliceStart(getClass().getName(),135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vsxwsh3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13030l2zc5p47.R.rethrow($CLV_t2$);}finally{__CLR4_4_13030l2zc5p47.R.globalSliceEnd(getClass().getName(),"cmd.WordCountCmdTest.fileExistIsDirectoryTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vsxwsh3r() throws IOException{try{__CLR4_4_13030l2zc5p47.R.inc(135);
        //Given
        __CLR4_4_13030l2zc5p47.R.inc(136);when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( true );
        __CLR4_4_13030l2zc5p47.R.inc(137);when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( false ).thenReturn( false );

        //When
        __CLR4_4_13030l2zc5p47.R.inc(138);Path     path = Paths.get( "" );
        __CLR4_4_13030l2zc5p47.R.inc(139);String[] args = new String[]{"-f", ""};
        __CLR4_4_13030l2zc5p47.R.inc(140);new CommandLine( wordCountCmd ).execute( args );

        //Then
        __CLR4_4_13030l2zc5p47.R.inc(141);verify( ioUtilsMock, times( 2 ) ).doesExist( path );
        __CLR4_4_13030l2zc5p47.R.inc(142);verify( ioUtilsMock, times( 2 ) ).isRegularFile( path );
        __CLR4_4_13030l2zc5p47.R.inc(143);verify( wordCounterMock, times( 0 ) ).readInputStream( any( InputStream.class ) );
        __CLR4_4_13030l2zc5p47.R.inc(144);verify( wordCounterMock, times( 0 ) ).printInfo();
        __CLR4_4_13030l2zc5p47.R.inc(145);Assertions.assertThat( verifyLogMessages( ": is a directory" ) ).isTrue();
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}

    @Test
    public void fileDoesntExistTest()
        throws IOException
    {__CLR4_4_13030l2zc5p47.R.globalSliceStart(getClass().getName(),146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwrvx142();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13030l2zc5p47.R.rethrow($CLV_t2$);}finally{__CLR4_4_13030l2zc5p47.R.globalSliceEnd(getClass().getName(),"cmd.WordCountCmdTest.fileDoesntExistTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwrvx142() throws IOException{try{__CLR4_4_13030l2zc5p47.R.inc(146);
        //Given
        __CLR4_4_13030l2zc5p47.R.inc(147);when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( false );
        __CLR4_4_13030l2zc5p47.R.inc(148);when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( false ).thenReturn( false );

        //When
        __CLR4_4_13030l2zc5p47.R.inc(149);Path     path = Paths.get( "" );
        __CLR4_4_13030l2zc5p47.R.inc(150);String[] args = new String[]{"-f", ""};
        __CLR4_4_13030l2zc5p47.R.inc(151);new CommandLine( wordCountCmd ).execute( args );

        //Then
        __CLR4_4_13030l2zc5p47.R.inc(152);verify( ioUtilsMock, times( 2 ) ).doesExist( path );
        __CLR4_4_13030l2zc5p47.R.inc(153);verify( ioUtilsMock, times( 0 ) ).isRegularFile( path );
        __CLR4_4_13030l2zc5p47.R.inc(154);verify( wordCounterMock, times( 0 ) ).readInputStream( any( InputStream.class ) );
        __CLR4_4_13030l2zc5p47.R.inc(155);verify( wordCounterMock, times( 0 ) ).printInfo();
        __CLR4_4_13030l2zc5p47.R.inc(156);Assertions.assertThat( verifyLogMessages( ": does not exist" ) ).isTrue();
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}

    private boolean verifyLogMessages( String... wantedMessages )
    {try{__CLR4_4_13030l2zc5p47.R.inc(157);
        __CLR4_4_13030l2zc5p47.R.inc(158);Stream<String> renderedMessageStream = capturedEvents.stream().map( x -> {__CLR4_4_13030l2zc5p47.R.inc(159);return x.getMessage().getFormattedMessage();} );
        __CLR4_4_13030l2zc5p47.R.inc(160);List<String>   renderedMessages      = renderedMessageStream.collect( Collectors.toList() );

        __CLR4_4_13030l2zc5p47.R.inc(161);boolean verified = true;
        __CLR4_4_13030l2zc5p47.R.inc(162);for ( String wantedMessage : wantedMessages )
        {{
            __CLR4_4_13030l2zc5p47.R.inc(163);verified &= renderedMessages.stream().anyMatch( __CLR4_4_13030l2zc5p47.lambdaInc(164,s -> s.contains( wantedMessage ),165) );
        }

        }__CLR4_4_13030l2zc5p47.R.inc(166);return verified;
    }finally{__CLR4_4_13030l2zc5p47.R.flushNeeded();}}
}
