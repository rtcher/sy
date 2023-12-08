import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 银行登录 {
    private JButton 登录按钮;
    private JPanel 登录界面;
    private JList 标题;
    private JTextField 请输入账号密码;
    private JPasswordField 银行卡密码;

    public 银行登录() {
        登录按钮.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
