package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer{
	
	private CompactDisc sgtPeppers;

	@Autowired(required=false)
	public CDPlayer(CompactDisc sgtPeppers){
		System.out.println("Create bean sgtPeppers");
		this.sgtPeppers = sgtPeppers;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("implement cDPlayer.play()");
		sgtPeppers.play();
	}
	
}
