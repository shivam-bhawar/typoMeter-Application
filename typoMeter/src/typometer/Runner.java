package typometer;

import java.awt.EventQueue;

public class Runner
{
	public static void main(String[] args)
	{
		TypingSample sample = new TypingSample(Option_Menu.first);
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Runner_GUI window = new Runner_GUI(sample);
					window.frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

}