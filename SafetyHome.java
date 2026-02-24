import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SafetyHome extends JFrame implements ActionListener
{
    JButton smsBtn, fakeCallBtn, voiceBtn, emergencyBtn;

    SafetyHome()
    {
        setTitle("Women Safety Path Alert System");
        setSize(500,400);
        setLayout(null);

        smsBtn = new JButton("Send SMS");
        smsBtn.setBounds(50,50,150,50);
        add(smsBtn);

        fakeCallBtn = new JButton("Fake Call");
        fakeCallBtn.setBounds(250,50,150,50);
        add(fakeCallBtn);

        voiceBtn = new JButton("Voice Trigger");
        voiceBtn.setBounds(50,150,150,50);
        add(voiceBtn);

        emergencyBtn = new JButton("EMERGENCY TRIGGER");
        emergencyBtn.setBounds(150,250,200,50);
        emergencyBtn.setBackground(Color.RED);
        emergencyBtn.setForeground(Color.WHITE);
        add(emergencyBtn);

        smsBtn.addActionListener(this);
        fakeCallBtn.addActionListener(this);
        voiceBtn.addActionListener(this);
        emergencyBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==smsBtn)
        {
            new SendSMSAlert();
        }

        if(e.getSource()==fakeCallBtn)
        {
            new FakeCall();
        }

        if(e.getSource()==voiceBtn)
        {
            new VoiceTrigger();
        }

        if(e.getSource()==emergencyBtn)
        {
            new SendSMSAlert();
            new FakeCall();
            new VoiceTrigger();
        }
    }

    public static void main(String args[])
    {
        new SafetyHome();
    }
}
JButton contactBtn;

contactBtn = new JButton("Manage Contacts");
contactBtn.setBounds(150,320,200,40);
add(contactBtn);

contactBtn.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
        new AddContact();
    }
});
