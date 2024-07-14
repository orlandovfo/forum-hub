@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;

    public Topic createTopic(Topic topic) {
        Course course = courseRepository.findById(topic.getCourse().getId()).orElseThrow();
        User author = userRepository.findById(topic.getAuthor().getId()).orElseThrow();
        topic.setCourse(course);
        topic.setAuthor(author);
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopic(Long id) {
        return topicRepository.findById(id).orElseThrow();
    }

    public Topic updateTopic(Long id, Topic topic) {
        Topic existingTopic = getTopic(id);
        existingTopic.setTitle(topic.getTitle());
        existingTopic.setMessage(topic.getMessage());
        existingTopic.setStatus(topic.getStatus());
        return topicRepository.save(existingTopic);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}