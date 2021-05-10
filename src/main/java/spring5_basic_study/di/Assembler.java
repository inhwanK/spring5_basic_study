package spring5_basic_study.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assembler {
//	private MemberDao memberDao;
//	private MemberRegisterService regSvc;
//	private ChangePasswordService pwdSvc;

	public static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

	public Assembler() {

//		memberDao = new MemberDao();
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);

		ChangePasswordService pwdSvc = ctx.getBean("changePwdSvc", ChangePasswordService.class);
//		pwdSvc.setMemberDao(memberDao);
	}

	public MemberDao getMemberDao() {
		return ctx.getBean("memberDao", MemberDao.class);
	}

	public MemberRegisterService getMemberRegisterService() {
		return ctx.getBean("memberRegSvc", MemberRegisterService.class);
	}

	public ChangePasswordService getChangePasswordService() {
		return ctx.getBean("changePwdSvc", ChangePasswordService.class);
	}

}
