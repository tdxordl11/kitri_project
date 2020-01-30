package board.spring.mybatis;

import java.util.List;


public interface BoardService {

	// ��ü ��ȸ
	public List<BoardVO> getAllBoard();
	// �Խñ� ���� ��ȸ
	public int getBoardcnt();
	
	// ����¡ó��
	public List<BoardVO> boardPaging(int[] param);
	
	//�� ���� ��ȸ
	public BoardVO boardDetail(int seq);
	
	// �۾��� insert
	public void boardInsert(BoardVO vo);
	
	// ����
	public void boardDelete(int seq);
	
	//��ȸ�� ����
	public void updateHit(int seq);
	
	// ����
	public void boardUpdate(BoardVO vo);
	
	// member���̺� �ִ� ������� check
	public int checkuser(BoardVO vo);
	
	// ������ ��й�ȣ check
	public boolean checkPw(int[] param);
	
}
