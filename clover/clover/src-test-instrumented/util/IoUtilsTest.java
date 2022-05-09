/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package util;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith( MockitoJUnitRunner.class )
public class IoUtilsTest
{static class __CLR4_4_17e7el2zc5p6n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0061\u0074\u0061\u005c\u005c\u0063\u006f\u0064\u0065\u005c\u005c\u0057\u006f\u0072\u0064\u0043\u006f\u0075\u006e\u0074\u0065\u0072\u0041\u0070\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652137748055L,8589935092L,286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    IoUtils ioUtilsTS = new IoUtils();

    @Test
    public void doesExistTrueTest()
    {__CLR4_4_17e7el2zc5p6n.R.globalSliceStart(getClass().getName(),266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eawxzv7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17e7el2zc5p6n.R.rethrow($CLV_t2$);}finally{__CLR4_4_17e7el2zc5p6n.R.globalSliceEnd(getClass().getName(),"util.IoUtilsTest.doesExistTrueTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eawxzv7e(){try{__CLR4_4_17e7el2zc5p6n.R.inc(266);
        __CLR4_4_17e7el2zc5p6n.R.inc(267);Path currentPath = Paths.get( "" );
        __CLR4_4_17e7el2zc5p6n.R.inc(268);assertThat( ioUtilsTS.doesExist( currentPath ) ).isTrue();
    }finally{__CLR4_4_17e7el2zc5p6n.R.flushNeeded();}}

    @Test
    public void doesExistFalseTest()
    {__CLR4_4_17e7el2zc5p6n.R.globalSliceStart(getClass().getName(),269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oh55y67h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17e7el2zc5p6n.R.rethrow($CLV_t2$);}finally{__CLR4_4_17e7el2zc5p6n.R.globalSliceEnd(getClass().getName(),"util.IoUtilsTest.doesExistFalseTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oh55y67h(){try{__CLR4_4_17e7el2zc5p6n.R.inc(269);
        __CLR4_4_17e7el2zc5p6n.R.inc(270);Path currentPath = Paths.get( "" );
        __CLR4_4_17e7el2zc5p6n.R.inc(271);currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "falsePath" );
        __CLR4_4_17e7el2zc5p6n.R.inc(272);assertThat( ioUtilsTS.doesExist( currentPath ) ).isFalse();
    }finally{__CLR4_4_17e7el2zc5p6n.R.flushNeeded();}}

    @Test
    public void isRegularFileTrueTest()
    {__CLR4_4_17e7el2zc5p6n.R.globalSliceStart(getClass().getName(),273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoc7857l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17e7el2zc5p6n.R.rethrow($CLV_t2$);}finally{__CLR4_4_17e7el2zc5p6n.R.globalSliceEnd(getClass().getName(),"util.IoUtilsTest.isRegularFileTrueTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoc7857l(){try{__CLR4_4_17e7el2zc5p6n.R.inc(273);
        __CLR4_4_17e7el2zc5p6n.R.inc(274);Path currentPath = Paths.get( "" );
        __CLR4_4_17e7el2zc5p6n.R.inc(275);currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test", "resources",
                                 "test-files", "test.txt" );
        __CLR4_4_17e7el2zc5p6n.R.inc(276);assertThat( ioUtilsTS.isRegularFile( currentPath ) ).isTrue();
    }finally{__CLR4_4_17e7el2zc5p6n.R.flushNeeded();}}

    @Test
    public void isRegularFileFalseTest()
    {__CLR4_4_17e7el2zc5p6n.R.globalSliceStart(getClass().getName(),277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9zoa67p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17e7el2zc5p6n.R.rethrow($CLV_t2$);}finally{__CLR4_4_17e7el2zc5p6n.R.globalSliceEnd(getClass().getName(),"util.IoUtilsTest.isRegularFileFalseTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9zoa67p(){try{__CLR4_4_17e7el2zc5p6n.R.inc(277);
        __CLR4_4_17e7el2zc5p6n.R.inc(278);Path currentPath = Paths.get( "" );
        __CLR4_4_17e7el2zc5p6n.R.inc(279);currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test" );
        __CLR4_4_17e7el2zc5p6n.R.inc(280);assertThat( ioUtilsTS.isRegularFile( currentPath ) ).isFalse();
    }finally{__CLR4_4_17e7el2zc5p6n.R.flushNeeded();}}

    @Test
    public void createInputStreamTest()
        throws IOException
    {__CLR4_4_17e7el2zc5p6n.R.globalSliceStart(getClass().getName(),281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3u4s97t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17e7el2zc5p6n.R.rethrow($CLV_t2$);}finally{__CLR4_4_17e7el2zc5p6n.R.globalSliceEnd(getClass().getName(),"util.IoUtilsTest.createInputStreamTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3u4s97t() throws IOException{try{__CLR4_4_17e7el2zc5p6n.R.inc(281);
        __CLR4_4_17e7el2zc5p6n.R.inc(282);Path currentPath = Paths.get( "" );
        __CLR4_4_17e7el2zc5p6n.R.inc(283);currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test", "resources",
                                 "test-files", "bible_daily.txt" );
        __CLR4_4_17e7el2zc5p6n.R.inc(284);InputStream is = ioUtilsTS.createInputStream( currentPath );
        __CLR4_4_17e7el2zc5p6n.R.inc(285);assertThat( is.available() ).isGreaterThan( 0 );
    }finally{__CLR4_4_17e7el2zc5p6n.R.flushNeeded();}}
}
