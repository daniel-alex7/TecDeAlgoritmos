// Crie um novo projeto chamado Aventura
// • Crie uma classe chamada Item que contenha os seguintes atributos:
// – id: int
// – nome: String
// – descricao: String
// • Crie uma nova classe chamada Sala que contenha os seguintes
// atributos:
// – id: int
// – descricao: String

public class AventuraEx {
    public class Item {
        public int id;
        public String nome;
        public String descricao;

        public Item(int id, String nome, String descricao) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
        }
    }

    public class Sala {
        public int id;
        public String descricao;

        public Sala(int id, String descricao) {
            this.id = id;
            this.descricao = descricao;
        }
    }

    
}
