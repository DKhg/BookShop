package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vam.model.Criteria;
import com.vam.model.ReplyDTO;
import com.vam.model.ReplyPageDTO;
import com.vam.service.ReplyService;

@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	//댓글 등록
	@PostMapping("/enroll")
	public void enrollReplyPOST(ReplyDTO dto) {
		replyService.enrollReply(dto);
	}
	
	//댓글 체크
	//memberId, bookId 파라미터
	//존재 : 1 , 존재x : 0
	@PostMapping("/check")
	public String replyCheckPOST(ReplyDTO dto) {
		return replyService.checkReply(dto);
	}
	
	//댓글 페이징
	@GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ReplyPageDTO replyListPOST(Criteria cri) {
		return replyService.replyList(cri);
		/*
		- 뷰에서 댓글 페이지 정보를 요청한다. bookId와 페이징 정보(요청 페이지(pageNum), 표시 량(amount))를 서버로 전송한다.
		 - "reply/list" URL 매핑 메서드가 동작한다. 
		 - 댓글 페이징 정보를 만들어내는 Service 메서드를 호출한다.
		 - Service 메서드는 '댓글 페이징 정보'와 '댓글 총 개수'를 반환 해주는 Mapper 메서드 2 개를 호출 한다. '댓글 총 갯수'
		값은 '페이지 정보'인 담기는 PageDTO 객체를 만드는 데 사용이 된다. 
		 - Service 메서드에서 ReplyPageDTO 객체 생성하여 '댓글 페이징 정보'와 '페이지 정보'를 담은 후 해당 객체를 반환한다. 
		 - Controller은 반환받은 ReplyPageDTO 뷰로 전송한다.
		 - ReplyPageDTO는 JSON 데이터로 변환되어 뷰로 전송한다.
		 */
	}
	
	//댓글 수정
	@PostMapping("/update")
	public void replyModifyPOST(ReplyDTO dto) {
		replyService.updateReply(dto);
	}
	
	//댓글 삭제
	@PostMapping("/delete")
	public void replyDeletePOST(ReplyDTO dto) {
		replyService.deleteReply(dto);
	}
}
