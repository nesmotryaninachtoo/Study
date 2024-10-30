public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int crc = 0;
        int inputStreamByte;
        try {
            while ((inputStreamByte = inputStream.read()) != -1){
                crc = Integer.rotateLeft(crc,1) ^ inputStreamByte;
            }
        } catch (IOException e) {
            throw new IOException();
        }
        return crc;
    }
