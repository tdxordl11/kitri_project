package board.spring.mybatis;

import java.util.List;


public interface BoardService {

	// 전체 조회
	public List<BoardVO> getAllBoard();
	// 게시글 갯수 조회
	public int getBoardcnt();
	
	// 페이징처리
	public List<BoardVO> boardPaging(int[] param);
	
	//상세 내역 조회
	public BoardVO boardDetail(int seq);
	
	// 글쓰기 insert
	public void boardInsert(BoardVO vo);
	
	// 삭제
	public void boardDelete(int seq);
	
	//조회수 증가
	public void updateHit(int seq);
	
	// 수정
	public void boardUpdate(BoardVO vo);
	
	// member테이블에 있는 사람인지 check
	public int checkuser(BoardVO vo);
	
	// 수정시 비밀번호 check
	public boolean checkPw(int[] param);
	
}
