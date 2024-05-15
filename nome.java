import javax.swing.JOptionPane;
public class nome {
    public static void main (String []args){
        String nome, endereco,idade;
        String lernome= JOptionPane.showInputDialog("Coloque seu nome");//aqui eu coloco o nome
        nome= lernome;
        String lerendereco= JOptionPane.showInputDialog("Coloque seu endereco");//aqui eu coloco o endereço
        endereco= lerendereco;
        String leridade= JOptionPane.showInputDialog("Coloque sua idade");//aqui eu coloco a idade
        idade= leridade;
        System.out.println("Seu nome e "+nome);   //aqui eu mostro o nome
        System.out.println("Seu endereco e "+endereco); //aqui eu mostro o endereco
        System.out.println("Sua idade e "+idade);//aqui eu mostro a idade

    }
}
