class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }
    public void render(int position) { //символ в каком-то определенном месте
        System.out.println("Rendering character '" + value + "' in font "
                + font + " of size " + size + " at position " + position);
    }
}

class CharacterFactory { // следит за reuse of char objects
    private Character[] characters = new Character[128]; //for storing character objects
    public Character getCharacter(char value, String font, int size) {
        int index = (int) value;
        if (characters[index] == null) { // если нет, создаем
            characters[index] = new Character(value, font, size);
        }
        return characters[index];
    }
}

class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();
    private Character[] document = new Character[1000]; //to store the characters
    private int[] positions = new int[1000]; //to store positions of characters
    private int index = 0;

    public void insertCharacter(char value, String font, int size, int position) {
        Character character = characterFactory.getCharacter(value, font, size);
        document[index] = character;
        positions[index] = position;
        index++;
    }
    public void render() {
        for (int i=0; i<index; i++) {
            document[i].render(positions[i]);
        }
    }
}
