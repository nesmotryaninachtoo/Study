public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder();
        InputStreamReader isr = new InputStreamReader(inputStream,charset);
        int temp;
        while ((temp = isr.read()) != - 1){
            result.append((char) temp);
        }
        return result.toString();
    }
