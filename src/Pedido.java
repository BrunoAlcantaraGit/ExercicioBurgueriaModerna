import java.util.ArrayList;
public class Pedido {
private ArrayList<String> resumoDePedido = new ArrayList<String>();
    public void ResumoPed(){
        for (int i = 0; i < resumoDePedido.size(); i++) {
            System.out.println(resumoDePedido.get(i));
        }
    };
public void carneFrango(int escolha){
    if(escolha == 1) {
        resumoDePedido.add("Hamburguer de Carne");
    } else if(escolha == 2){resumoDePedido.add("Hamburguer de Frango");
       }
    }
    public void adcionarVerdura(int escolha) {
        if(escolha == 1){resumoDePedido.add("Com verdura");
        }else if(escolha == 2){resumoDePedido.add("Sem verdura");
        }
}
    public void adicionarMolho(int escolha){
        if(escolha == 1){resumoDePedido.add("Com Molho ");
        }else if(escolha == 2){resumoDePedido.add("Sem Molho");
        }
    }
    public void adicionarQueijo(int escolha){
        if(escolha == 1){resumoDePedido.add("Com  Queijo");
        }else if(escolha == 2){resumoDePedido.add("Sem Queijo");
        }
    }




}
