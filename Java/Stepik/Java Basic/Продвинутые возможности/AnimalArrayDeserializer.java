public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] deserializedArray;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            deserializedArray = new Animal[ois.readInt()];
            for (int i = 0; i < deserializedArray.length; i++) {
                deserializedArray[i] = (Animal) ois.readObject();
            }
        } catch (ClassNotFoundException | IOException | ClassCastException e) {
            throw new java.lang.IllegalArgumentException();
        }
        return deserializedArray;
    }
