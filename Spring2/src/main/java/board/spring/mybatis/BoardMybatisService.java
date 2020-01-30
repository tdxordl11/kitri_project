package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardMybatisService implements BoardService {
	@Autowired
	BoardMybatisDAO dao;
	
	//��ü ��ȸ
	@Override
	public List<BoardVO> getAllBoard() {
		return dao.getAllBoard();
	}

	//��ü �Խñ� ���� ����
	@Override
	public int getBoardcnt() {
		return dao.selectBoardCount();
	}

	// ����¡ó��
	@Override
	public List<BoardVO> boardPaging(int[] param) {
		return dao.boardPaging(param);
	}

	//�󼼳���
	@Override
	public BoardVO boardDetail(int seq) {
		return dao.boardDetail(seq);
	}

	// �۾��� insert
	@Override
	public void boardInsert(BoardVO vo){
		dao.boardInsert(vo);
	}

	//����
	@Override
	public void boardDelete(int seq) {
		dao.boardDelete(seq);
		
	}

	// ��ȸ�� ����
	@Override
	public void updateHit(int seq) {
		dao.updateHit(seq);
		
	}

	// ����
	@Override
	public void boardUpdate(BoardVO vo) {
		dao.boardUpdate(vo);
		
	}

	// member���̺� �ִ� ������� check
	@Override
	public int checkuser(BoardVO vo) {
		return dao.checkuser(vo);
	}

	// ������ ��й�ȣ check
	@Override
	public boolean checkPw(int[] param) {
		return dao.checkPw(param);
	}
	

	
	
	
	
	
	
	
	
}
