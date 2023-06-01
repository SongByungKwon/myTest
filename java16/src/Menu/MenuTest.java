package Menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(400, 200);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		Menu mEdit = new Menu("편집(E)");
		Menu mView = new Menu("서식(O)");
		Menu mHelp = new Menu("보기(V)");
		Menu mHelpz = new Menu("도움말(H)");

		MenuItem miNew = new MenuItem("새로만들기(N)");
		MenuItem miOpen = new MenuItem("새 창(W)");
		MenuItem mOthers = new MenuItem("열기(O)");
		MenuItem miExit = new MenuItem("저장(S)");
		MenuItem miNew1 = new MenuItem("다른 이름으로 저장(A)");
		MenuItem miOpen1 = new MenuItem("페이지설정(U)");
		MenuItem mOthers1 = new MenuItem("인쇄(P)");
		MenuItem miExit1 = new MenuItem("끝내기(X)");

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.add(miExit);
		mFile.add(miNew1);
		mFile.addSeparator();
		mFile.add(miExit);
		mFile.add(mOthers1);
		mFile.addSeparator();
		mFile.add(miExit1);

		MenuItem miPrint = new MenuItem("실행취소(U)");
		MenuItem miPreview = new MenuItem("잘라내기(T)");
		MenuItem miSetup = new MenuItem("복사(C)");
		MenuItem miPrint1 = new MenuItem("붙여넣기(P)");

		MenuItem miPreview1 = new MenuItem("삭제(L)");
		MenuItem miSetup1 = new MenuItem("Bing으로 검색(S)");
		MenuItem miPrint2 = new MenuItem("찾기(F)");
		MenuItem miPreview2 = new MenuItem("다음 찾기(N)");
		MenuItem miSetup2 = new MenuItem("이전 찾기(V)");
		MenuItem miPrint3 = new MenuItem("바꾸기(R)");
		MenuItem miPreview3 = new MenuItem("이동(G)");
		MenuItem miSetup3 = new MenuItem("모두 선택(A)");
		MenuItem miPrint4 = new MenuItem("시간/날짜(D)");

		mEdit.add(miPrint);
		mEdit.addSeparator();
		mEdit.add(miPreview);
		mEdit.add(miSetup);
		mEdit.add(miPrint1);
		mEdit.add(miPreview1);
		mEdit.addSeparator();
		mEdit.add(miSetup1);
		mEdit.add(miPrint2);
		mEdit.add(miPreview2);
		mEdit.add(miSetup2);
		mEdit.add(miPrint3);
		mEdit.add(miPreview3);
		mEdit.addSeparator();
		mEdit.add(miSetup3);
		mEdit.add(miPrint4);

		MenuItem miPrinta = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miPreviewa = new MenuItem("글꼴(F)");

		mView.add(miPrinta);
		mView.add(miPreviewa);

		Menu miNewz = new Menu("확대하기/축소하기");
		MenuItem miOpenz = new MenuItem("상태 표시줄(S)");

		MenuItem miPrints = new MenuItem("확대(I)");
		MenuItem miPreviews = new MenuItem("축소(O)");
		MenuItem miSetups = new MenuItem("확대하기/축소하기 기본값 복원");

		mHelp.add(miNewz);
		mHelp.add(miOpenz);
		
		miNewz.add(miPrints);
		miNewz.add(miPreviews);
		miNewz.add(miSetups);
		
		
		MenuItem miPrinzxl = new MenuItem("도움말 보기(I)");
		MenuItem miPreviewsasd = new MenuItem("피드백 보내기(O)");
		MenuItem miSetupsasd = new MenuItem("메모장 정보");
		
		
		
		
		
		mHelpz.add(miPrinzxl);
		
		mHelpz.add(miPreviewsasd);
		mHelpz.addSeparator();
		mHelpz.add(miSetupsasd);
		
		
		
		
		
		
		
		

		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.add(mHelp);
		mb.setHelpMenu(mHelpz);

		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
