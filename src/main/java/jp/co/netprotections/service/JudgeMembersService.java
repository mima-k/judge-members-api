package jp.co.netprotections.service;

import org.springframework.stereotype.Service;
import jp.co.netprotections.dto.*;

@Service
public interface JudgeMembersService {
	public boolean judgeMemberCandidate(MemberCandidateRequestDto request);
	public MemberCandidatesListResponseDto judgedResult(MemberCandidatesListRequestDto listRequest);
}
