package board.spring.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardMybatisDAO {
	@Autowired
	SqlSession session;
	
	//��ü ��ȸ
	public List<BoardVO> getAllBoard(){
		// session.getConnection().getAutoCommit(); �ڵ�Ŀ������ �ƴ��� Ȯ���ϴ¹��
		List<BoardVO> list = session.selectList("board.allboard");
		return list;
	}
	
	// ��ü �Խñ� ���� ��ȸ
	public int selectBoardCount() {
		int i = session.selectOne("board.boardcnt");
		return i;
	}
	
	// ����¡ó��
	public List<BoardVO> boardPaging(int[] param) {
		return session.selectList("board.boardpaging", param);  
	}
	
	//�� ����
	public BoardVO boardDetail(int seq) {
		return session.selectOne("board.boarddetail", seq);
	}
	
	// �۾��� insert
	public void boardInsert(BoardVO vo){
		session.insert("board.insertboard", vo);
	}
	
	//����
	public void boardDelete(int seq) {
		session.delete("board.deleteboard", seq);
	}
	
	// ��ȸ�� ����
	public void updateHit(int seq) {
		session.update("board.updatehit", seq);
	}
	
	//����
	public void boardUpdate(BoardVO vo) {
		session.update("board.boardupdate", vo);
	}
	
	// member���̺� �ִ� ������� check
	public int checkuser(BoardVO vo) {
		return session.selectOne("member.checkuser", vo);
	}
	
	//������ ��й�ȣ üũ
	public boolean checkPw(int[] param) {
		boolean result = false;
		
		int count = session.selectOne("board.checkpw", param);
		
		if(count==1) {
			result = true;
		}
		
		return result;
	}
}
