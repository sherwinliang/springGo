import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.PlayerConfig;
import music.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlayerConfig.class)
public class CDPlayerTest {

//	@Autowired
//	public MediaPlayer CDPlayer;
//	
//	@Autowired
//	public VideoPlayer videoPlayer;
//	
//	@Autowired
//	Audience audience;
	
//	@Autowired
//	ExtraOperationIntroduction extraOperationIntroduction;
	@Autowired
	public CDPlayer cDPlayer;
	
	@Test
	public void cdPlayerShouldNotBeNull(){
//		CDPlayer.play("A");
//		videoPlayer.play("A");
//		videoPlayer.play("B");
//		videoPlayer.play("C");
//		assertNotNull(videoPlayer);
		cDPlayer.play();
//		ExtraOperation extraOperation = (ExtraOperation) sgtPeppers;

		assertNotNull(cDPlayer);
	}

}
