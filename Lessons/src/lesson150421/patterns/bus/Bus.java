package lesson150421.patterns.bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	
	List<Member> _members = new ArrayList<Member>();
	
	public void addMember(final Member member) {
		_members.add(member);
	}
	
	public void removeMember(final Member member) {
		_members.remove(member);
	}

	public void broadcast(final Command command) {
		for (Member member : _members) {
			member.accept(command);
		}
	}

}
