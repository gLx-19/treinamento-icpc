import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class WatermelonCodeforces {
    static class FastReader {
        private BufferedReader br;
        private StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
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
        int pesoMelancia = fr.nextInt();
        FastWriter fw = new FastWriter();
        pesoMelancia = (pesoMelancia == 2) ? 1 : pesoMelancia;
        String resultado = (pesoMelancia % 2 == 0) ? "YES" : "NO";

        fw.print(resultado);
        fw.close();
    }
}
