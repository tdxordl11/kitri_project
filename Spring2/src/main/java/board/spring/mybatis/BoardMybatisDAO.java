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
	
	//전체 조회
	public List<BoardVO> getAllBoard(){
		// session.getConnection().getAutoCommit(); 자동커밋인지 아닌지 확인하는방법
		List<BoardVO> list = session.selectList("board.allboard");
		return list;
	}
	
	// 전체 게시글 갯수 조회
	public int selectBoardCount() {
		int i = session.selectOne("board.boardcnt");
		return i;
	}
	
	// 페이징처리
	public List<BoardVO> boardPaging(int[] param) {
		return session.selectList("board.boardpaging", param);  
	}
	
	//상세 내역
	public BoardVO boardDetail(int seq) {
		return session.selectOne("board.boarddetail", seq);
	}
	
	// 글쓰기 insert
	public void boardInsert(BoardVO vo){
		session.insert("board.insertboard", vo);
	}
	
	//삭제
	public void boardDelete(int seq) {
		session.delete("board.deleteboard", seq);
	}
	
	// 조회수 증가
	public void updateHit(int seq) {
		session.update("board.updatehit", seq);
	}
	
	//수정
	public void boardUpdate(BoardVO vo) {
		session.update("board.boardupdate", vo);
	}
	
	// member테이블에 있는 사람인지 check
	public int checkuser(BoardVO vo) {
		return session.selectOne("member.checkuser", vo);
	}
	
	//수정시 비밀번호 체크
	public boolean checkPw(int[] param) {
		boolean result = false;
		
		int count = session.selectOne("board.checkpw", param);
		
		if(count==1) {
			result = true;
		}
		
		return result;
	}
}
