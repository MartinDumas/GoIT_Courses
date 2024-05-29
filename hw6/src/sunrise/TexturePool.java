package sunrise;

 class TexturePool {
     private static TexturePool instance;

     // Приватний конструктор, щоб заборонити створення екземплярів класу ззовні
     private TexturePool() {}

     // Статичний метод для отримання єдиного екземпляру класу
     public static TexturePool getInstance() {
         if (instance == null) {
             instance = new TexturePool();
         }
         return instance;
     }

     public String getTexture(String textureName) {
         return String.format("Get Texture %s", textureName);
     }
     public static void main(String[] args) {
         //Get texture MainHero
         System.out.println(TexturePool.getInstance().getTexture("MainHero"));
     }
}
