package edu.kh.admin.main.model.service;

import java.util.List;

import edu.kh.admin.main.model.dto.Board;
import edu.kh.admin.main.model.dto.Member;

public interface AdminService {

	/** 관리자 로그인
	 * @param inputMember
	 * @return
	 */
	Member login(Member inputMember);

	/** 탈퇴한 회원 목록 조회
	 * @return
	 */
	List<Member> selectWithdrawnMemberList();

	/** 탈퇴 회원 복구
	 * @param memberNo
	 * @return
	 */
	int restoreMember(int memberNo);

	List<Board> selectDeleteBoardList();

	int restoreBoard(int boardNo);

}
