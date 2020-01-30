package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BoardMybatisController {
	@Autowired
	BoardService service;
	
	//��ü ��ȸ
//	@RequestMapping("/allboard")
//	public ModelAndView getAllBoard() {
//		ModelAndView mav = new ModelAndView();
//		List<BoardVO> list = service.getAllBoard();
//		mav.addObject("allboard", list);
//		mav.setViewName("boardwritesuccess");
//		return mav;
//	}
	
	//����¡ ó��
	@RequestMapping(value="/boardpaginglist")
	public ModelAndView getBoardList(@RequestParam(value="pagenum", defaultValue = "1") int pagenum) {
		int totalcnt = service.getBoardcnt();
		int param[] = new int[2];
		param[0] = (pagenum-1)*5+1;
		param[1] = (pagenum*5);
		
		List<BoardVO> boardlist = service.boardPaging(param);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardlist", boardlist);
		mav.addObject("totalcnt",totalcnt);
		mav.setViewName("boardwritesuccess");
		return mav;
	}
	
	// �� ���� ��ȸ
	@RequestMapping(value="/boarddetail")
	public ModelAndView getBoardDetail(@RequestParam(value="seq") int seq) {
		
		//��ȸ�� 1 �ø���
		service.updateHit(seq);
		
		BoardVO list = service.boardDetail(seq);
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("detail", list);
		mav.setViewName("boarddetail");
		
		return mav;
	}
	
	// get �۾���  ȭ�� �� ���
	@RequestMapping(value="/boardwrite", method = RequestMethod.GET) 
	public String BoardWriteForm() {
			
		return "boardwrite";
	}
	
	//post �۾��� ���� db board ���� insert
	@RequestMapping(value="/boardwrite", method = RequestMethod.POST) 
	public String BoardInsert(BoardVO vo) {
		if(service.checkuser(vo)==1) {
			service.boardInsert(vo);
			return "redirect:boardpaginglist";
		} else {
			return "memberinsert";
		}
	}
	
	
	// ���� -> /boardupdate : get :
	@RequestMapping(value="/boardupdate", method = RequestMethod.GET)
	public ModelAndView BoardUpdate(int seq) {
		BoardVO list = service.boardDetail(seq);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("detail", list);
		mav.setViewName("boardupdate");
		
		return mav;
		
	}
	
	// ���� -> /boardupdate : Post :
	@RequestMapping(value="/boardupdate", method = RequestMethod.POST)
	public ModelAndView BoardUpdate(BoardVO vo, @RequestParam(value="seq") int seq , @RequestParam(value="password") int password) {
		int param[] = new int[2];
		param[0] = seq;
		param[1] = password;
		
		ModelAndView mav = new ModelAndView();
		
		boolean result = service.checkPw(param);
		
		if(result) {
			service.boardUpdate(vo);
			mav.setViewName("redirect:boardpaginglist");
			return mav;
		} else {
			mav.setViewName("passwordcheck");
			return mav;
		}
		
	}
	
	// ����
	@RequestMapping(value="/boarddelete")
	public String BoardDelete(@RequestParam(value="seq") int seq) {
		service.boardDelete(seq);
		return "redirect:boardpaginglist";
	}
	
	@RequestMapping(value="/passwordcheck")
	public String Passwordck() {
		return "passwordcheck";
	}
}
