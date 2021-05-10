package spring5_basic_study.di;

import java.util.Collection;

public class MemberListPrinter {
	private MemberPrinter printer;
	private MemberDao memberDao;
	
	public MemberListPrinter(MemberPrinter printer, MemberDao memberDao) {
		super();
		this.printer = printer;
		this.memberDao = memberDao;
	}
	
	public void printAll() {
		
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->printer.print(m));
	}
	
}
