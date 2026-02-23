package map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    Map<String, String> members = new HashMap<>();

    public void save(Member member) {
        if (!members.containsKey(member.getId())) {
            members.put(member.getId(), member.getName());
        }
    }

    public Member findById(String id) {
        if(members.containsKey(id)) {
            return new Member(id, members.get(id));
        }
        return null;
    }

    public Member findByName(String name) {
        for (Map.Entry<String, String> entry : members.entrySet()) {
            if(entry.getValue().contains(name)) {
                return new Member(entry.getKey(), entry.getValue());
            }
        }
        return null;
    }

    public void remove(String id) {
        if(members.containsKey(id)) {
            members.remove(id, members.get(id));
        }
    }
}
