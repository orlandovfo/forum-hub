@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @PostMapping
    public Topic createTopic(@RequestBody @Valid Topic topic) {
        return topicService.createTopic(topic);
    }

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable Long id) {
        return topicService.getTopic(id);
    }

    @PutMapping("/{id}")
    public Topic updateTopic(@PathVariable Long id, @RequestBody @Valid Topic topic) {
        return topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }
}