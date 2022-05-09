package util;

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
{
    IoUtils ioUtilsTS = new IoUtils();

    @Test
    public void doesExistTrueTest()
    {
        Path currentPath = Paths.get( "" );
        assertThat( ioUtilsTS.doesExist( currentPath ) ).isTrue();
    }

    @Test
    public void doesExistFalseTest()
    {
        Path currentPath = Paths.get( "" );
        currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "falsePath" );
        assertThat( ioUtilsTS.doesExist( currentPath ) ).isFalse();
    }

    @Test
    public void isRegularFileTrueTest()
    {
        Path currentPath = Paths.get( "" );
        currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test", "resources",
                                 "test-files", "test.txt" );
        assertThat( ioUtilsTS.isRegularFile( currentPath ) ).isTrue();
    }

    @Test
    public void isRegularFileFalseTest()
    {
        Path currentPath = Paths.get( "" );
        currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test" );
        assertThat( ioUtilsTS.isRegularFile( currentPath ) ).isFalse();
    }

    @Test
    public void createInputStreamTest()
        throws IOException
    {
        Path currentPath = Paths.get( "" );
        currentPath = Paths.get( currentPath.toAbsolutePath().toString(), "src", "test", "resources",
                                 "test-files", "bible_daily.txt" );
        InputStream is = ioUtilsTS.createInputStream( currentPath );
        assertThat( is.available() ).isGreaterThan( 0 );
    }
}
