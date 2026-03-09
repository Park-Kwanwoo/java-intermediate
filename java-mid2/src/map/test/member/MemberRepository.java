package map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private final Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        throw new IllegalArgumentException("Member with name: " + name + " not found");
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
