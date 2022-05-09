/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package cmd;

import core.WordCounter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import picocli.CommandLine;
import picocli.CommandLine.Option;
import util.IoUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class WordCountCmd implements Runnable
{public static class __CLR4_4_100l2zc5ozm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0061\u0074\u0061\u005c\u005c\u0063\u006f\u0064\u0065\u005c\u005c\u0057\u006f\u0072\u0064\u0043\u006f\u0075\u006e\u0074\u0065\u0072\u0041\u0070\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652137747612L,8589935092L,26,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger      LOGGER = LogManager.getLogger( WordCountCmd.class );
    private              IoUtils     ioUtils;
    private              WordCounter wordCounter;

    @Option( names = {"-f", "--file"}, description = "Path to file", required = true )
    private Path fileToCount;

    public void setIoUtils( IoUtils ioUtils )
    {try{__CLR4_4_100l2zc5ozm.R.inc(0);
        __CLR4_4_100l2zc5ozm.R.inc(1);this.ioUtils = ioUtils;
    }finally{__CLR4_4_100l2zc5ozm.R.flushNeeded();}}

    public void setWordCounter( WordCounter wordCounter )
    {try{__CLR4_4_100l2zc5ozm.R.inc(2);
        __CLR4_4_100l2zc5ozm.R.inc(3);this.wordCounter = wordCounter;
    }finally{__CLR4_4_100l2zc5ozm.R.flushNeeded();}}

    @Override
    public void run()
    {try{__CLR4_4_100l2zc5ozm.R.inc(4);
        __CLR4_4_100l2zc5ozm.R.inc(5);if ( (((ioUtils.doesExist( fileToCount ) && ioUtils.isRegularFile( fileToCount ) )&&(__CLR4_4_100l2zc5ozm.R.iget(6)!=0|true))||(__CLR4_4_100l2zc5ozm.R.iget(7)==0&false)))
        {{
            __CLR4_4_100l2zc5ozm.R.inc(8);try
            {
                __CLR4_4_100l2zc5ozm.R.inc(9);InputStream is = ioUtils.createInputStream( fileToCount );
                __CLR4_4_100l2zc5ozm.R.inc(10);wordCounter.readInputStream( is );
                __CLR4_4_100l2zc5ozm.R.inc(11);wordCounter.printInfo();
            }
            catch ( IOException e )
            {
                __CLR4_4_100l2zc5ozm.R.inc(12);LOGGER.error( e );
            }
        }
        }else
        {{
            __CLR4_4_100l2zc5ozm.R.inc(13);if ( (((!ioUtils.doesExist( fileToCount ) )&&(__CLR4_4_100l2zc5ozm.R.iget(14)!=0|true))||(__CLR4_4_100l2zc5ozm.R.iget(15)==0&false)))
            {{
                __CLR4_4_100l2zc5ozm.R.inc(16);LOGGER.info( "{}: does not exist", fileToCount );
            }
            }else {__CLR4_4_100l2zc5ozm.R.inc(17);if ( (((!ioUtils.isRegularFile( fileToCount ) )&&(__CLR4_4_100l2zc5ozm.R.iget(18)!=0|true))||(__CLR4_4_100l2zc5ozm.R.iget(19)==0&false)))
            {{
                __CLR4_4_100l2zc5ozm.R.inc(20);LOGGER.info( "{}: is a directory", fileToCount );
            }
        }}}
    }}finally{__CLR4_4_100l2zc5ozm.R.flushNeeded();}}

    public static void main( String[] args )
    {try{__CLR4_4_100l2zc5ozm.R.inc(21);
        __CLR4_4_100l2zc5ozm.R.inc(22);WordCountCmd wordCountCmd = new WordCountCmd();
        __CLR4_4_100l2zc5ozm.R.inc(23);wordCountCmd.setIoUtils( new IoUtils() );
        __CLR4_4_100l2zc5ozm.R.inc(24);wordCountCmd.setWordCounter( new WordCounter() );
        __CLR4_4_100l2zc5ozm.R.inc(25);new CommandLine( wordCountCmd ).execute( args );
    }finally{__CLR4_4_100l2zc5ozm.R.flushNeeded();}}
}
