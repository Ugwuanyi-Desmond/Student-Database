package studentDatabase;

import java.awt.event.KeyEvent;

public class StudentRegNumOnly {
	
	public void numbersOnly(java.awt.event.KeyEvent evt)
	{
		char iNumber = evt.getKeyChar();
		if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE))
		{
			evt.consume();
		}
	}

}
