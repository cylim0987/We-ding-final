package com.oracle.Weding.service;

import java.util.List;

import com.oracle.Weding.dto.Board;

public interface BoardService {
	List<Board> 	qnaBoardList(Board board);
	List<Board> 	reviewBoardList(Board board);
	int 			reviewBoardWrite(Board board);
	int 			qnaBoardListTotal();
	int 			reviewBoardListTotal(Board board);

	int 				total(Board board);
	List<Board> 		listBoard(Board board);
	
	Board 				detail(int b_num);
	int 				delete(int b_num);
	int 				update(Board board);
	int 				insert(Board board);
	
	List<Board> 		qnaList(Board board);
	List<Board> 		sellerQna(Board board);
	Board  		        replyForm(int b_num);

	int                 reply(Board board);
	int					replyCount(Board board);
	int 				sellerQnaTotal(Board board);
	int 				qnaListTotal(Board board);
	int cntAnswer(Board board11);
	List<Board> getSearchBoard(Board board);
}
