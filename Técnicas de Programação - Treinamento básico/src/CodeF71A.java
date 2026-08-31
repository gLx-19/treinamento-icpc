import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeF71A {
    static class FastReader {
        private BufferedReader br;
        private StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if(line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter implements AutoCloseable {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.write(String.valueOf(object));
        }

        public void println(Object object) throws IOException {
            bw.write(String.valueOf(object));
            bw.newLine();
        }

        public void flush() throws IOException {
            bw.flush();
        }

        @Override
        public void close() throws IOException {
            bw.flush();
            bw.close();
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        FastWriter fw = new FastWriter();
        int entrada = fr.nextInt();
        for (int i = 0; i < entrada; i++) {
            String str = fr.next();
            if (str.length() > 10) { // String builder mais eficiente para concatenar dentro de loops
                StringBuilder s = new StringBuilder();
                s.append(str.charAt(0));
                
                s.append(str.length() - 2);
                s.append(str.charAt(str.length()-1));
                fw.println(s.toString());
            } else {
                fw.println(str);
            }

        }
        fw.close();
    }
}