public class Reader {
    //atributos 
    private String element;
    private Converter converter;

    //construtor de la clase

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }
    //metodos
    public void parseInput (){
        switch (element) {
            case "LINE":
                converter.makeline();
                break;
            case "PARAGRAPH":
            converter.makeParagraph();
                break;
            case "TABLE":
            converter.makeTable();
                break;    

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

}
