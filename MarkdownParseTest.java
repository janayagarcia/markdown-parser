import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class MarkdownParseTest {

    /*
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void mdtest1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void mdtest2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void mdtest3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void mdtest4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void mdtest5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void mdtest6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page.com");
        assertEquals(expected, links);
    }

    @Test
    public void mdtest7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void mdtest8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void mdtest9() throws IOException{
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void mdtest10() throws IOException{
        Path fileName = Path.of("Snippet-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("`google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        assertEquals(expected, links);
    }
    @Test
    public void mdtest11() throws IOException{
        Path fileName = Path.of("Snippet-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, links);
    }
    @Test
    public void mdtest12() throws IOException{
        Path fileName = Path.of("Snippet-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, links);
    }

    */

    
    @Test
    public void fourninefive() throws IOException {
        String contents = Files.readString(Path.of("495.md"));
        List<String> expect = List.of("foo(and(bar))");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void twozeroone() throws IOException {
        String contents = Files.readString(Path.of("201.md"));
        List<String> expect = new ArrayList<>();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}