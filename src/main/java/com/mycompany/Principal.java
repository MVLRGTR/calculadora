import javax.swing.JOptionPane;
import com.mycompany.calculadora.Calculadora;

public class Principal{
    public static void main(String[] args){
        String opcao = "";
        Calculadora calcular = new Calculadora();
        while (!opcao.equals("9")){
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração " + 
                    "\n4 - Produto \n5 - Divisão \n9 - Sair");
            
        switch(Integer.parseInt(opcao)){
            case 1:
                calcular.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                calcular.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Soma: " + calcular.getAdicao());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Subtração: " + calcular.getSubtracao());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Produto: " + calcular.getProduto());
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Divisão: " + calcular.getDivisao());
                break;
        }
        }
    }
}
