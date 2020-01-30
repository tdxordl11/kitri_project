package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardMybatisService implements BoardService {
	@Autowired
	BoardMybatisDAO dao;
	
	//전체 조회
	@Override
	public List<BoardVO> getAllBoard() {
		return dao.getAllBoard();
	}

	//전체 게시글 숫자 세기
	@Override
	public int getBoardcnt() {
		return dao.selectBoardCount();
	}

	// 페이징처리
	@Override
	public List<BoardVO> boardPaging(int[] param) {
		return dao.boardPaging(param);
	}

	//상세내역
	@Override
	public BoardVO boardDetail(int seq) {
		return dao.boardDetail(seq);
	}

	// 글쓰기 insert
	@Override
	public void boardInsert(BoardVO vo){
		dao.boardInsert(vo);
	}

	//삭제
	@Override
	public void boardDelete(int seq) {
		dao.boardDelete(seq);
		
	}

	// 조회수 증가
	@Override
	public void updateHit(int seq) {
		dao.updateHit(seq);
		
	}

	// 수정
	@Override
	public void boardUpdate(BoardVO vo) {
		dao.boardUpdate(vo);
		
	}

	// member테이블에 있는 사람인지 check
	@Override
	public int checkuser(BoardVO vo) {
		return dao.checkuser(vo);
	}

	// 수정시 비밀번호 check
	@Override
	public boolean checkPw(int[] param) {
		return dao.checkPw(param);
	}
	

	
	
	
	
	
	
	
	
}
