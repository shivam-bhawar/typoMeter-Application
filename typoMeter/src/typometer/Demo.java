package typometer;

import java.awt.EventQueue;

public class Demo
{
	public static void main(String[] args)
	{
		
		EventQueue.invokeLater(new Runnable()
		{  
			public void run()
			{   TypingSample sample = new TypingSample("The quick brown fox jumps over the lazy dog");
				try
				{
					Demo_GUI window = new Demo_GUI(sample);
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