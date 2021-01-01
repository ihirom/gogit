package blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogController {
	private static BlogController controller = new BlogController();
	private int idCounter;
	private List<Topic> topics = new ArrayList<Topic>();
	public static BlogController getInstance() {return controller;}
	private BlogController() {}
	public void postTopic(Topic topic) {
		synchronized(this) {topic.setId(idCounter++); topic.setPostDate(new Date()); topics.add(topic);}
	}
	public List<Topic> getTopics() {
		return new ArrayList<Topic>(topics);
	}
}
