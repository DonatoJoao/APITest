import com.google.gson.annotations.SerializedName;
import netscape.javascript.JSObject;

public class DatasWebService {
        //Solução StackOverFlow
        //Porém eu ainda não sei como resolver o que quero

    @SerializedName("phonetic")
    private String phonetic;

    @SerializedName("definition")
    private String definition;

    @SerializedName("example")
    private String example;

    @SerializedName("dados")
    private JSObject dados;

    public JSObject setDados(JSObject dados) {
        this.dados = dados;
        return dados;
    }

    public JSObject getDados() {
        return dados;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String toString(){
        return "DatasWebService{" +
                "phonetic" + phonetic +
                ",definition= " + definition + '\''+
                ", example = "+ example +
                ", dados=" + dados +
                '}';
    }

}
