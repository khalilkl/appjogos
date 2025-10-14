import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;

package interface;

public class TelaPenal extends JPanel implements actionListener{
    private JPanel telas;
    private CardLayout controleTela;
    private JPanel janelas;

    public TelaPenal(JPanel telas, JFrame janelas){
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
    }
}
